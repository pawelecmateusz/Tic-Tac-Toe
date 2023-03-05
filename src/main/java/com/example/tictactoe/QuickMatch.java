package com.example.tictactoe;

import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.ComputerTurn.*;
import static com.example.tictactoe.GameModesSrc.*;
import static com.example.tictactoe.MainMenu.*;
import static com.example.tictactoe.TicTacToeApplication.*;
import static com.example.tictactoe.WinOrLose.*;
import static java.lang.Thread.sleep;

public class QuickMatch {

    // Quick Match board choice.
    public static void playQuickMatch() throws InterruptedException {
        System.out.println(" ");
        System.out.println(menuLine);
        System.out.println(fcGREEN + "Quick Match\n     v\n  * CPU *" + cRESET);
        System.out.println(menuLine + "\n");
        if (player1.getName().isEmpty()) {
            System.out.println(fcYELLOW + "What's your name?" + cRESET);
            player1.setName(fcGREEN + scanner.nextLine() + cRESET);
            System.out.println(" ");
        }

        System.out.println(fcYELLOW + "Pick the size of the Board:");
        System.out.println("\nType 3 for 3x3\n3 in a row, in a column or diagonally wins the game\n" + cRESET);
        setTheBoard3(gameBoard3, board3Src);
        showBoard3(gameBoard3);
        System.out.println(fcYELLOW + "\nType 5 for 5x5\n4 in a row, in a column or diagonally wins the game\nThe player has 1 turn and CPU has 3 turns!\n" + cRESET);
        setTheBoard5(gameBoard5, board5Src);
        showBoard5(gameBoard5);

        while (true) {
            System.out.println(" ");
            choice = scanner.nextLine();
            System.out.println(" ");
            if (choice.equals("3") || choice.equals("5")) {
                if (choice.equals("3")) {
                    playQuickMatch3();
                    System.exit(0);
                } else {
                    playQuickMatch5();
                    System.exit(0);
                }
            }
            System.out.println(fcRED + "Wrong input" + cRESET);
        }
    }

    // Quick Match 3x3.
    public static void playQuickMatch3() throws InterruptedException {
        showBoard3(gameBoard3);
        while (true) {
            getPlayer1Choice3();
            showBoard3(gameBoard3);
            if (!(startNewGame3())){
                goBackToMenu();
            }
            sleep(500);
            System.out.println(" ");
            System.out.print(fcPURPLE + "CPU's move is: " + cRESET);
            System.out.print(getComputerMove3(computerMove));
            sleep(500);
            System.out.println("\n");
            showBoard3(gameBoard3);
            if (!(startNewGame3())){
                goBackToMenu();
            }
        }
    }

    // Quick Match 5x5.
    public static void playQuickMatch5() throws InterruptedException {
        showSpidersAndSnakes();
        showBoard5(gameBoard5);
        while (true) {
            getPlayer1Choice5();
            showBoard5(gameBoard5);
            if (!(startNewGame5())) {
                goBackToMenu();
            }
            showComputerMove5();
            if (isGameFinished5(gameBoard5)) {
                System.out.println(fcRED + "\nPlay again? (y/n)" + cRESET);
                while (true) {
                    choice = scanner.nextLine();
                    if (choice.equals("y")) {
                        setTheBoard5(gameBoard5, board5Src);
                        showComputerMove5();
                        break;
                    } else if (choice.equals("n")) {
                        goBackToMenu();
                    }
                    System.out.println(fcRED + "Yes or No?" + cRESET);
                }
            }
            showComputerMove5();
            if (isGameFinished5(gameBoard5)) {
                System.out.println(fcRED + "\nPlay again? (y/n)" + cRESET);
                while (true) {
                    choice = scanner.nextLine();
                    if (choice.equals("y")) {
                        setTheBoard5(gameBoard5, board5Src);
                        showComputerMove5();
                        showComputerMove5();
                        break;
                    } else if (choice.equals("n")) {
                        goBackToMenu();
                    }
                    System.out.println(fcRED + "Yes or No?" + cRESET);
                }
            }
            showComputerMove5();
            if (!(startNewGame5())){
                goBackToMenu();
            }
        }
    }
}