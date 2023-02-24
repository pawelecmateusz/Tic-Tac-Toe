package com.example.tictactoe;

import java.util.Scanner;

import static com.example.tictactoe.MainMenu.*;

public class TicTacToeApplication {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		showLogo();
		showMenu();
		chooseMode();
	}
}