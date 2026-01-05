package com.linkedlist.singlylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Social media network using singly linked list.
 */
public class SocialMediaNetwork {
    private Node head;

    private static class Node {
        User data;
        Node next;
        Node(User data) { this.data = data; }
    }

    public void addUser(User user) {
        Node newNode = new Node(user);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public User findUserById(int userId) {
        Node current = head;
        while (current != null) {
            if (current.data.getUserId() == userId) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public User findUserByName(String name) {
        Node current = head;
        while (current != null) {
            if (current.data.getName().equalsIgnoreCase(name)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public boolean addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
            return true;
        }
        return false;
    }

    public boolean removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
            return true;
        }
        return false;
    }

    public List<Integer> findMutualFriends(int userId1, int userId2) {
        List<Integer> mutual = new ArrayList<>();
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            for (int friendId : user1.getFriendIds()) {
                if (user2.getFriendIds().contains(friendId)) {
                    mutual.add(friendId);
                }
            }
        }
        return mutual;
    }

    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Friends of " + user.getName() + ":");
        for (int friendId : user.getFriendIds()) {
            User friend = findUserById(friendId);
            if (friend != null) {
                System.out.println("  " + friend);
            }
        }
        System.out.println("Total friends: " + user.getFriendCount());
    }

    public void displayAllUsers() {
        if (head == null) {
            System.out.println("No users.");
            return;
        }
        Node current = head;
        System.out.println("All Users:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
