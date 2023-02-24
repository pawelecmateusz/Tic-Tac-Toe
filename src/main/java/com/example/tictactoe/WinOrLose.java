package com.example.tictactoe;

import static com.example.tictactoe.GameModesSrc.*;
import static com.example.tictactoe.WinConditions.*;
import static com.example.tictactoe.Colors.*;

public class WinOrLose {

    //3x3 board
    static String O = fcGREEN + "O" + cRESET;
    static String X = fcCYAN + "X" + cRESET;
    public static boolean isGameFinished3(String[][] theBoard3) {
        // Check who is the winner if there is one.
        if (isGameWon3(theBoard3, O)) {
            // player1 is the winner
            System.out.println("\n" + player1.getName() + fcGREEN + "! Congrats!\nYou've won!" + cRESET);
            return true;
            // the game is finished
        } else if (isGameWon3(theBoard3, X)) {
            if (!player2.getName().isEmpty()) {
                // player2 is the winner
                System.out.println("\n" + player2.getName() + fcCYAN + "! Congrats!\nYou've won!" + cRESET);
                return true;
                // the game is finished
            } else {
                // CPU is the winner
                System.out.println(fcCYAN + "\nThe computer has won!" + cRESET);
                return true;
                // the game is finished
            }
        }
        // Check if the game is finished with a tie.
        for (int i = 0; i < theBoard3.length; i++) {
            for (int n = 0; n < theBoard3[i].length; n++) {
                if (!(theBoard3[i][n].contains("O") || theBoard3[i][n].contains("X"))) {
                    // if the board is not entirely filled with both symbols
                    return false;
                    // the game is not finished
                }
            }
        }
        // if the board is entirely filled with both symbols but there is no winning configuration
        System.out.println(fcRED + "No winner." + cRESET);
        return true;
        // the game is finished
    }

    //5x5 board
    static String spider = fcGREEN + "::" + cRESET;
    static String snake = fcCYAN + "~~" + cRESET;
    public static boolean isGameFinished5(String[][] theBoard5) {
        // Check who is the winner if there is one.
        if (isGameWon5(theBoard5, spider)) {
            // player1 is the winner
            System.out.println("\n" + player1.getName() + fcGREEN + "! Congrats!\nThe spiders ate all of the snakes!" + cRESET);
            return true;
            // the game is finished
        } else if (isGameWon5(theBoard5, snake)) {
            if (!player2.getName().isEmpty()) {
                // player2 is the winner
                System.out.println("\n" + player2.getName() + fcCYAN + "! Congrats!\nThe snakes ate all of the spiders!" + cRESET);
                return true;
                // the game is finished
            } else {
                // CPU is the winner
                System.out.println(fcCYAN + "\nThe snakes ate all of the spiders!" + cRESET);
                return true;
                // the game is finished
            }
        }
        // Check if the game is finished with a tie.
        for (int i = 0; i < theBoard5.length; i++) {
            for (int n = 0; n < theBoard5[i].length; n++) {
                if (!(theBoard5[i][n].contains("::") || theBoard5[i][n].contains("~~"))) {
                    // if the board is not entirely filled with both symbols
                    return false;
                    // the game is not finished
                }
            }
        }
        // if the board is entirely filled with both symbols but there is no winning configuration
        System.out.println(fcRED + "No winner." + cRESET);
        return true;
        // the game is finished
    }
}