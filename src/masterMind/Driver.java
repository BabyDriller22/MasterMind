package masterMind;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
//===========================================================================================================================================================================================================
//		Scanner
        Scanner sc = new Scanner(System.in);
//      colors
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
//==============================================================================================================================================================================================================	
//		Codebreaker-pins
		String green = "Green";
		String yellow = "Yellow";
		String red = "Red";
		String purple = "Purple";
		String blue = "Blue";
		String orange = "Orange";
		
//		CodeBreaker-Row+Holes
		String codeBreakerHole1 = "";
		String codeBreakerHole2 = "";
		String codeBreakerHole3 = "";
		String codeBreakerHole4 = "";
//===========================================================================================================================================================================================================
//		CodeMaker-pins
		String black = "Black";
		String white = "White";
		String empty = "Empty";
		
//		CodeMaker-Row+Holes
		String codeMakerHole1 = "";
		String codeMakerHole2 = "";
		String codeMakerHole3 = "";
		String codeMakerHole4 = "";
//		Secret-CodeField
		String secretCodeField1 = "";
		String secretCodeField2 = "";
		String secretCodeField3 = "";
		String secretCodeField4 = "";
//===========================================================================================================================================================================================================
		int currentRow = 0;
		int winCondition = 0;
		int gamesWon = 0;
//===========================================================================================================================================================================================================
//		secret code is made
		secretCodeField1 = green;
		secretCodeField2 = yellow;
		secretCodeField3 = red;
		secretCodeField4 = blue;
		
		
		
//=========================================================================================================================================================================================================================================================
		//Hole 1
        for (currentRow = 1; currentRow <= 10; currentRow++) {
        	winCondition = 0;
        	System.out.println("Row "+ currentRow);
//        	hole 1 input
			System.out.println("Choose a color that you want to place in hole 1:");
			boolean correct = false;
			do {
				codeBreakerHole1 = sc.next();
				if (codeBreakerHole1.equalsIgnoreCase(green) ||
						codeBreakerHole1.equalsIgnoreCase(yellow) ||
						codeBreakerHole1.equalsIgnoreCase(red) ||
						codeBreakerHole1.equalsIgnoreCase(purple) ||
						codeBreakerHole1.equalsIgnoreCase(orange) ||
						codeBreakerHole1.equalsIgnoreCase(blue)) {
					correct = true;
				} else {
					System.out.println(RED+"Invalid! "+RESET+"Choose a color that you want to place in hole 1:");
				}
			} while(correct == false);
			
//			hole 2
			System.out.println("Choose a color that you want to place in hole 2:");
			correct = false;
			do {
				codeBreakerHole2 = sc.next();
				if (codeBreakerHole2.equalsIgnoreCase(green) ||
						codeBreakerHole2.equalsIgnoreCase(yellow) ||
						codeBreakerHole2.equalsIgnoreCase(red) ||
						codeBreakerHole2.equalsIgnoreCase(purple) ||
						codeBreakerHole2.equalsIgnoreCase(orange) ||
						codeBreakerHole2.equalsIgnoreCase(blue)) {
					correct = true;
				} else {
					System.out.println(RED+"Invalid! "+RESET+"Choose a color that you want to place in hole 2:");
				}
			} while(correct == false); 
			
//			hole 3 input
			System.out.println("Choose a color that you want to place in hole 3:");
			correct = false;
			do {
				codeBreakerHole3 = sc.next();
				if (codeBreakerHole3.equalsIgnoreCase(green) ||
						codeBreakerHole3.equalsIgnoreCase(yellow) ||
						codeBreakerHole3.equalsIgnoreCase(red) ||
						codeBreakerHole3.equalsIgnoreCase(purple) ||
						codeBreakerHole3.equalsIgnoreCase(orange) ||
						codeBreakerHole3.equalsIgnoreCase(blue)) {
					correct = true;
				} else {
					System.out.println(RED+"Invalid! "+RESET+"Choose a color that you want to place in hole 3:");
				}
			} while(correct == false); 
			
//			hole 4 input
			System.out.println("Choose a color that you want to place in hole 4:");
			correct = false;
			do {
				codeBreakerHole4 = sc.next();
				if (codeBreakerHole4.equalsIgnoreCase(green) ||
						codeBreakerHole4.equalsIgnoreCase(yellow) ||
						codeBreakerHole4.equalsIgnoreCase(red) ||
						codeBreakerHole4.equalsIgnoreCase(purple) ||
						codeBreakerHole4.equalsIgnoreCase(orange) ||
						codeBreakerHole4.equalsIgnoreCase(blue)) {
					correct = true;
				} else {
					System.out.println(RED+"Invalid! "+RESET+"Choose a color that you want to place in hole 4:");
				}
			} while(correct == false); 
			
			//win check
//=======================================================================================================================================================================================================================
//							Hole 1 check
							if (codeBreakerHole1.equalsIgnoreCase(secretCodeField1)) {
								codeMakerHole1 = BLACK+black+RESET;
								winCondition++;
							} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField2)){
								codeMakerHole1 = WHITE+white+RESET;
							} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField3)){
								codeMakerHole1 = WHITE+white+RESET;
							} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField4)){
								codeMakerHole1 = WHITE+white+RESET;
							} else{
								codeMakerHole1 = empty;
							}
							
//							Hole 2 check
							if (codeBreakerHole2.equalsIgnoreCase(secretCodeField2)) {
								codeMakerHole2 = BLACK+black+RESET;
								winCondition++;
							} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField1)){
								codeMakerHole2 = WHITE+white+RESET;
							} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField3)){
								codeMakerHole2 = WHITE+white+RESET;
							} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField4)){
								codeMakerHole2 = WHITE+white+RESET;
							} else{
								codeMakerHole2 = empty;							}
							
//							Hole 3 check
							if (codeBreakerHole3.equalsIgnoreCase(secretCodeField3)) {
								codeMakerHole3 = BLACK+black+RESET;
								winCondition++;
							} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField1)){
								codeMakerHole3 = WHITE+white+RESET;
							} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField2)){
								codeMakerHole3 = WHITE+white+RESET;
							} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField4)){
								codeMakerHole3 = WHITE+white+RESET;
							} else{
								codeMakerHole1 = empty;
							}
							
//							Hole 4 check
							if (codeBreakerHole4.equalsIgnoreCase(secretCodeField4)) {
								codeMakerHole4 = BLACK+black+RESET;
								winCondition++;
							} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField1)){
								codeMakerHole4 = WHITE+white+RESET;
							} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField2)){
								codeMakerHole4 = WHITE+white+RESET;
							} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField3)){
								codeMakerHole4 = WHITE+white+RESET;
							} else{
								codeMakerHole4 = empty;
							}
							
//=======================================================================================================================================================================================================================
//							Output
							System.out.println("\n=========================");
							System.out.println("|"+codeMakerHole1+"|"+codeMakerHole2+"|"+codeMakerHole3+"|"+codeMakerHole4+"|");
							System.out.println("=========================");
							System.out.println("|"+codeBreakerHole1+"|"+codeBreakerHole2+"|"+codeBreakerHole3+"|"+codeBreakerHole4+"|");
							System.out.println("=========================\n");
							
							if (winCondition == 4) {
								gamesWon = gamesWon+1;
							    System.out.println(WONTXT+"W in the chat. YOU WON!"+RESET);
							    System.out.println("You guessed the code in " + currentRow + " rows");
							    System.out.println("\nDo you want to play again? Yes|No");
							    String awnser = sc.next();
							    if(awnser.equalsIgnoreCase("Yes")) {
							    	System.out.println("Current wins: "+gamesWon+"\n");
							    	currentRow = 0;
							    } else {
							    	System.out.println("You won: "+gamesWon+" games!");
							    	currentRow = 11;
							    }
							} else if (currentRow == 10 && winCondition != 4) {
							    System.out.println("You lost. L bozo");
							}

        }
        sc.close();
	}
}