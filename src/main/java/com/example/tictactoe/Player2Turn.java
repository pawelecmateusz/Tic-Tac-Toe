package com.example.tictactoe;

import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.MainMenu.*;
import static com.example.tictactoe.PlaceMove.*;
import static com.example.tictactoe.ValidMove.*;
import static com.example.tictactoe.TicTacToeApplication.*;

public class Player2Turn {
    static String player2Move;

    /* Take player1's input and see if it's correct.
       If correct, see if it's possible to put player1's symbol on the 3x3 game board.
       If possible, place the symbol in the right spot on the 3x3 game board. */
    public static String getPlayer2Move3() throws InterruptedException {

        while (true) {
            player2Move = scanner.nextLine();
            if (player2Move.equals("1") || player2Move.equals("2") || player2Move.equals("3") ||
                player2Move.equals("4") || player2Move.equals("5") || player2Move.equals("6") ||
                player2Move.equals("7") || player2Move.equals("8") || player2Move.equals("9") ||
                player2Move.equals("e")){
                if (isMoveValid3(gameBoard3, player2Move)) {
                    break;
                } else if (player2Move.equals("e")) {
                    goBackToMenu();
                } else {
                    System.out.print(fcRED + player2Move + " is already taken" + fcPURPLE + "\nTry again: " + cRESET);
                }
            } else {
                System.out.print(fcRED + player2Move + " is not possible." + fcPURPLE + "\nTry again: " + cRESET);
            }
        }
        placeMove3(gameBoard3, player2Move, fcCYAN + "X" + cRESET);
        return fcCYAN + player2Move + cRESET;
    }

    /* Take player1's input and see if it's correct.
       If correct, see if it's possible to put player1's symbol on the 5x5 game board.
       If possible, place the symbol in the right spot on the 5x5 game board. */
    public static String getPlayer2Move5() throws InterruptedException {

        while (true) {
            player2Move = scanner.nextLine();
            if (player2Move.equals("01") || player2Move.equals("1") || player2Move.equals("02") || player2Move.equals("2") || player2Move.equals("03") || player2Move.equals("3") || player2Move.equals("04") || player2Move.equals("4") || player2Move.equals("05") || player2Move.equals("5") ||
                player2Move.equals("06") || player2Move.equals("6") || player2Move.equals("07") || player2Move.equals("7") || player2Move.equals("08") || player2Move.equals("8") || player2Move.equals("09") || player2Move.equals("9") || player2Move.equals("10") ||
                player2Move.equals("11") || player2Move.equals("12") || player2Move.equals("13") || player2Move.equals("14") || player2Move.equals("15") ||
                player2Move.equals("16") || player2Move.equals("17") || player2Move.equals("18") || player2Move.equals("19") || player2Move.equals("20") ||
                player2Move.equals("21") || player2Move.equals("22") || player2Move.equals("23") || player2Move.equals("24") || player2Move.equals("25") ||
                player2Move.equals("e")){
                if (isMoveValid5(gameBoard5, player2Move)) {
                    break;
                } else if (player2Move.equals("e")) {
                    goBackToMenu();
                } else {
                    System.out.print(fcRED + player2Move + " is already taken" + fcPURPLE + "\nTry again: " + cRESET);
                }
            } else {
                System.out.print(fcRED + player2Move + " is not possible." + fcPURPLE + "\nTry again: " + cRESET);
            }
        }
        placeMove5(gameBoard5, player2Move, fcCYAN + "~~" + cRESET);
        return fcCYAN + player2Move + cRESET;
    }
}