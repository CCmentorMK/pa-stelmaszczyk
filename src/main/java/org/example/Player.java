package org.example;

import org.example.game.Game;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String nickname;
    private final int yearOfBirth;
    private List<Game> gameHistory;


    public Player(String nickname, int yearOfBirth) {
        this.nickname = nickname;
        this.yearOfBirth = yearOfBirth;
        this.gameHistory = new ArrayList<>();
    }

    public void addGameToHistory(Game game){
        gameHistory.add(game);
    }

    public List<Game> getGameHistory() {
        return gameHistory;
    }
}
