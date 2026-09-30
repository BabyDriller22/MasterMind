package masterMind;

import java.util.Random;
import java.util.Scanner;

public class Driver {
	static String[] colors = { "Green", "Yellow", "Red", "Purple", "Orange", "Blue" };
	static String[] codeMakerHole = { "", "", "", "" };
	static String[] codeBreakerHole = { "", "", "", "" };
	static String[] secretCodeField = { "", "", "", "" };

	public static void main(String[] args) {
		// ===========================================================================================================================================================================================================
		// Scanner
		Scanner sc = new Scanner(System.in);
		// colors
		final String RESET = "\u001B[0m";
		final String GREEN = "\u001B[32m";
		final String YELLOW = "\u001B[33m";
		final String RED = "\u001B[31m";
		final String PURPLE = "\u001B[35m";
		final String BLUE = "\u001B[34m";
		final String WHITE = "\u001B[37m";
		final String BLACK = "\u001B[30m";
		final String MAGENTA = "\u001b[35m";
		final String WONTXT = "\u001b[43;1m";
		// ===========================================================================================================================================================================================================

		// CodeMaker-pins
		String black = "Black";
		String white = "White";
		String empty = "Empty";
		// ===========================================================================================================================================================================================================
		int currentRow = 0;
		int winCondition = 0;
		int gamesWon = 0;
		// ===========================================================================================================================================================================================================
		// secret code is made
		Random random = new Random();

		secretCodeField[0] = colors[random.nextInt(colors.length)];
		secretCodeField[1] = colors[random.nextInt(colors.length)];
		secretCodeField[2] = colors[random.nextInt(colors.length)];
		secretCodeField[3] = colors[random.nextInt(colors.length)];
//		should look like (secretCodeField.length)
		for (String secretCodeField : secretCodeField) {
			System.out.println(secretCodeField);
		}

		// =========================================================================================================================================================================================================================================================
		// Hole 1
		for (currentRow = 1; currentRow <= 10; currentRow++) {
			winCondition = 0;
			System.out.println("Row " + currentRow);
			// hole 1 input
			int j = 0;
			for (j = 0; j < codeBreakerHole.length; j++) {
				System.out.println("Choose a color that you want to place in hole " +(j+1)+ ":");
			boolean correct = false;
			do {
				codeBreakerHole[j] = sc.next();
				for (int i = 0; i < colors.length; i++) {
					if (codeBreakerHole[j].equalsIgnoreCase(colors[i])) {
						correct = true;
					}
				}
				if (correct == false) {
					System.out.println(RED + "Invalid! " + RESET + "Choose a color that you want to place in hole "+(j+1)+":");
				}
			} while (correct == false);
		}

		// win check
		// =======================================================================================================================================================================================================================
		// Hole 1 check
		if (codeBreakerHole[0].equalsIgnoreCase(secretCodeField[0])) {
			codeMakerHole[0] = BLACK + black + RESET;
			winCondition++;
		} else if (codeBreakerHole[0].equalsIgnoreCase(secretCodeField[1])) {
			codeMakerHole[0] = WHITE + white + RESET;
		} else if (codeBreakerHole[0].equalsIgnoreCase(secretCodeField[2])) {
			codeMakerHole[0] = WHITE + white + RESET;
		} else if (codeBreakerHole[0].equalsIgnoreCase(secretCodeField[3])) {
			codeMakerHole[0] = WHITE + white + RESET;
		} else {
			codeMakerHole[0] = empty;
		}

		// Hole 2 check
		if (codeBreakerHole[1].equalsIgnoreCase(secretCodeField[1])) {
			codeMakerHole[1] = BLACK + black + RESET;
			winCondition++;
		} else if (codeBreakerHole[1].equalsIgnoreCase(secretCodeField[0])) {
			codeMakerHole[1] = WHITE + white + RESET;
		} else if (codeBreakerHole[1].equalsIgnoreCase(secretCodeField[2])) {
			codeMakerHole[1] = WHITE + white + RESET;
		} else if (codeBreakerHole[1].equalsIgnoreCase(secretCodeField[3])) {
			codeMakerHole[1] = WHITE + white + RESET;
		} else {
			codeMakerHole[1] = empty;
		}

		// Hole 3 check
		if (codeBreakerHole[2].equalsIgnoreCase(secretCodeField[2])) {
			codeMakerHole[2] = BLACK + black + RESET;
			winCondition++;
		} else if (codeBreakerHole[2].equalsIgnoreCase(secretCodeField[0])) {
			codeMakerHole[2] = WHITE + white + RESET;
		} else if (codeBreakerHole[2].equalsIgnoreCase(secretCodeField[1])) {
			codeMakerHole[2] = WHITE + white + RESET;
		} else if (codeBreakerHole[2].equalsIgnoreCase(secretCodeField[3])) {
			codeMakerHole[2] = WHITE + white + RESET;
		} else {
			codeMakerHole[2] = empty;
		}

		// Hole 4 check
		if (codeBreakerHole[3].equalsIgnoreCase(secretCodeField[3])) {
			codeMakerHole[3] = BLACK + black + RESET;
			winCondition++;
		} else if (codeBreakerHole[3].equalsIgnoreCase(secretCodeField[0])) {
			codeMakerHole[3] = WHITE + white + RESET;
		} else if (codeBreakerHole[3].equalsIgnoreCase(secretCodeField[1])) {
			codeMakerHole[3] = WHITE + white + RESET;
		} else if (codeBreakerHole[3].equalsIgnoreCase(secretCodeField[2])) {
			codeMakerHole[3] = WHITE + white + RESET;
		} else {
			codeMakerHole[3] = empty;
		}

		// =======================================================================================================================================================================================================================
		// Output
		System.out.println("\n=========================");
		System.out.println("|" + codeMakerHole[0] + "|" + codeMakerHole[1] + "|" + codeMakerHole[2] + "|"
				+ codeMakerHole[3] + "|");
		System.out.println("=========================");
		System.out.println("|" + codeBreakerHole[0] + "|" + codeBreakerHole[1] + "|" + codeBreakerHole[2] + "|"
				+ codeBreakerHole[3] + "|");
		System.out.println("=========================\n");

		if (winCondition == 4) {
			gamesWon = gamesWon + 1;
			System.out.println(WONTXT + "W in the chat. YOU WON!" + RESET);
			System.out.println("You guessed the code in " + currentRow + " rows");
			System.out.println("\nDo you want to play again? Yes|No");
			String awnser = sc.next();
			if (awnser.equalsIgnoreCase("Yes")) {
				System.out.println("Current wins: " + gamesWon + "\n");
				currentRow = 0;
			} else {
				System.out.println("You won: " + gamesWon + " games!");
				currentRow = 11;
			}
		} else if (currentRow == 10 && winCondition != 4) {
			System.out.println("You lost. L bozo");
		}

	}sc.close();

	}

	public static boolean arrayContains(String guess) {
		return true;
	}
}