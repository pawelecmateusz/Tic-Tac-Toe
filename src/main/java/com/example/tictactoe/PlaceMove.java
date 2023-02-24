package com.example.tictactoe;

public class PlaceMove {
    public static boolean isValid(char[][] theBoard, String position, char symbol) {
        switch (position) {
            case 1:
                return (theBoard[0][0] == ' ');
            case 2:
                return (theBoard[0][1] == ' ');
            case 3:
                return (theBoard[0][2] == ' ');
            case 4:
                return (theBoard[1][0] == ' ');
            case 5:
                return (theBoard[1][1] == ' ');
            case 6:
                return (theBoard[1][2] == ' ');
            case 7:
                return (theBoard[2][0] == ' ');
            case 8:
                return (theBoard[2][1] == ' ');
            case 9:
                return (theBoard[2][2] == ' ');
            default:
                return false;
        }
    }
}
