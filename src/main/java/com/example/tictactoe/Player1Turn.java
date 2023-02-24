package com.example.tictactoe;

import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.PlaceMove.*;
import static com.example.tictactoe.MainMenu.*;
import static com.example.tictactoe.ValidMove.*;
import static com.example.tictactoe.TicTacToeApplication.*;

public class Player1Turn {
    static String player1Move;

    /* Take player1's input and see if it's correct.
       If correct, see if it's possible to put player1's symbol on the 3x3 game board.
       If possible, place the symbol in the right spot on the 3x3 game board. */
    public static String getPlayer1Move3() throws InterruptedException {
        while (true) {
            player1Move = scanner.nextLine();
            if (player1Move.equals("1") || player1Move.equals("2") || player1Move.equals("3") ||
                player1Move.equals("4") || player1Move.equals("5") || player1Move.equals("6") ||
                player1Move.equals("7") || player1Move.equals("8") || player1Move.equals("9") ||
                player1Move.equals("e")){
                if (isMoveValid3(gameBoard3, player1Move)) {
                    break;
                } else if (player1Move.equals("e")) {
                    goBackToMenu();
                } else {
                    System.out.print(fcRED + player1Move + " is already taken" + fcPURPLE + "\nTry again: " + cRESET);
                }
            } else {
                System.out.print(fcRED + player1Move + " is not possible." + fcPURPLE + "\nTry again: " + cRESET);
            }
        }
        placeMove3(gameBoard3, player1Move, fcGREEN + "O" + cRESET);
        return fcGREEN + player1Move + cRESET;
    }

    /* Take player1's input and see if it's correct.
       If correct, see if it's possible to put player1's symbol on the 5x5 game board.
       If possible, place the symbol in the right spot on the 5x5 game board. */
    public static String getPlayer1Move5() throws InterruptedException {
        while (true) {
            player1Move = scanner.nextLine();
            if (player1Move.equals("01") || player1Move.equals("1") || player1Move.equals("02") || player1Move.equals("2") || player1Move.equals("03") || player1Move.equals("3") || player1Move.equals("04") || player1Move.equals("4") || player1Move.equals("05") || player1Move.equals("5") ||
                player1Move.equals("06") || player1Move.equals("6") || player1Move.equals("07") || player1Move.equals("7") || player1Move.equals("08") || player1Move.equals("8") || player1Move.equals("09") || player1Move.equals("9") || player1Move.equals("10") ||
                player1Move.equals("11") || player1Move.equals("12") || player1Move.equals("13") || player1Move.equals("14") || player1Move.equals("15") ||
                player1Move.equals("16") || player1Move.equals("17") || player1Move.equals("18") || player1Move.equals("19") || player1Move.equals("20") ||
                player1Move.equals("21") || player1Move.equals("22") || player1Move.equals("23") || player1Move.equals("24") || player1Move.equals("25") ||
                player1Move.equals("e")){
                if (isMoveValid5(gameBoard5, player1Move)) {
                    break;
                } else if (player1Move.equals("e")) {
                    goBackToMenu();
                } else {
                    System.out.print(fcRED + player1Move + " is already taken" + fcPURPLE + "\nTry again: " + cRESET);
                }
            } else {
                System.out.print(fcRED + player1Move + " is not possible." + fcPURPLE + "\nTry again: " + cRESET);
            }
        }
        placeMove5(gameBoard5, player1Move, fcGREEN + "::" + cRESET);
        return fcGREEN + player1Move + cRESET;
    }
}