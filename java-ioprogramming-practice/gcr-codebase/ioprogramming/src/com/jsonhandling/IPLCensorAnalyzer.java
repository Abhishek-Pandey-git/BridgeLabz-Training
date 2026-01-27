package com.jsonhandling;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class IPLCensorAnalyzer {
    
    public static void main(String[] args) {
        IPLCensorAnalyzer analyzer = new IPLCensorAnalyzer();
        
        analyzer.processJsonFile("ipl_matches.json", "ipl_matches_censored.json");
        analyzer.processCsvFile("ipl_matches.csv", "ipl_matches_censored.csv");
    }
    
    private void processJsonFile(String inputFile, String outputFile) {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader(inputFile)) {
            JSONArray matches = (JSONArray) parser.parse(reader);
            JSONArray censoredMatches = new JSONArray();
            
            for (Object obj : matches) {
                JSONObject match = (JSONObject) obj;
                JSONObject censoredMatch = censorMatch(match);
                censoredMatches.add(censoredMatch);
            }
            
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write(censoredMatches.toJSONString());
                System.out.println("JSON file censored successfully: " + outputFile);
            }
            
        } catch (IOException | ParseException e) {
            System.out.println("Error processing JSON: " + e.getMessage());
        }
    }
    
    private JSONObject censorMatch(JSONObject match) {
        JSONObject censored = new JSONObject();
        
        censored.put("match_id", match.get("match_id"));
        censored.put("team1", censorTeamName((String) match.get("team1")));
        censored.put("team2", censorTeamName((String) match.get("team2")));
        
        JSONObject originalScore = (JSONObject) match.get("score");
        JSONObject censoredScore = new JSONObject();
        for (Object key : originalScore.keySet()) {
            String teamName = (String) key;
            censoredScore.put(censorTeamName(teamName), originalScore.get(teamName));
        }
        censored.put("score", censoredScore);
        
        censored.put("winner", censorTeamName((String) match.get("winner")));
        censored.put("player_of_match", "REDACTED");
        
        return censored;
    }
    
    private String censorTeamName(String teamName) {
        String[] words = teamName.split(" ");
        if (words.length > 1) {
            return words[0] + " ***";
        }
        return teamName;
    }
    
    private void processCsvFile(String inputFile, String outputFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            
            String headerLine = br.readLine();
            bw.write(headerLine);
            bw.newLine();
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                
                values[1] = censorTeamName(values[1]);
                values[2] = censorTeamName(values[2]);
                values[5] = censorTeamName(values[5]);
                values[6] = "REDACTED";
                
                bw.write(String.join(",", values));
                bw.newLine();
            }
            
            System.out.println("CSV file censored successfully: " + outputFile);
            
        } catch (IOException e) {
            System.out.println("Error processing CSV: " + e.getMessage());
        }
    }
}
