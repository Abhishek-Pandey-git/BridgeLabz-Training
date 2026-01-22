package com.universityrecord;

import  java.util.ArrayDeque;
//class to manage record
public class RecordManager {
	 private static TreeData root=null;
	 
	 //method to add the student
	 public static void addStudent(int number,String name) {
		 Student st=new Student(number, name);
		 
		 TreeData newNode=new TreeData(st);
		 
		 //checking if the root is null and add current node there only
		 if(root==null) {
			 root=newNode;
			 return;
		 }
		 
		 TreeData node=root;
		 
		 //traversing the tree
		 while(true) {
			 
			 //if current is smaller than new node
			 if(newNode.data.roll>node.data.roll) {
				 if(node.right==null) {
					 node.right=newNode;
					 return;
				 }
				 node=node.right;
			 }
			 
			 //if current is greater then the new node
			 else if(node.data.roll>newNode.data.roll) {
				 if(node.left==null) {
					 node.left=newNode;
					 return;
				 }
				 node=node.left;
			 }
			 else {
				 System.out.println("Record Already exist");
				 return;
			 }
		 }
		 
	 }
	 
	 
	 //METHOD TO DELETE A student
	 public static void deleteStudent(int roll) {

		    TreeData parent = null;
		    TreeData current = root;

		    // Find the node to delete
		    while (current != null && current.data.roll != roll) {
		        parent = current;

		        if (roll < current.data.roll) {
		            current = current.left;
		        } else {
		            current = current.right;
		        }
		    }

		    // Node not found
		    if (current == null) {
		        System.out.println("Record not found");
		        return;
		    }

		    // Case: node has TWO children
		    if (current.left != null && current.right != null) {

		        // Find inorder successor (smallest in right subtree)
		        TreeData successorParent = current;
		        TreeData successor = current.right;

		        while (successor.left != null) {
		            successorParent = successor;
		            successor = successor.left;
		        }

		        // Copy successor data to current node
		        current.data = successor.data;

		        // Now delete successor instead
		        current = successor;
		        parent = successorParent;
		    }

		    // Case: node has ZERO or ONE child
		    TreeData child;

		    if (current.left != null) {
		        child = current.left;
		    } else {
		        child = current.right;
		    }

		    //  If deleting the ROOT
		    if (parent == null) {
		        root = child;
		    }
		    // If deleting non-root
		    else if (parent.left == current) {
		        parent.left = child;
		    }
		    else {
		        parent.right = child;
		    }
		}

	 
	 //SHOWING STUDENTS WITH THEIR ROLL NUMBER SERIAL SORTED - INORDER TRAVERSAL-
	 
	 public static void showStudent() {
		 
		 ///stack for traversal
		
		 ArrayDeque<TreeData> stack=new ArrayDeque<>();
		 TreeData node=root;
		 
		 System.out.printf("%-10s %-20s","RollNo","Name" );
		 System.out.println();
		 while(node!=null || !stack.isEmpty()) {
			 while(node!=null) {
				 stack.push(node);
				 node=node.left;
			 }
			 
			 TreeData current=stack.pop();
			 System.out.printf("%-10d %-20s",current.data.roll,current.data.name );
			 System.out.println();
			 
			 node=current.right;
		 }
		 
	 }	
}
