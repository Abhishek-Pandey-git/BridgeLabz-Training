package com.songvault;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Song {
    String title;
    String artist;
    String duration;
    String genre;
    
    public Song(String title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }
}

public class SongVault {
    
    private static final Pattern FIELD_PATTERN = Pattern.compile("(\\w+):\\s*(.*)");
    
    public static void main(String[] args) {
        SongVault vault = new SongVault();
        vault.loadSongs("songs");
    }
    
    public void loadSongs(String directoryPath) {
        List<Song> songs = new ArrayList<>();
        File directory = new File(directoryPath);
        
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory not found: " + directoryPath);
            return;
        }
        
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files == null) return;
        
        for (File file : files) {
            try {
                Song song = parseSongFile(file);
                if (song != null) {
                    songs.add(song);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }
        
        displayResults(songs);
    }
    
    private Song parseSongFile(File file) throws IOException {
        Map<String, String> fields = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                Matcher matcher = FIELD_PATTERN.matcher(line);
                if (matcher.matches()) {
                    String key = matcher.group(1).toLowerCase();
                    String value = matcher.group(2).trim();
                    fields.put(key, value);
                }
            }
        }
        
        if (fields.containsKey("title") && fields.containsKey("artist")) {
            return new Song(
                fields.get("title"),
                fields.get("artist"),
                fields.getOrDefault("duration", "Unknown"),
                fields.getOrDefault("genre", "Unknown")
            );
        }
        
        return null;
    }
    
    private void displayResults(List<Song> songs) {
        System.out.println("=== SongVault Library ===\n");
        System.out.println("Total Songs: " + songs.size() + "\n");
        
        Map<String, List<Song>> genreMap = new HashMap<>();
        for (Song song : songs) {
            genreMap.putIfAbsent(song.genre, new ArrayList<>());
            genreMap.get(song.genre).add(song);
        }
        
        System.out.println("Songs by Genre:");
        for (Map.Entry<String, List<Song>> entry : genreMap.entrySet()) {
            System.out.println("\n" + entry.getKey() + " (" + entry.getValue().size() + " songs):");
            for (Song song : entry.getValue()) {
                System.out.println("  - " + song.title + " by " + song.artist + " [" + song.duration + "]");
            }
        }
        
        Set<String> uniqueArtists = new HashSet<>();
        for (Song song : songs) {
            uniqueArtists.add(song.artist);
        }
        
        System.out.println("\n\nUnique Artists (" + uniqueArtists.size() + "):");
        List<String> sortedArtists = new ArrayList<>(uniqueArtists);
        Collections.sort(sortedArtists);
        for (String artist : sortedArtists) {
            System.out.println("  - " + artist);
        }
        
        System.out.println("\n\nSongs sorted by Title:");
        List<Song> sortedSongs = songs.stream()
            .sorted((s1, s2) -> s1.title.compareTo(s2.title))
            .collect(Collectors.toList());
        
        for (Song song : sortedSongs) {
            System.out.println("  " + song.title + " - " + song.artist);
        }
    }
}
