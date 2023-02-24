package com.example.tictactoe;

import static com.example.tictactoe.Colors.*;

public abstract class Board {

    // 3x3 game board.
    static String[][] gameBoard3 = {{"1", "2", "3"},
                                    {"4", "5", "6"},
                                    {"7", "8", "9"}};

    // 3x3 source board for copy(board reset).
    static String[][] board3Src = {{"1", "2", "3"},
                                   {"4", "5", "6"},
                                   {"7", "8", "9"}};

    // 5x5 game board.
    static String[][] gameBoard5 = {{"01", "02", "03", "04", "05"},
                                    {"06", "07", "08", "09", "10"},
                                    {"11", "12", "13", "14", "15"},
                                    {"16", "17", "18", "19", "20"},
                                    {"21", "22", "23", "24", "25"}};

    // 5x5 source board for copy(board reset).
    static String[][] board5Src = {{"01", "02", "03", "04", "05"},
                                   {"06", "07", "08", "09", "10"},
                                   {"11", "12", "13", "14", "15"},
                                   {"16", "17", "18", "19", "20"},
                                   {"21", "22", "23", "24", "25"}};

    // Reset 3x3 board by copying values from source board to game board.
    public static void setTheBoard3(String[][] gameBoard3, String[][] board3Src) {
        for (int row = 0; row < gameBoard3.length; row++) {
            System.arraycopy(board3Src[row], 0, gameBoard3[row], 0, gameBoard3[row].length);
        }
    }

    // Reset 5x5 board by copying values from source board to game board.
    public static void setTheBoard5(String[][] gameBoard5, String[][] board5Src) {
        for (int row = 0; row < gameBoard5.length; row++) {
            System.arraycopy(board5Src[row], 0, gameBoard5[row], 0, gameBoard5[row].length);
        }
    }

    // Board frame and borders.
    static String thePipe = fcRED + "  |  " + cRESET;
    static String thePipeLeft = fcRED + "|  " + cRESET;
    static String thePipeRight = fcRED + "  |" + cRESET;
    static String theLine3 = fcRED + "* --- * --- * --- *" + cRESET;
    static String theLine5 = fcRED + "*  --  *  --  *  --  *  --  *  --  *" + cRESET;

    // Visual representation of 3x3 game board.
    public static void showBoard3(String[][] theBoard) {
        System.out.println(theLine3);
        System.out.println(thePipeLeft + theBoard[0][0] + thePipe + theBoard[0][1] + thePipe + theBoard[0][2] + thePipeRight);
        System.out.println(theLine3);
        System.out.println(thePipeLeft + theBoard[1][0] + thePipe + theBoard[1][1] + thePipe + theBoard[1][2] + thePipeRight);
        System.out.println(theLine3);
        System.out.println(thePipeLeft + theBoard[2][0] + thePipe + theBoard[2][1] + thePipe + theBoard[2][2] + thePipeRight);
        System.out.println(theLine3);
    }

    // Visual representation of 5x5 game board.
    public static void showBoard5(String[][] theBoard5) {
        System.out.println(theLine5);
        System.out.println(thePipeLeft + theBoard5[0][0] + thePipe + theBoard5[0][1] + thePipe + theBoard5[0][2] + thePipe + theBoard5[0][3] + thePipe + theBoard5[0][4] + thePipeRight);
        System.out.println(theLine5);
        System.out.println(thePipeLeft + theBoard5[1][0] + thePipe + theBoard5[1][1] + thePipe + theBoard5[1][2] + thePipe + theBoard5[1][3] + thePipe + theBoard5[1][4] + thePipeRight);
        System.out.println(theLine5);
        System.out.println(thePipeLeft + theBoard5[2][0] + thePipe + theBoard5[2][1] + thePipe + theBoard5[2][2] + thePipe + theBoard5[2][3] + thePipe + theBoard5[2][4] + thePipeRight);
        System.out.println(theLine5);
        System.out.println(thePipeLeft + theBoard5[3][0] + thePipe + theBoard5[3][1] + thePipe + theBoard5[3][2] + thePipe + theBoard5[3][3] + thePipe + theBoard5[3][4] + thePipeRight);
        System.out.println(theLine5);
        System.out.println(thePipeLeft + theBoard5[4][0] + thePipe + theBoard5[4][1] + thePipe + theBoard5[4][2] + thePipe + theBoard5[4][3] + thePipe + theBoard5[4][4] + thePipeRight);
        System.out.println(theLine5);
    }
}