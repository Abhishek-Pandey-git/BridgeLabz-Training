package com.musicLibrary;

import java.util.ArrayDeque;

//class to manage music library
public class MusicManager {
	private static TreeData root = null;
	
	//method to add the track
	public static void addTrack(int trackId, String title, String artist) {
		Track track = new Track(trackId, title, artist);
		
		TreeData newNode = new TreeData(track);
		
		//checking if the root is null and add current node there only
		if(root == null) {
			root = newNode;
			return;
		}
		
		TreeData node = root;
		
		//traversing the tree
		while(true) {
			
			//if current is smaller than new node
			if(newNode.data.trackId > node.data.trackId) {
				if(node.right == null) {
					node.right = newNode;
					return;
				}
				node = node.right;
			}
			
			//if current is greater then the new node
			else if(node.data.trackId > newNode.data.trackId) {
				if(node.left == null) {
					node.left = newNode;
					return;
				}
				node = node.left;
			}
			else {
				System.out.println("Track with this ID already exists");
				return;
			}
		}
		
	}
	
	
	//METHOD TO SEARCH A TRACK BY ID
	public static Track searchTrack(int trackId) {
		TreeData node = root;
		
		while(node != null) {
			if(trackId == node.data.trackId) {
				return node.data;
			}
			else if(trackId < node.data.trackId) {
				node = node.left;
			}
			else {
				node = node.right;
			}
		}
		
		return null; // Track not found
	}
	
	
	//SHOWING TRACKS IN SORTED ORDER BY TRACK ID - INORDER TRAVERSAL
	
	public static void showTracks() {
		
		///stack for traversal
		
		ArrayDeque<TreeData> stack = new ArrayDeque<>();
		TreeData node = root;
		
		System.out.printf("%-10s %-30s %-25s", "Track ID", "Song Title", "Artist");
		System.out.println();
		System.out.println("─────────────────────────────────────────────────────────────────");
		
		while(node != null || !stack.isEmpty()) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			
			TreeData current = stack.pop();
			System.out.printf("%-10d %-30s %-25s", current.data.trackId, current.data.title, current.data.artist);
			System.out.println();
			
			node = current.right;
		}
		
	}
	
	
	//SHOWING TRACKS ALPHABETICALLY BY SONG TITLE - INORDER TRAVERSAL ON TITLE-BASED TREE
	
	public static void showPlaylistAlphabetically() {
		
		// Build a new tree based on song titles
		TreeData titleRoot = buildTitleTree(root);
		
		///stack for traversal
		
		ArrayDeque<TreeData> stack = new ArrayDeque<>();
		TreeData node = titleRoot;
		
		System.out.printf("%-30s %-25s %-10s", "Song Title", "Artist", "Track ID");
		System.out.println();
		System.out.println("─────────────────────────────────────────────────────────────────");
		
		while(node != null || !stack.isEmpty()) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			
			TreeData current = stack.pop();
			System.out.printf("%-30s %-25s %-10d", current.data.title, current.data.artist, current.data.trackId);
			System.out.println();
			
			node = current.right;
		}
		
	}
	
	
	//HELPER METHOD TO BUILD A TREE BASED ON SONG TITLES
	private static TreeData buildTitleTree(TreeData node) {
		if(node == null) {
			return null;
		}
		
		TreeData newRoot = null;
		
		// Inorder traversal to collect all tracks
		ArrayDeque<TreeData> stack = new ArrayDeque<>();
		TreeData current = node;
		
		while(current != null || !stack.isEmpty()) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			
			TreeData temp = stack.pop();
			newRoot = insertByTitle(newRoot, temp.data);
			
			current = temp.right;
		}
		
		return newRoot;
	}
	
	
	//HELPER METHOD TO INSERT NODE BASED ON TITLE
	private static TreeData insertByTitle(TreeData root, Track track) {
		if(root == null) {
			return new TreeData(track);
		}
		
		if(track.title.compareToIgnoreCase(root.data.title) < 0) {
			root.left = insertByTitle(root.left, track);
		}
		else if(track.title.compareToIgnoreCase(root.data.title) > 0) {
			root.right = insertByTitle(root.right, track);
		}
		
		return root;
	}
}
