package com.example.tictactoe;

public class WinConditions {


    // Win conditions for 3x3 board
    public static boolean isGameWon3(String[][] theBoard, String symbol) {
                //rows
        return  theBoard[0][0].equals(symbol) && theBoard[0][1].equals(symbol) && theBoard[0][2].equals(symbol) ||
                (theBoard[1][0].equals(symbol) && theBoard[1][1].equals(symbol) && theBoard[1][2].equals(symbol)) ||
                (theBoard[2][0].equals(symbol) && theBoard[2][1].equals(symbol) && theBoard[2][2].equals(symbol)) ||
                //columns
                (theBoard[0][0].equals(symbol) && theBoard[1][0].equals(symbol) && theBoard[2][0].equals(symbol)) ||
                (theBoard[0][1].equals(symbol) && theBoard[1][1].equals(symbol) && theBoard[2][1].equals(symbol)) ||
                (theBoard[0][2].equals(symbol) && theBoard[1][2].equals(symbol) && theBoard[2][2].equals(symbol)) ||
                //diagonals
                (theBoard[0][0].equals(symbol) && theBoard[1][1].equals(symbol) && theBoard[2][2].equals(symbol)) ||
                (theBoard[0][2].equals(symbol) && theBoard[1][1].equals(symbol) && theBoard[2][0].equals(symbol));
    }

    // Win conditions for 5x5 board
    public static boolean isGameWon5(String[][] theBoard, String symbol) {
                //row1
        return  theBoard[0][0].equals(symbol) && theBoard[0][1].equals(symbol) && theBoard[0][2].equals(symbol) && theBoard[0][3].equals(symbol) ||
                theBoard[0][1].equals(symbol) && theBoard[0][2].equals(symbol) && theBoard[0][3].equals(symbol) && theBoard[0][4].equals(symbol) ||
                //row2
                theBoard[1][0].equals(symbol) && theBoard[1][1].equals(symbol) && theBoard[1][2].equals(symbol) && theBoard[1][3].equals(symbol) ||
                theBoard[1][1].equals(symbol) && theBoard[1][2].equals(symbol) && theBoard[1][3].equals(symbol) && theBoard[1][4].equals(symbol) ||
                //row3
                theBoard[2][0].equals(symbol) && theBoard[2][1].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[2][3].equals(symbol) ||
                theBoard[2][1].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[2][3].equals(symbol) && theBoard[2][4].equals(symbol) ||
                //row4
                theBoard[3][0].equals(symbol) && theBoard[3][1].equals(symbol) && theBoard[3][2].equals(symbol) && theBoard[3][3].equals(symbol) ||
                theBoard[3][1].equals(symbol) && theBoard[3][2].equals(symbol) && theBoard[3][3].equals(symbol) && theBoard[3][4].equals(symbol) ||
                //row5
                theBoard[4][0].equals(symbol) && theBoard[4][1].equals(symbol) && theBoard[4][2].equals(symbol) && theBoard[4][3].equals(symbol) ||
                theBoard[4][1].equals(symbol) && theBoard[4][2].equals(symbol) && theBoard[4][3].equals(symbol) && theBoard[4][4].equals(symbol) ||

                //col1
                theBoard[0][0].equals(symbol) && theBoard[1][0].equals(symbol) && theBoard[2][0].equals(symbol) && theBoard[3][0].equals(symbol) ||
                theBoard[1][0].equals(symbol) && theBoard[2][0].equals(symbol) && theBoard[3][0].equals(symbol) && theBoard[4][0].equals(symbol) ||
                //col2
                theBoard[0][1].equals(symbol) && theBoard[1][1].equals(symbol) && theBoard[2][1].equals(symbol) && theBoard[3][1].equals(symbol) ||
                theBoard[1][1].equals(symbol) && theBoard[2][1].equals(symbol) && theBoard[3][1].equals(symbol) && theBoard[4][1].equals(symbol) ||
                //col3
                theBoard[0][2].equals(symbol) && theBoard[1][2].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[3][2].equals(symbol) ||
                theBoard[1][2].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[3][2].equals(symbol) && theBoard[4][2].equals(symbol) ||
                //col4
                theBoard[0][3].equals(symbol) && theBoard[1][3].equals(symbol) && theBoard[2][3].equals(symbol) && theBoard[3][3].equals(symbol) ||
                theBoard[1][3].equals(symbol) && theBoard[2][3].equals(symbol) && theBoard[3][3].equals(symbol) && theBoard[4][3].equals(symbol) ||
                //col5
                theBoard[0][4].equals(symbol) && theBoard[1][4].equals(symbol) && theBoard[2][4].equals(symbol) && theBoard[3][4].equals(symbol) ||
                theBoard[1][4].equals(symbol) && theBoard[2][4].equals(symbol) && theBoard[3][4].equals(symbol) && theBoard[4][4].equals(symbol) ||

                //diagonalTopRight
                theBoard[1][0].equals(symbol) && theBoard[2][1].equals(symbol) && theBoard[3][2].equals(symbol) && theBoard[4][3].equals(symbol) ||
                theBoard[0][0].equals(symbol) && theBoard[1][1].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[3][3].equals(symbol) ||
                theBoard[1][1].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[3][3].equals(symbol) && theBoard[4][4].equals(symbol) ||
                theBoard[0][1].equals(symbol) && theBoard[1][2].equals(symbol) && theBoard[2][3].equals(symbol) && theBoard[3][4].equals(symbol) ||

                //diagonalTopLeft
                theBoard[0][3].equals(symbol) && theBoard[1][2].equals(symbol) && theBoard[2][1].equals(symbol) && theBoard[3][0].equals(symbol) ||
                theBoard[0][4].equals(symbol) && theBoard[1][3].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[3][1].equals(symbol) ||
                theBoard[1][3].equals(symbol) && theBoard[2][2].equals(symbol) && theBoard[3][1].equals(symbol) && theBoard[4][0].equals(symbol) ||
                theBoard[1][4].equals(symbol) && theBoard[2][3].equals(symbol) && theBoard[3][2].equals(symbol) && theBoard[4][1].equals(symbol);
    }
}