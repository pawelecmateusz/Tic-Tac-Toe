package com.example.tictactoe;

public class WinCondition {
    //static String O = tcGREEN + "O" + cRESET;
    //static String X = tcCYAN + "X" + cRESET;
    public static boolean isGameWon(String[][] theBoard, String symbol) {


        for (int i = 0; i < theBoard.length; i++) {
            for (int n = 0; n < theBoard[i].length; n++) {
                if (theBoard[i][n].equals(" ")) {
                    return false;
                }
            }
        }
        System.out.println("No winner.");
        return true;
    }
}

        /*if (playerMove.equals(theBoard[0][0].equals("O")) && playerMove.equals(theBoard[0][1]) && playerMove.equals(theBoard[0][2])) {
          //  return true;
        //}

        if (theBoard[0][0].equals("O") && theBoard[0][1].equals("O") && theBoard[0][2].equals("O")) {
            System.out.println("You've won");
            theBoard[0][0]
        }*/