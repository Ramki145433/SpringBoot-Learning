package com.example.learningSpringBoot.Entity;

public class Sport {
    private int id;
    private String sportName;
    private String playerName;

    public Sport() {};

    public Sport(int id, String sportName, String playerName) {
        this.id = id;
        this.sportName = sportName;
        this.playerName = playerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
