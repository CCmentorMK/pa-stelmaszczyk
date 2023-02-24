package org.example;

import org.example.game.*;
import org.example.helpers.ConsolePrinter;
import org.example.helpers.Printer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        BoardGamePub pub = new BoardGamePub("Warsaw, Street N. Mandela 23A", printer);
        List<Player> players = new ArrayList<>();

        Player Adrian = new Player("Adrian",1991);
        Player Tomek = new Player("Tomek",1997);

        Game puzzle = new Game("Puzzle",10,ComplexityType.EASY,GameType.PUZZLE, GamePlayability.ONSITE,pub.getLocation());
        Game poker = new Game("Poker", 60, ComplexityType.HARD, GameType.CARDGAME, GamePlayability.ONLINE,pub.getLocation());
        Game buildAFairytale = new Game("Build a Fairytale", 30, ComplexityType.HARD, GameType.STORYTELLING, GamePlayability.ONSITE,pub.getLocation());
        Game deathAtTheDiveBar = new Game("Death at The Dive Bar", 30, ComplexityType.HARD, GameType.STORYTELLING, GamePlayability.ONSITE,pub.getLocation());


        pub.addGame(buildAFairytale);
        pub.addGame(deathAtTheDiveBar);
        pub.addGame(poker);
        pub.addGame(puzzle);

        players.add(Adrian);
        players.add(Tomek);


        pub.startGame(buildAFairytale,players);
        pub.startGame(deathAtTheDiveBar,players);
        pub.startGame(poker,players);
        pub.startGame(puzzle,players);




    }
}