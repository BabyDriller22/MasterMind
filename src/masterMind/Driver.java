package masterMind;

import java.util.Random;
import java.util.Scanner;

public class Driver {
	static String[] colors = { "Green", "Yellow", "Red", "Purple", "Orange", "Blue" };

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
		String codeBreakerHole1 = "";
		String codeBreakerHole2 = "";
		String codeBreakerHole3 = "";
		String codeBreakerHole4 = "";

		// CodeMaker-pins
		String black = "Black";
		String white = "White";
		String empty = "Empty";

		// CodeMaker-Row+Holes
		String codeMakerHole1 = "";
		String codeMakerHole2 = "";
		String codeMakerHole3 = "";
		String codeMakerHole4 = "";
		// Secret-CodeField
		String secretCodeField1 = "";
		String secretCodeField2 = "";
		String secretCodeField3 = "";
		String secretCodeField4 = "";
		// ===========================================================================================================================================================================================================
		int currentRow = 0;
		int winCondition = 0;
		int gamesWon = 0;
		// ===========================================================================================================================================================================================================
		// secret code is made
		Random random = new Random();

		secretCodeField1 = colors[random.nextInt(colors.length)];
		secretCodeField2 = colors[random.nextInt(colors.length)];
		secretCodeField3 = colors[random.nextInt(colors.length)];
		secretCodeField4 = colors[random.nextInt(colors.length)];

		// =========================================================================================================================================================================================================================================================
		// Hole 1
		for (currentRow = 1; currentRow <= 10; currentRow++) {
			winCondition = 0;
			System.out.println("Row " + currentRow);
			// hole 1 input
			System.out.println("Choose a color that you want to place in hole 1:");
			boolean correct = false;
			do {
				codeBreakerHole1 = sc.next();
				if (codeBreakerHole1.equalsIgnoreCase(colors[0]) || codeBreakerHole1.equalsIgnoreCase(colors[1])
						|| codeBreakerHole1.equalsIgnoreCase(colors[2]) || codeBreakerHole1.equalsIgnoreCase(colors[3])
						|| codeBreakerHole1.equalsIgnoreCase(colors[4])
						|| codeBreakerHole1.equalsIgnoreCase(colors[5])) {
					correct = true;
				} else {
					System.out.println(RED + "Invalid! " + RESET + "Choose a color that you want to place in hole 1:");
				}
			} while (correct == false);

			// hole 2
			System.out.println("Choose a color that you want to place in hole 2:");
			correct = false;
			do {
				codeBreakerHole2 = sc.next();
				if (codeBreakerHole2.equalsIgnoreCase(colors[0]) || codeBreakerHole2.equalsIgnoreCase(colors[1])
						|| codeBreakerHole2.equalsIgnoreCase(colors[2]) || codeBreakerHole2.equalsIgnoreCase(colors[3])
						|| codeBreakerHole2.equalsIgnoreCase(colors[4])
						|| codeBreakerHole2.equalsIgnoreCase(colors[5])) {
					correct = true;
				} else {
					System.out.println(RED + "Invalid! " + RESET + "Choose a color that you want to place in hole 2:");
				}
			} while (correct == false);

			// hole 3 input
			System.out.println("Choose a color that you want to place in hole 3:");
			correct = false;
			do {
				codeBreakerHole3 = sc.next();
				if (codeBreakerHole3.equalsIgnoreCase(colors[0]) || codeBreakerHole3.equalsIgnoreCase(colors[1])
						|| codeBreakerHole3.equalsIgnoreCase(colors[2]) || codeBreakerHole3.equalsIgnoreCase(colors[3])
						|| codeBreakerHole3.equalsIgnoreCase(colors[4])
						|| codeBreakerHole3.equalsIgnoreCase(colors[5])) {
					correct = true;
				} else {
					System.out.println(RED + "Invalid! " + RESET + "Choose a color that you want to place in hole 3:");
				}
			} while (correct == false);

			// hole 4 input
			System.out.println("Choose a color that you want to place in hole 4:");
			correct = false;
			do {
				codeBreakerHole4 = sc.next();
				if (codeBreakerHole4.equalsIgnoreCase(colors[0]) || codeBreakerHole4.equalsIgnoreCase(colors[1])
						|| codeBreakerHole4.equalsIgnoreCase(colors[2]) || codeBreakerHole4.equalsIgnoreCase(colors[3])
						|| codeBreakerHole4.equalsIgnoreCase(colors[4])
						|| codeBreakerHole4.equalsIgnoreCase(colors[5])) {
					correct = true;
				} else {
					System.out.println(RED + "Invalid! " + RESET + "Choose a color that you want to place in hole 4:");
				}
			} while (correct == false);

			// win check
			// =======================================================================================================================================================================================================================
			// Hole 1 check
			if (codeBreakerHole1.equalsIgnoreCase(secretCodeField1)) {
				codeMakerHole1 = BLACK + black + RESET;
				winCondition++;
			} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField2)) {
				codeMakerHole1 = WHITE + white + RESET;
			} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField3)) {
				codeMakerHole1 = WHITE + white + RESET;
			} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField4)) {
				codeMakerHole1 = WHITE + white + RESET;
			} else {
				codeMakerHole1 = empty;
			}

			// Hole 2 check
			if (codeBreakerHole2.equalsIgnoreCase(secretCodeField2)) {
				codeMakerHole2 = BLACK + black + RESET;
				winCondition++;
			} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField1)) {
				codeMakerHole2 = WHITE + white + RESET;
			} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField3)) {
				codeMakerHole2 = WHITE + white + RESET;
			} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField4)) {
				codeMakerHole2 = WHITE + white + RESET;
			} else {
				codeMakerHole2 = empty;
			}

			// Hole 3 check
			if (codeBreakerHole3.equalsIgnoreCase(secretCodeField3)) {
				codeMakerHole3 = BLACK + black + RESET;
				winCondition++;
			} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField1)) {
				codeMakerHole3 = WHITE + white + RESET;
			} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField2)) {
				codeMakerHole3 = WHITE + white + RESET;
			} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField4)) {
				codeMakerHole3 = WHITE + white + RESET;
			} else {
				codeMakerHole3 = empty;
			}

			// Hole 4 check
			if (codeBreakerHole4.equalsIgnoreCase(secretCodeField4)) {
				codeMakerHole4 = BLACK + black + RESET;
				winCondition++;
			} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField1)) {
				codeMakerHole4 = WHITE + white + RESET;
			} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField2)) {
				codeMakerHole4 = WHITE + white + RESET;
			} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField3)) {
				codeMakerHole4 = WHITE + white + RESET;
			} else {
				codeMakerHole4 = empty;
			}

			// =======================================================================================================================================================================================================================
			// Output
			System.out.println("\n=========================");
			System.out.println(
					"|" + codeMakerHole1 + "|" + codeMakerHole2 + "|" + codeMakerHole3 + "|" + codeMakerHole4 + "|");
			System.out.println("=========================");
			System.out.println("|" + codeBreakerHole1 + "|" + codeBreakerHole2 + "|" + codeBreakerHole3 + "|"
					+ codeBreakerHole4 + "|");
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

		}
		sc.close();

	}

	public static boolean arrayContains(String guess)
        {
		return true;
        }
}