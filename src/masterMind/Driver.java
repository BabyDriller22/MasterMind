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
//===================================
//		Game-begins
		secretCodeField1 = green;
		secretCodeField2 = yellow;
		secretCodeField3 = red;
		secretCodeField4 = blue;
		
		System.out.println("Choose a color that you want to place in hole 1:");
		codeBreakerHole1 = sc.next();
//		System.out.println(codeBreakerHole1);
			if (codeBreakerHole1.equalsIgnoreCase(secretCodeField1)) {
				codeMakerHole1 = black;
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
		
	}

}