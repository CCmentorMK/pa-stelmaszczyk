package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String nickname;
    private int age;
    private List<Game> gameHistory;


    public Player(String nickname, int age, List<Game> gameHistory) {
        this.nickname = nickname;
        this.age = age;
        this.gameHistory = new ArrayList<>();
    }

    public void addGameTohistory(Game game){
        gameHistory.add(game);
    }
}
