package com.example.tictactoe;

import java.util.Scanner;

import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.Board.*;
import static com.example.tictactoe.PlaceMove.*;
import static com.example.tictactoe.ValidMove.*;

public class PlayerTurn {

    static Scanner scanner = new Scanner(System.in);
    static String playerMove;

    public static String getPlayerMove() {

        while (true) {
            playerMove = scanner.nextLine();
            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3") ||
                    playerMove.equals("4") || playerMove.equals("5") || playerMove.equals("6") ||
                    playerMove.equals("7") || playerMove.equals("8") || playerMove.equals("9")) {
                if (isMoveValid(theBoard, playerMove)) {
                    break;
                } else {
                    System.out.print(tcRED + playerMove + " is already taken" + tcPURPLE + "\nTry again: " + cRESET);
                }
            } else {
                System.out.print(tcRED + playerMove + " is not possible." + tcPURPLE + "\nTry again: " + cRESET);
            }
        }
        placeMove(theBoard, playerMove, tcGREEN + "O" + cRESET);
        return tcGREEN + playerMove + cRESET;
    }
}