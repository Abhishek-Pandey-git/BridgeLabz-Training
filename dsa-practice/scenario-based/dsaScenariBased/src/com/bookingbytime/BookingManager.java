package com.bookingbytime;

import java.util.ArrayDeque;

//class to manage event booking
public class BookingManager {
	private static TreeData root = null;
	
	//method to add event
	public static void insertEvent(int eventId, String eventName, String eventTime) {
		Event event = new Event(eventId, eventName, eventTime);
		TreeData newNode = new TreeData(event);
		
		//checking if root is null
		if (root == null) {
			root = newNode;
			System.out.println("Event added successfully.");
			return;
		}
		
		TreeData node = root;
		
		//traversing the tree
		while (true) {
			
			//comparing by eventTime (lexicographically)
			int comparison = eventTime.compareTo(node.data.eventTime);
			
			if (comparison > 0) {
				if (node.right == null) {
					node.right = newNode;
					System.out.println("Event added successfully.");
					return;
				}
				node = node.right;
			}
			
			else if (comparison < 0) {
				if (node.left == null) {
					node.left = newNode;
					System.out.println("Event added successfully.");
					return;
				}
				node = node.left;
			}
			
			else {
				System.out.println("Event time slot already exists");
				return;
			}
		}
	}
	
	//method to cancel event
	public static void cancelEvent(int eventId) {
		TreeData parent = null;
		TreeData current = root;
		
		//find the node to delete
		while (current != null && current.data.eventId != eventId) {
			parent = current;
			
			//search in left subtree
			TreeData leftResult = searchNode(current.left, eventId);
			if (leftResult != null) {
				//need to find parent of leftResult
				if (current.left != null && current.left.data.eventId == eventId) {
					current = current.left;
					break;
				}
				parent = current;
				current = current.left;
				continue;
			}
			
			//search in right subtree
			TreeData rightResult = searchNode(current.right, eventId);
			if (rightResult != null) {
				if (current.right != null && current.right.data.eventId == eventId) {
					current = current.right;
					break;
				}
				parent = current;
				current = current.right;
				continue;
			}
			
			System.out.println("Event not found");
			return;
		}
		
		//node not found
		if (current == null) {
			System.out.println("Event not found");
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
		
		System.out.println("Event cancelled successfully.");
	}
	
	//helper method to search node by eventId
	private static TreeData searchNode(TreeData node, int eventId) {
		if (node == null) {
			return null;
		}
		
		if (node.data.eventId == eventId) {
			return node;
		}
		
		TreeData left = searchNode(node.left, eventId);
		if (left != null) {
			return left;
		}
		
		return searchNode(node.right, eventId);
	}
	
	//showing events in upcoming order - inorder traversal
	public static void showEvents() {
		ArrayDeque<TreeData> stack = new ArrayDeque<>();
		TreeData node = root;
		
		System.out.printf("%-10s %-30s %-15s", "EventID", "EventName", "EventTime");
		System.out.println();
		
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			
			TreeData current = stack.pop();
			System.out.printf("%-10d %-30s %-15s", current.data.eventId, current.data.eventName, current.data.eventTime);
			System.out.println();
			
			node = current.right;
		}
	}
}
