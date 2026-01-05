package com.linkedlist.singlylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * User in a social media network with friends list.
 */
public class User {
    private final int userId;
    private final String name;
    private final int age;
    private final List<Integer> friendIds;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public List<Integer> getFriendIds() { return friendIds; }

    public void addFriend(int friendId) {
        if (!friendIds.contains(friendId)) {
            friendIds.add(friendId);
        }
    }

    public boolean removeFriend(int friendId) {
        return friendIds.remove(Integer.valueOf(friendId));
    }

    public int getFriendCount() {
        return friendIds.size();
    }

    @Override
    public String toString() {
        return "User[ID:" + userId + ", Name:" + name + ", Age:" + age 
                + ", Friends:" + friendIds.size() + "]";
    }
}
