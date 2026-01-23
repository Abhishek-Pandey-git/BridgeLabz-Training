package com.hospitalqueuemanagement;

import java.util.ArrayDeque;

//class to manage hospital queue
public class QueueManager {
	private static TreeData root = null;
	
	//method to register patient
	public static void registerPatient(int patientId, String name, String checkInTime) {
		Patient patient = new Patient(patientId, name, checkInTime);
		TreeData newNode = new TreeData(patient);
		
		//checking if root is null
		if (root == null) {
			root = newNode;
			System.out.println("Patient registered successfully.");
			return;
		}
		
		TreeData node = root;
		
		//traversing the tree
		while (true) {
			
			//comparing by checkInTime
			int comparison = checkInTime.compareTo(node.data.checkInTime);
			
			if (comparison > 0) {
				if (node.right == null) {
					node.right = newNode;
					System.out.println("Patient registered successfully.");
					return;
				}
				node = node.right;
			}
			
			else if (comparison < 0) {
				if (node.left == null) {
					node.left = newNode;
					System.out.println("Patient registered successfully.");
					return;
				}
				node = node.left;
			}
			
			else {
				System.out.println("Check-in time already exists");
				return;
			}
		}
	}
	
	//method to discharge patient
	public static void dischargePatient(int patientId) {
		TreeData parent = null;
		TreeData current = root;
		
		//find the node to delete
		while (current != null && current.data.patientId != patientId) {
			parent = current;
			
			//search in left subtree
			TreeData leftResult = searchNode(current.left, patientId);
			if (leftResult != null) {
				if (current.left != null && current.left.data.patientId == patientId) {
					current = current.left;
					break;
				}
				parent = current;
				current = current.left;
				continue;
			}
			
			//search in right subtree
			TreeData rightResult = searchNode(current.right, patientId);
			if (rightResult != null) {
				if (current.right != null && current.right.data.patientId == patientId) {
					current = current.right;
					break;
				}
				parent = current;
				current = current.right;
				continue;
			}
			
			System.out.println("Patient not found");
			return;
		}
		
		//node not found
		if (current == null) {
			System.out.println("Patient not found");
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
		
		System.out.println("Patient discharged successfully.");
	}
	
	//helper method to search node by patientId
	private static TreeData searchNode(TreeData node, int patientId) {
		if (node == null) {
			return null;
		}
		
		if (node.data.patientId == patientId) {
			return node;
		}
		
		TreeData left = searchNode(node.left, patientId);
		if (left != null) {
			return left;
		}
		
		return searchNode(node.right, patientId);
	}
	
	//showing patients by arrival time - inorder traversal
	public static void showPatients() {
		ArrayDeque<TreeData> stack = new ArrayDeque<>();
		TreeData node = root;
		
		System.out.printf("%-12s %-25s %-15s", "PatientID", "Name", "CheckInTime");
		System.out.println();
		
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			
			TreeData current = stack.pop();
			System.out.printf("%-12d %-25s %-15s", current.data.patientId, current.data.name, current.data.checkInTime);
			System.out.println();
			
			node = current.right;
		}
	}
}
