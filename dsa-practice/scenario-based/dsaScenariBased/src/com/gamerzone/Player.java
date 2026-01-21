package com.gamerzone;

// Player with score
public class Player {
    private String username;
    private int score;
    
    public Player(String username, int score) {
        this.username = username;
        this.score = score;
    }
    
    public String getUsername() {
        return username;
    }
    
    public int getScore() {
        return score;
    }
    
    @Override
    public String toString() {
        return username + ": " + score + " points";
    }
}
