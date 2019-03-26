package com.bridgelabz.functionalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		emptyBoard();
		printBoard();
		System.out.println(" First player is X ");
		while (winner == null) {
			int inputNum;
			inputNum = scanner.nextInt();
			if (!(inputNum > 0 && inputNum <= 9)) {
				System.out.println("Invalid input");
			}
			if (board[inputNum - 1].equals(String.valueOf(inputNum))) {
				board[inputNum - 1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				printBoard();
				winner = checkWinner();

			} else {
				System.out.println("Slot already taken");
			}

		}
		scanner.close();
		System.out.println(" winner is:" + winner);
	}

	static String checkWinner() {
		for (int i = 0; i < 8; i++) {
			String line = null;
			switch (i) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;

			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("000")) {
				return "O";
			}

		}
		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
				break;
			}
		}
		return null;
	}

	static void printBoard() {
		System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
		System.out.println("|-----|");
		System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
		System.out.println("|-----|");
		System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");

	}

	private static void emptyBoard() {
		for (int i = 0; i < 9; i++) {
			board[i] = String.valueOf(i + 1);

		}

	}

}
