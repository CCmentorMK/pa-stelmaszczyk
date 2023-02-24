package org.example;

import org.example.game.Game;
import org.example.game.GameType;
import org.example.helpers.Printer;

import java.util.ArrayList;
import java.util.List;

public class BoardGamePub {
    private String location;
    private boolean storytellingInProgress;
    private Printer printer;
    private List<Game> games;

    public BoardGamePub(String location, Printer printer) {
        this.location = location;
        this.printer = printer;
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
        List<Game> availableGames = new ArrayList<>();
        for (Game game : games) {
            if (!game.getGameStatus()) {
                availableGames.add(game);
            }
        }
        return availableGames;
    }

    public void startGame(Game game, List<Player> players) {
        if(!checkIfGameCanStartWithPlayers(game,players)){
            printer.info("There are not enough players to start" + game.getName() );
            return;
        }

        if(game.getGameType() == GameType.STORYTELLING) {
            if (!storytellingInProgress) {
                storytellingInProgress = true;
            }else{
                printer.info("The storytelling game is really fun and loud, so they can't be played simultaneously in the same pub. You have to wait until it's over.");
                return;
            }
        }

        game.changeGameStatus(true);
        addGameToPlayerGameHistory(game, players);
        printer.info(game.getName() + " game has been started.");
    }


    private void addGameToPlayerGameHistory(Game game, List<Player> players) {
        for(Player player : players){
            player.addGameToHistory(game);
        }
    }

    private boolean checkIfGameCanStartWithPlayers(Game game, List<Player> players) {
        return players.size() >= game.getMinPlayers() && players.size() <= game.getMaxPlayers();
    }

    public void endGame(Game game){
        game.changeGameStatus(false);
        if(game.getGameType() == GameType.STORYTELLING) {
            storytellingInProgress = false;
        }
    }

    public String getLocation() {
        return location;
    }
}
