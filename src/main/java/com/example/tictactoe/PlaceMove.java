package com.example.tictactoe;

public class PlaceMove {

    //Get player's and CPU's move (numbers 1-9) and place their symbol in the right spot on the 3x3 game board
    public static void placeMove3(String[][] gameBoard3, Move move, String symbol) {
        switch (move.getMove()) {
            case "1" -> gameBoard3[0][0] = symbol;
            case "2" -> gameBoard3[0][1] = symbol;
            case "3" -> gameBoard3[0][2] = symbol;
            case "4" -> gameBoard3[1][0] = symbol;
            case "5" -> gameBoard3[1][1] = symbol;
            case "6" -> gameBoard3[1][2] = symbol;
            case "7" -> gameBoard3[2][0] = symbol;
            case "8" -> gameBoard3[2][1] = symbol;
            case "9" -> gameBoard3[2][2] = symbol;
            default -> System.out.println("Need a move.");
        }
    }

    // Get player's and CPU's move (numbers 01-25) and place their symbol in the right spot on the 5x5 game board
    public static void placeMove5(String[][] gameBoard5, Move move, String symbol) {
        switch (move.getMove()) {
            case "01", "1" -> gameBoard5[0][0] = symbol;
            case "02", "2" -> gameBoard5[0][1] = symbol;
            case "03", "3" -> gameBoard5[0][2] = symbol;
            case "04", "4" -> gameBoard5[0][3] = symbol;
            case "05", "5" -> gameBoard5[0][4] = symbol;
            case "06", "6" -> gameBoard5[1][0] = symbol;
            case "07", "7" -> gameBoard5[1][1] = symbol;
            case "08", "8" -> gameBoard5[1][2] = symbol;
            case "09", "9" -> gameBoard5[1][3] = symbol;
            case "10" -> gameBoard5[1][4] = symbol;
            case "11" -> gameBoard5[2][0] = symbol;
            case "12" -> gameBoard5[2][1] = symbol;
            case "13" -> gameBoard5[2][2] = symbol;
            case "14" -> gameBoard5[2][3] = symbol;
            case "15" -> gameBoard5[2][4] = symbol;
            case "16" -> gameBoard5[3][0] = symbol;
            case "17" -> gameBoard5[3][1] = symbol;
            case "18" -> gameBoard5[3][2] = symbol;
            case "19" -> gameBoard5[3][3] = symbol;
            case "20" -> gameBoard5[3][4] = symbol;
            case "21" -> gameBoard5[4][0] = symbol;
            case "22" -> gameBoard5[4][1] = symbol;
            case "23" -> gameBoard5[4][2] = symbol;
            case "24" -> gameBoard5[4][3] = symbol;
            case "25" -> gameBoard5[4][4] = symbol;
            default -> System.out.println("Need a move.");
        }
    }
}