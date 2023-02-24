package org.example.game;

public class Game {
    private final String name;
    private final int playingTime;
    private final ComplexityType complexityType;
    private final GamePlayability gamePlayability;
    private final GameType gameType;
    private String location;
    private boolean gameStatus;

    public Game(String name, int playingTime, ComplexityType complexityType, GameType gameType, GamePlayability gamePlayability,String location) {
        this.name = name;
        this.playingTime = playingTime;
        this.complexityType = complexityType;
        this.gameType = gameType;
        this.gameStatus = false;
        this.gamePlayability = gamePlayability;
        if(gamePlayability == GamePlayability.ONSITE){
            if(location.equals(null) && location.trim().isEmpty()){
                throw new IllegalArgumentException("Location cannot be null or empty for onsite game.");
            }else{
                this.location = location;
            }
        }else{
            this.location = null;
        }
    }

    public GamePlayability getGamePlayability() {
        return gamePlayability;
    }

    public boolean getGameStatus() {
        return gameStatus;
    }

    public void changeGameStatus(boolean status) {
        this.gameStatus = status;
    }

    public GameType getGameType() {
        return gameType;
    }

    public int getMinPlayers() {
        return gameType.getMinPlayers();
    }

    public int getMaxPlayers() {
        return gameType.getMaxPlayers();
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
