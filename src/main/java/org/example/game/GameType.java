package org.example.game;

public enum GameType {
    PUZZLE(1,1),
    STORYTELLING(2,6),
    CARDGAME(2,8);


    private final int minPlayers;
    private final int maxPlayers;

    GameType(int minPlayers, int maxPlayers) {
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}
