package com.example.tictactoe;

import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.MainMenu.*;
import static com.example.tictactoe.ValidMove.*;
import static com.example.tictactoe.TicTacToeApplication.*;

public class PlayerTurn {

    /* Take player's input and see if it's correct.
       If correct, see if it's possible to put player's symbol on the 3x3 game board. */
    public static void getPlayerMove3(Move move) throws InterruptedException {
        moveLoop:
        while (true) {
            move.setMove(scanner.next());
            wrongMoveLoop:
            switch (move.getMove()) {
                case "1", "2", "3", "4", "5", "6", "7", "8", "9" -> {
                    if (isMoveValid3(gameBoard3, move)) {
                        break moveLoop;
                    } else {
                        System.out.print(fcRED + move.getMove() + " is already taken" + fcPURPLE + "\nTry again: " + cRESET);
                    }
                }
                case "e" -> goBackToMenu();
                default -> System.out.print(fcRED + move.getMove() + " is not possible." + fcPURPLE + "\nTry again: " + cRESET);
            }
        }
    }

    /* Take player's input and see if it's correct.
       If correct, see if it's possible to put player's symbol on the 5x5 game board. */
    public static void getPlayerMove5(Move move) throws InterruptedException {
        moveLoop:
        while (true) {
            move.setMove(scanner.next());
            wrongMoveLoop:
            switch (move.getMove()) {
                case "01", "1", "02", "2", "03", "3", "04", "4", "05", "5", "06", "6", "07", "7", "08", "8", "09", "9", "10",
                        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" -> {
                    if (isMoveValid5(gameBoard5, move)) {
                        break moveLoop;
                    } else {
                        System.out.print(fcRED + move.getMove() + " is already taken" + fcPURPLE + "\nTry again: " + cRESET);
                    }
                }
                case "e" -> goBackToMenu();
                default -> System.out.print(fcRED + move.getMove() + " is not possible." + fcPURPLE + "\nTry again: " + cRESET);

            }
        }
    }
}