package com.example.tictactoe;

public class ValidMove {

    // See if it's possible to put player's and CPU's symbol on the 3x3 game board.
    public static boolean isMoveValid3(String[][] theBoard3, String position) {
        return switch (position) {
            case "1" -> (theBoard3[0][0].equals("1"));
            case "2" -> (theBoard3[0][1].equals("2"));
            case "3" -> (theBoard3[0][2].equals("3"));
            case "4" -> (theBoard3[1][0].equals("4"));
            case "5" -> (theBoard3[1][1].equals("5"));
            case "6" -> (theBoard3[1][2].equals("6"));
            case "7" -> (theBoard3[2][0].equals("7"));
            case "8" -> (theBoard3[2][1].equals("8"));
            case "9" -> (theBoard3[2][2].equals("9"));
            default -> false;
        };
    }

    // See if it's possible to put player's and CPU's symbol on the 5x5 game board.
    public static boolean isMoveValid5(String[][] theBoard5, String position) {
        return switch (position) {
            case "01", "1" -> (theBoard5[0][0].equals("01"));
            case "02", "2" -> (theBoard5[0][1].equals("02"));
            case "03", "3" -> (theBoard5[0][2].equals("03"));
            case "04", "4" -> (theBoard5[0][3].equals("04"));
            case "05", "5" -> (theBoard5[0][4].equals("05"));
            case "06", "6" -> (theBoard5[1][0].equals("06"));
            case "07", "7" -> (theBoard5[1][1].equals("07"));
            case "08", "8" -> (theBoard5[1][2].equals("08"));
            case "09", "9" -> (theBoard5[1][3].equals("09"));
            case "10" -> (theBoard5[1][4].equals("10"));
            case "11" -> (theBoard5[2][0].equals("11"));
            case "12" -> (theBoard5[2][1].equals("12"));
            case "13" -> (theBoard5[2][2].equals("13"));
            case "14" -> (theBoard5[2][3].equals("14"));
            case "15" -> (theBoard5[2][4].equals("15"));
            case "16" -> (theBoard5[3][0].equals("16"));
            case "17" -> (theBoard5[3][1].equals("17"));
            case "18" -> (theBoard5[3][2].equals("18"));
            case "19" -> (theBoard5[3][3].equals("19"));
            case "20" -> (theBoard5[3][4].equals("20"));
            case "21" -> (theBoard5[4][0].equals("21"));
            case "22" -> (theBoard5[4][1].equals("22"));
            case "23" -> (theBoard5[4][2].equals("23"));
            case "24" -> (theBoard5[4][3].equals("24"));
            case "25" -> (theBoard5[4][4].equals("25"));
            default -> false;
        };
    }
}