package com.example.tictactoe;

import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.ComputerTurn.*;
import static com.example.tictactoe.PlaceMove.*;
import static com.example.tictactoe.PlayerTurn.*;
import static com.example.tictactoe.TicTacToeApplication.scanner;
import static com.example.tictactoe.WinOrLose.*;
import static java.lang.Thread.sleep;

public class GameModesSrc {

    static Player player1 = new Player("");
    static Move player1Move = new Move("");

    static Player player2 = new Player("");
    static Move player2Move = new Move("");
    static String choice;

    // CPU's move for 5x5 board.
    public static void showComputerMove5() throws InterruptedException {
        sleep(500);
        System.out.print(fcPURPLE + "\nCPU's move is: " + cRESET);
        System.out.print(getComputerMove5(computerMove));
        sleep(500);
        System.out.println("\n");
        showBoard5(gameBoard5);
    }

    // Player1's move for 3x3 board.
    public static void getPlayer1Choice3() throws InterruptedException {
        System.out.println(fcRED + "     e - exit " + cRESET);
        System.out.print("\n" + player1.getName() + fcPURPLE + ", pick a number (1-9): " + cRESET);
        getPlayerMove3(player1Move);
        placeMove3(gameBoard3, player1Move, fcGREEN + "O" + cRESET);
        System.out.println(" ");
    }

    // Player2's move for 3x3 board.
    public static void getPlayer2Choice3() throws InterruptedException {
        System.out.println(fcRED + "     e - exit " + cRESET);
        System.out.print("\n" + player2.getName() + fcPURPLE + ", pick a number (1-9): " + cRESET);
        getPlayerMove3(player2Move);
        placeMove3(gameBoard3, player2Move, fcCYAN + "X" + cRESET);
        System.out.println(" ");
    }

    // Player1's move for 5x5 board.
    public static void getPlayer1Choice5() throws InterruptedException {
        System.out.println(fcRED + "             e - exit" + cRESET);
        System.out.print("\n" + player1.getName() + fcPURPLE + ", pick a number (01-25): " + cRESET);
        getPlayerMove5(player1Move);
        placeMove5(gameBoard5, player1Move, fcGREEN + "::" + cRESET);
        System.out.println(" ");
    }

    // Player2's move for 5x5 board.
    public static void getPlayer2Choice5() throws InterruptedException {
        System.out.println(fcRED + "             e - exit" + cRESET);
        System.out.print("\n" + player2.getName() + fcPURPLE + ", pick a number (01-25): " + cRESET);
        getPlayerMove5(player2Move);
        placeMove5(gameBoard5, player2Move, fcCYAN + "~~" + cRESET);
        System.out.println(" ");
    }

    // If 3x3 game is finished, start a new 3x3 game or quit.
    public static boolean startNewGame3() {
        if (isGameFinished3(gameBoard3)) {
            System.out.println(fcRED + "\nPlay again? (y/n)" + cRESET);
            while(true) {
                choice = scanner.nextLine();
                if (choice.equals("y")) {
                    setTheBoard3(gameBoard3, board3Src);
                    System.out.println(" ");
                    showBoard3(gameBoard3);
                    return true;
                } else if (choice.equals("n")) {
                    return false;
                }
                System.out.println(fcRED + "Yes or No?" + cRESET);
            }
        }
        return true;
    }

    // If 5x5 game is finished, start a new 5x5 game or quit.
    public static boolean startNewGame5() {
        if (isGameFinished5(gameBoard5)) {
            System.out.println(fcRED + "\nPlay again? (y/n)" + cRESET);
            while(true) {
                choice = scanner.nextLine();
                if (choice.equals("y")) {
                    setTheBoard5(gameBoard5, board5Src);
                    System.out.println(" ");
                    showBoard5(gameBoard5);
                    return true;
                } else if (choice.equals("n")) {
                    return false;
                }
                System.out.println(fcRED + "Yes or No?" + cRESET);
            }
        }
        return true;
    }
}