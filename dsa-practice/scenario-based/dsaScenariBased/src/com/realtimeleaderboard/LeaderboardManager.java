package com.realtimeleaderboard;

import java.util.ArrayDeque;

//class to manage leaderboard
public class LeaderboardManager {
	private static TreeData root = null;
	
	//method to add or update player
	public static void insertOrUpdatePlayer(String name, int score) {
		Player player = new Player(name, score);
		TreeData newNode = new TreeData(player);
		
		//checking if root is null
		if (root == null) {
			root = newNode;
			System.out.println("Player added successfully.");
			return;
		}
		
		TreeData node = root;
		
		//traversing the tree
		while (true) {
			
			//if current score is less than new node (higher score goes right)
			if (score > node.data.score) {
				if (node.right == null) {
					node.right = newNode;
					System.out.println("Player added successfully.");
					return;
				}
				node = node.right;
			}
			
			//if current score is greater than new node
			else if (score < node.data.score) {
				if (node.left == null) {
					node.left = newNode;
					System.out.println("Player added successfully.");
					return;
				}
				node = node.left;
			}
			
			//if score already exists, update player
			else {
				node.data.name = name;
				System.out.println("Player updated successfully.");
				return;
			}
		}
	}
	
	//method to delete a player
	public static void removePlayer(String name) {
		TreeData parent = null;
		TreeData current = root;
		
		//find the node to delete
		while (current != null && !current.data.name.equals(name)) {
			parent = current;
			
			//search in both subtrees since we don't know score
			TreeData leftResult = searchNode(current.left, name);
			if (leftResult != null) {
				current = current.left;
				break;
			}
			
			TreeData rightResult = searchNode(current.right, name);
			if (rightResult != null) {
				current = current.right;
				break;
			}
			
			System.out.println("Player not found");
			return;
		}
		
		//node not found
		if (current == null) {
			System.out.println("Player not found");
			return;
		}
		
		//case: node has TWO children
		if (current.left != null && current.right != null) {
			
			//find inorder successor
			TreeData successorParent = current;
			TreeData successor = current.right;
			
			while (successor.left != null) {
				successorParent = successor;
				successor = successor.left;
			}
			
			//copy successor data to current node
			current.data = successor.data;
			
			//now delete successor
			current = successor;
			parent = successorParent;
		}
		
		//case: node has ZERO or ONE child
		TreeData child;
		
		if (current.left != null) {
			child = current.left;
		} else {
			child = current.right;
		}
		
		//if deleting the ROOT
		if (parent == null) {
			root = child;
		}
		//if deleting non-root
		else if (parent.left == current) {
			parent.left = child;
		} else {
			parent.right = child;
		}
		
		System.out.println("Player removed successfully.");
	}
	
	//helper method to search node by name
	private static TreeData searchNode(TreeData node, String name) {
		if (node == null) {
			return null;
		}
		
		if (node.data.name.equals(name)) {
			return node;
		}
		
		TreeData left = searchNode(node.left, name);
		if (left != null) {
			return left;
		}
		
		return searchNode(node.right, name);
	}
	
	//showing top 10 players - reverse inorder traversal (highest score first)
	public static void showTopPlayers() {
		ArrayDeque<TreeData> stack = new ArrayDeque<>();
		TreeData node = root;
		int count = 0;
		
		System.out.printf("%-10s %-20s %-10s", "Rank", "Name", "Score");
		System.out.println();
		
		//reverse inorder (right -> root -> left)
		while ((node != null || !stack.isEmpty()) && count < 10) {
			while (node != null) {
				stack.push(node);
				node = node.right;
			}
			
			TreeData current = stack.pop();
			count++;
			System.out.printf("%-10d %-20s %-10d", count, current.data.name, current.data.score);
			System.out.println();
			
			node = current.left;
		}
	}
}
