package com.example.tictactoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.tictactoe.PlaceMove.placeMove5;
import static com.example.tictactoe.ValidMove.*;
import static com.example.tictactoe.WinConditions.*;
import static com.example.tictactoe.WinOrLose.*;


class TicTacToeApplicationTests {

	@DisplayName("Row O")
	@Test
	public void testIsGameFinishedRowO() {
		//given

		//when
		String[][] gameBoard3 = {
				{"O", "O", "O"},
				{" ", " ", " "},
				{" ", " ", " "}};
		//then
		Assertions.assertFalse(isGameFinished3(gameBoard3));
		Assertions.assertTrue(isGameWon3(gameBoard3, "O"));
	}
	@DisplayName("Column O")
	@Test
	public void testIsGameFinishedColumnO() {
		//given

		//when
		String[][] gameBoard3 = {
				{" ", "O", " "},
				{" ", "O", " "},
				{" ", "O", " "}};
		//then
		Assertions.assertFalse(isGameFinished3(gameBoard3));
		Assertions.assertTrue(isGameWon3(gameBoard3, "O"));
	}
	@DisplayName("Diagonal O")
	@Test
	public void testIsGameFinishedDiagonalO() {
		//given

		//when
		String[][] gameBoard3 = {
				{"O", " ", " "},
				{" ", "O", " "},
				{" ", " ", "O"}};
		//then
		Assertions.assertFalse(isGameFinished3(gameBoard3));
		Assertions.assertTrue(isGameWon3(gameBoard3, "O"));
	}
	@DisplayName("Row X")
	@Test
	public void testIsGameFinishedRowX() {
		//given

		//when
		String[][] gameBoard3 = {
				{"X", "X", "X"},
				{" ", " ", " "},
				{" ", " ", " "}};
		//then
		Assertions.assertFalse(isGameFinished3(gameBoard3));
		Assertions.assertTrue(isGameWon3(gameBoard3, "X"));
	}
	@DisplayName("Column X")
	@Test
	public void testIsGameFinishedColumnX() {
		//given

		//when
		String[][] gameBoard3 = {
				{" ", "X", " "},
				{" ", "X", " "},
				{" ", "X", " "}};
		//then
		Assertions.assertFalse(isGameFinished3(gameBoard3));
		Assertions.assertTrue(isGameWon3(gameBoard3, "X"));
	}
	@DisplayName("Diagonal X")
	@Test
	public void testIsGameFinishedDiagonalX() {
		//given

		//when
		String[][] gameBoard3 = {
				{"X", " ", " "},
				{" ", "X", " "},
				{" ", " ", "X"}};
		//then
		Assertions.assertFalse(isGameFinished3(gameBoard3));
		Assertions.assertTrue(isGameWon3(gameBoard3, "X"));
	}
	@DisplayName("Tic-Tac-Toe Tie")
	@Test
	public void testIsGameFinishedTie() {
		//given

		//when
		String[][] gameBoard3 = {
				{"X", "O", "X"},
				{"X", "O", "O"},
				{"O", "X", "O"}};
		//then
		Assertions.assertTrue(isGameFinished3(gameBoard3));
		Assertions.assertFalse(isGameWon3(gameBoard3, "O"));
		Assertions.assertFalse(isGameWon3(gameBoard3, "X"));

	}
	@DisplayName("Tic-Tac-Toe Wrong Input")
	@Test
	public void testPlayer1Move() {
		//given
		String[][] gameBoard3 = {
				{" ", " ", " "},
				{" ", " ", " "},
				{" ", " ", " "}};
		//when
		String player1Move = "a";
		//then

		Assertions.assertFalse(isMoveValid3(gameBoard3, player1Move));
	}


	@DisplayName("Row Spider")
	@Test
	public void testIsGameFinishedRowSpider() {
		//given

		//when
		String[][] gameBoard5 = {{"::", "::", "::", "::", "05"},
								{"06", "07", "08", "09", "10"},
								{"11", "12", "13", "14", "15"},
								{"16", "17", "18", "19", "20"},
								{"21", "22", "23", "24", "25"}};
		//then
		Assertions.assertFalse(isGameFinished5(gameBoard5));
		Assertions.assertTrue(isGameWon5(gameBoard5, "::"));
	}
	@DisplayName("Column Spider")
	@Test
	public void testIsGameFinishedColumnSpider() {
		//given

		//when
		String[][] gameBoard5 = {{"01", "02", "03", "04", "05"},
								{"06", "07", "08", "::", "10"},
								{"11", "12", "13", "::", "15"},
								{"16", "17", "18", "::", "20"},
								{"21", "22", "23", "::", "25"}};
		//then
		Assertions.assertFalse(isGameFinished5(gameBoard5));
		Assertions.assertTrue(isGameWon5(gameBoard5, "::"));
	}
	@DisplayName("Diagonal Spider")
	@Test
	public void testIsGameFinishedDiagonalSpider() {
		//given

		//when
		String[][] gameBoard5 = {{"01", "::", "03", "04", "05"},
								{"06", "07", "::", "09", "10"},
								{"11", "12", "13", "::", "15"},
								{"16", "17", "18", "19", "::"},
								{"21", "22", "23", "24", "25"}};
		//then
		Assertions.assertFalse(isGameFinished5(gameBoard5));
		Assertions.assertTrue(isGameWon5(gameBoard5, "::"));
	}
	@DisplayName("Row Snake")
	@Test
	public void testIsGameFinishedRowSnake() {
		//given

		//when
		String[][] gameBoard5 = {{"~~", "~~", "~~", "~~", "05"},
								{"06", "07", "08", "09", "10"},
								{"11", "12", "13", "14", "15"},
								{"16", "17", "18", "19", "20"},
								{"21", "22", "23", "24", "25"}};
		//then
		Assertions.assertFalse(isGameFinished5(gameBoard5));
		Assertions.assertTrue(isGameWon5(gameBoard5, "~~"));
	}
	@DisplayName("Column Snake")
	@Test
	public void testIsGameFinishedColumnSnake() {
		//given

		//when
		String[][] gameBoard5 = {{"01", "02", "03", "04", "05"},
								{"06", "~~", "08", "09", "10"},
								{"11", "~~", "13", "14", "15"},
								{"16", "~~", "18", "19", "20"},
								{"21", "~~", "23", "24", "25"}};
		//then
		Assertions.assertFalse(isGameFinished5(gameBoard5));
		Assertions.assertTrue(isGameWon5(gameBoard5, "~~"));
	}
	@DisplayName("Diagonal Snake")
	@Test
	public void testIsGameFinishedDiagonalSnake() {
		//given

		//when
		String[][] gameBoard5 = {{"01", "02", "03", "04", "05"},
								{"06", "07", "08", "~~", "10"},
								{"11", "12", "~~", "14", "15"},
								{"16", "~~", "18", "19", "20"},
								{"~~", "22", "23", "24", "25"}};
		//then
		Assertions.assertFalse(isGameFinished5(gameBoard5));
		Assertions.assertTrue(isGameWon5(gameBoard5, "~~"));
	}
	@DisplayName("Spiders vs Snakes Tie")
	@Test
	public void testIsGameFinishedTie2() {
		//given

		//when
		String[][] gameBoard5 = {{"::", "~~", "::", "~~", "::"},
								{"::", "~~", "::", "::", "~~"},
								{"~~", "::", "~~", "::", "~~"},
								{"::", "::", "~~", "~~", "::"},
								{"::", "~~", "~~", "~~", "::"}};
		//then
		Assertions.assertTrue(isGameFinished5(gameBoard5));
		Assertions.assertFalse(isGameWon5(gameBoard5, "::"));
		Assertions.assertFalse(isGameWon5(gameBoard5, "~~"));

	}
	@DisplayName("Spiders vs Snakes Right Input ")
	@Test
	public void testPlayer1Move5() {
		//given
		String[][] gameBoard5 = {{"01", "02", "03", "04", "05"},
								{"06", "07", "08", "09", "10"},
								{"11", "12", "13", "14", "15"},
								{"16", "17", "18", "19", "20"},
								{"21", "22", "23", "24", "25"}};
		//when
		String player1Move01 = "01";
		String player1Move1 = "1";
		//then

		Assertions.assertTrue(isMoveValid5(gameBoard5, player1Move01));
		Assertions.assertTrue(isMoveValid5(gameBoard5, player1Move1));
	}
	@DisplayName("Spiders vs Snakes Place Move")
	@Test
	public void testPlaceMove() {
		//given
		String[][] gameBoard5 = {{"01", "02", "03", "04", "05"},
								{"06", "07", "08", "09", "10"},
								{"11", "12", "13", "14", "15"},
								{"16", "17", "18", "19", "20"},
								{"21", "22", "23", "24", "25"}};
		//when
		placeMove5(gameBoard5, "01", "::");
		placeMove5(gameBoard5, "07", "::");
		placeMove5(gameBoard5, "13", "::");
		//then

		Assertions.assertEquals("::", gameBoard5[0][0]);
		Assertions.assertEquals("::", gameBoard5[1][1]);
		Assertions.assertEquals("::", gameBoard5[2][2]);
	}
}