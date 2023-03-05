package com.example.tictactoe;

import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.GameModesSrc.*;
import static com.example.tictactoe.MainMenu.*;
import static com.example.tictactoe.TicTacToeApplication.*;

public class Challenge {

    // Set Players names.
    public static void setNames() {
        System.out.println(" ");
        System.out.println(menuLine);
        System.out.println(fcPURPLE + " CHALLENGE\n * 1 v 1 *" + cRESET);
        System.out.println(menuLine + "\n");
        if (player1.getName().isEmpty() && player2.getName().isEmpty()) {
            System.out.println(fcYELLOW + "What's the name of " + fcGREEN + "player1" + fcYELLOW + "?"  + cRESET);
            player1.setName(fcGREEN + scanner.nextLine() + cRESET);
            System.out.println(fcYELLOW + "What's the name of " + fcCYAN + "player2" + fcYELLOW + "?"  + cRESET);
            player2.setName(fcCYAN + scanner.nextLine() + cRESET);
            System.out.println(" ");
        } else if (player2.getName().isEmpty()) {
            System.out.println(fcYELLOW + "What's the name of " + fcCYAN + "player2" + fcYELLOW + "?"  + cRESET);
            player2.setName(fcCYAN + scanner.nextLine() + cRESET);
            System.out.println(" ");
        }
    }

    // Challenge board choice.
    public static void playChallenge() throws InterruptedException {

        System.out.println(fcYELLOW + "Pick the size of the Board:");
        System.out.println("\nType 3 for 3x3\n3 in a row, in a column or diagonally wins the game\n" + cRESET);
        setTheBoard3(gameBoard3, board3Src);
        showBoard3(gameBoard3);
        System.out.println(fcYELLOW + "\nType 5 for 5x5\n4 in a row, in a column or diagonally wins the game\n" + cRESET);
        setTheBoard5(gameBoard5, board5Src);
        showBoard5(gameBoard5);

        while (true) {
            System.out.println(" ");
            choice = scanner.nextLine();
            System.out.println(" ");
            if (choice.equals("3") || choice.equals("5")) {
                if (choice.equals("3")) {
                    playChallenge3();
                    System.exit(0);
                } else {
                    playChallenge5();
                    System.exit(0);
                }
            }
            System.out.println(fcRED + "Wrong input" + cRESET);
        }
    }

    // Challenge 3x3
    public static void playChallenge3() throws InterruptedException {
        showBoard3(gameBoard3);
        while (true) {
            getPlayer1Choice3();
            showBoard3(gameBoard3);
            if (!(startNewGame3())){
                goBackToMenu();
            }
            getPlayer2Choice3();
            showBoard3(gameBoard3);
            if (!(startNewGame3())){
                goBackToMenu();
            }
        }
    }

    // Challenge 5x5
    public static void playChallenge5() throws InterruptedException {
        showSpidersAndSnakes();
        showBoard5(gameBoard5);
        while (true) {
            getPlayer1Choice5();
            showBoard5(gameBoard5);
            if (!(startNewGame5())) {
                goBackToMenu();
            }
            getPlayer2Choice5();
            showBoard5(gameBoard5);
            if (!(startNewGame5())) {
                goBackToMenu();
            }
        }
    }
}