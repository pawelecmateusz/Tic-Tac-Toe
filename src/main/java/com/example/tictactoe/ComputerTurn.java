package com.example.tictactoe;

import java.util.Random;

import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.ValidMove.*;
import static com.example.tictactoe.PlaceMove.*;

public class ComputerTurn {
    static Random rand = new Random();
    static Move computerMove = new Move("");

    // CPU's random move for 3x3 game board.
    public static String getComputerMove3(Move move) {
        do {
            move.setMove(String.valueOf(rand.nextInt(9) + 1));
        } while (!isMoveValid3(gameBoard3, computerMove));
        placeMove3(gameBoard3, computerMove, fcCYAN + "X" + cRESET);
        return fcCYAN + move.getMove() + cRESET;
    }

    // CPU's random move for 5x5 game board.
    public static String getComputerMove5(Move move) {
        do {
            move.setMove(String.valueOf(rand.nextInt(25) + 1));
        } while (!isMoveValid5(gameBoard5, computerMove));
        placeMove5(gameBoard5, computerMove, fcCYAN + "~~" + cRESET);
        switch (move.getMove()) {
            case "1", "2", "3", "4", "5", "6", "7", "8", "9" -> {
                return fcCYAN + "0" + move.getMove() + cRESET;
            }
        }
        return fcCYAN + move.getMove() + cRESET;
    }
}