package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int playingTime;
    private ComplexityType complexityType;
    private GameAvaliable gameAvaliable;
    private int minPlayers;
    private int maxPlayers;
    private GameType gameType;
    private String location;
    private List<Player> players;
    private boolean isFree;

    public Game(int playingTime, ComplexityType complexityType, int minPlayers, int maxPlayers, GameType gameType, String location, GameAvaliable gameAvaliable) {
        this.playingTime = playingTime;
        this.complexityType = complexityType;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.gameType = gameType;
        this.location = location;
        this.isFree = false;
        this.gameAvaliable = gameAvaliable;
        this.players = new ArrayList<>();
    }


    public GameAvaliable getGameAvaliable() {
        return gameAvaliable;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }


    public GameType getGameType() {
        return gameType;
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
