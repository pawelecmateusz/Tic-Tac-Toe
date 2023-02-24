package com.example.tictactoe;

import java.util.Random;

import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.ValidMove.*;
import static com.example.tictactoe.PlaceMove.*;

public class ComputerTurn {
    static Random rand = new Random();
    static String computerMove;

    // CPU's random move for 3x3 game board.
    public static String getComputerMove3() {
        do {
            computerMove = String.valueOf(rand.nextInt(9) + 1);
        } while (!isMoveValid3(gameBoard3, computerMove));
        placeMove3(gameBoard3, computerMove, fcCYAN + "X" + cRESET);
        return fcCYAN + computerMove + cRESET;
    }

    // CPU's random move for 5x5 game board.
    public static String getComputerMove5() {
        do {
            computerMove = String.valueOf(rand.nextInt(25) + 1);
        } while (!isMoveValid5(gameBoard5, computerMove));
        placeMove5(gameBoard5, computerMove, fcCYAN + "~~" + cRESET);
        if (computerMove.equals("1") || computerMove.equals("2") || computerMove.equals("3") ||
            computerMove.equals("4") || computerMove.equals("5") || computerMove.equals("6") ||
            computerMove.equals("7") || computerMove.equals("8") || computerMove.equals("9")) {
            return fcCYAN + "0" + computerMove + cRESET;
        }
        return fcCYAN + computerMove + cRESET;
    }
}