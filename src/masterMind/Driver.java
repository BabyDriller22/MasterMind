package masterMind;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
//===================================
        Scanner sc = new Scanner(System.in);
//===================================		
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
//===================================
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
//===================================
		int currentRow = 0;
		int winCondition = 0;
//===================================
//		secret code is made
		secretCodeField1 = green;
		secretCodeField2 = yellow;
		secretCodeField3 = red;
		secretCodeField4 = blue;
		
		
		//Hole 1
//=================================================================================
		
        for (currentRow = 1; currentRow <= 10; currentRow++) {
        	winCondition = 0;
        	System.out.println("Row "+ currentRow);
			System.out.println("Choose a color that you want to place in hole 1:");
			codeBreakerHole1 = sc.next();
				if (codeBreakerHole1.equalsIgnoreCase(secretCodeField1)) {
					codeMakerHole1 = black;
					winCondition++;
					System.out.println("Black");
				} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField2)){
					codeMakerHole1 = white;
					System.out.println("White");
				} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField3)){
					codeMakerHole1 = white;
					System.out.println("White");
				} else if (codeBreakerHole1.equalsIgnoreCase(secretCodeField4)){
					codeMakerHole1 = white;
					System.out.println("White");
				} else{
					codeMakerHole1 = empty;
					System.out.println("Empty");
				}
				
				//Hole 2
//=====================================================================================
				
				System.out.println("Choose a color that you want to place in hole 2:");
				codeBreakerHole2 = sc.next();
					if (codeBreakerHole2.equalsIgnoreCase(secretCodeField2)) {
						codeMakerHole1 = black;
						winCondition++;
						System.out.println("Black");
					} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField1)){
						codeMakerHole1 = white;
						System.out.println("White");
					} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField3)){
						codeMakerHole1 = white;
						System.out.println("White");
					} else if (codeBreakerHole2.equalsIgnoreCase(secretCodeField4)){
						codeMakerHole1 = white;
						System.out.println("White");
					} else{
						codeMakerHole1 = empty;
						System.out.println("Empty");
					}
					
					//Hole 3
//=========================================================================================
					
					System.out.println("Choose a color that you want to place in hole 3:");
					codeBreakerHole3 = sc.next();
						if (codeBreakerHole3.equalsIgnoreCase(secretCodeField3)) {
							codeMakerHole1 = black;
							winCondition++;
							System.out.println("Black");
						} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField1)){
							codeMakerHole1 = white;
							System.out.println("White");
						} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField2)){
							codeMakerHole1 = white;
							System.out.println("White");
						} else if (codeBreakerHole3.equalsIgnoreCase(secretCodeField4)){
							codeMakerHole1 = white;
							System.out.println("White");
						} else{
							codeMakerHole1 = empty;
							System.out.println("Empty");
						}
						
						//Hole 4
//=============================================================================================
						
						System.out.println("Choose a color that you want to place in hole 4:");
						codeBreakerHole4 = sc.next();
							if (codeBreakerHole4.equalsIgnoreCase(secretCodeField4)) {
								codeMakerHole1 = black;
								winCondition++;
								System.out.println("Black");
							} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField1)){
								codeMakerHole1 = white;
								System.out.println("White");
							} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField2)){
								codeMakerHole1 = white;
								System.out.println("White");
							} else if (codeBreakerHole4.equalsIgnoreCase(secretCodeField3)){
								codeMakerHole1 = white;
								System.out.println("White");
							} else{
								codeMakerHole1 = empty;
								System.out.println("Empty");
							}
							
							//win check
//============================================================================
							
							if (winCondition == 4) {
							    System.out.println("W in the chat. YOU WON!");
							    System.out.println("You guessed the code in " + currentRow + " rows");
							    currentRow = 11;
							} else if (currentRow == 10 && winCondition != 4) {
							    System.out.println("You lost. L bozo");
							}

        }
        sc.close();
	}
}