package org.example;

import java.util.ArrayList;
import java.util.List;

public class BoardGamePub {

    private String location;

    private List<Game> games;

    public BoardGamePub(String location, List<Game> games) {
        this.location = location;
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        if (!games.contains(game)) {
            games.add(game);
        }
    }

    public void removeGame(Game game) {
        if (games.contains(game)) {
            games.remove(game);
        }
    }

    public List<Game> getFreeGames() {
        List<Game> freeGames = new ArrayList<Game>();
        for (Game game : games) {
            if (!game.isFree()) {
                freeGames.add(game);
            }
        }
        return freeGames;
    }


    public void startGame(Game game){
        if(game.getGameType().equals(GameType.PUZZLE)){
            if(game.getPlayers().size() == 1){
                game.setFree(true);
                System.out.println("The puzzle game has been started.");
            }else{
                System.out.println("Sorry there are not enough players.");
            }
        }else if(game.getGameType().equals(GameType.CARDGAME) && game.getGameType().equals(GameType.STORYTELLING)){
            if(game.getPlayers().size() < 1){
                game.setFree(true);
                System.out.println("Sorry there are not enough players.");
            }else{
                System.out.println("The game has been started.");
            }
        }
    }

    public void onSiteGame(Game game){
        if(game.getGameAvaliable().equals(GameAvaliable.ONSITE)){
            game.setLocation(location);
        }
    }


    public void stopGame(Game game){

    }

    //funkcja do sprawdzania czy w danym barze odbywa się gra Storytelling



}
