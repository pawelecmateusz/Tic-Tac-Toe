package com.example.tictactoe;

import static com.example.tictactoe.Colors.*;
import static com.example.tictactoe.Challenge.*;
import static com.example.tictactoe.GameModesSrc.*;
import static com.example.tictactoe.QuickMatch.*;
import static com.example.tictactoe.TicTacToeApplication.*;
import static java.lang.Thread.sleep;

public class MainMenu {

    // Menu elements.
    static String menuLine = fcYELLOW + " --------- " + cRESET;
    static String single = fcGREEN + "Quick Match" + cRESET;
    static String multi = fcPURPLE + " CHALLENGE" + cRESET;
    static String exit = fcCYAN + "  E x i t" + cRESET;
    static String ticTacToe = "%sTic%s-%sTac%s-%sToe%s".formatted(fcGREEN, fcYELLOW, fcPURPLE, fcYELLOW, fcCYAN, cRESET);

    // Display game logo.
    public static void showLogo() {

        System.out.println(menuLine);
        System.out.println(ticTacToe);
        System.out.println(menuLine + "\n");
    }

    // Display game menu.
    public static void showMenu() {
        System.out.println(fcYELLOW + " Main Menu" + cRESET);
        System.out.println(menuLine);
        System.out.println(single + "\n" + multi + "\n" + exit);
        System.out.println(menuLine);
    }

    // Choose the desired game mode or exit the game.
    public static void chooseMode() throws InterruptedException {
        while (true) {
            System.out.println(fcGREEN + "  Q " + fcPURPLE + " C " + fcCYAN + " E " + cRESET);
            System.out.print("     ");
            choice = scanner.nextLine();
            if(choice.equals("Q") || choice.equals("q") || choice.equals("C") || choice.equals("c") || choice.equals("E") || choice.equals("e")) {
                switch (choice) {
                    case "Q":
                    case "q":
                        playQuickMatch();
                    case "C":
                    case "c":
                        setNames();
                        playChallenge();
                    case "E":
                    case "e":
                        sayGoodbye();
                        System.exit(0);
                }
            }
            System.out.println(fcRED + "wrong input\n" + cRESET);
        }
    }

    // Back to Menu.
    public static void goBackToMenu() throws InterruptedException {
        System.out.println(" ");
        showMenu();
        chooseMode();
    }

    // Inform the player about the new name for the game.
    public static void showSpidersAndSnakes() throws InterruptedException {
        System.out.println(fcYELLOW + " This is not " + ticTacToe + fcYELLOW + " anymore..." + cRESET);
        sleep(500);
        System.out.println(fcYELLOW + "\n             Welcome to\n" + cRESET);
        sleep(500);
        System.out.println(fcGREEN + "        ::  ::" + fcCYAN + "        ~~  ~~" + cRESET);
        System.out.println(fcGREEN + "      :: " + fcRED + "SPIDERZ vs SNAKESS" + fcCYAN + " ~~" + cRESET);
        System.out.println(fcGREEN + "        ::  ::" + fcCYAN + "        ~~  ~~\n" + cRESET);
        sleep(1000);
    }

    // Endgame message.
    public static void sayGoodbye() throws InterruptedException {
        System.out.println(" ");
        System.out.print(fcYELLOW + "  BYE ");
        sleep(500);
        System.out.println("BYE" + cRESET);
        sleep(1000);
    }
}