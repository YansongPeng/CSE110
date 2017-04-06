//***********************************************************
// Name: Yansong Peng
// Title: Assignment4.java
// Author: Yansong Peng
// Description: Write the description in your words.
// Time spent: 1 hour
// Date: 2/28/2014
//**********************************************************
import java.util.Scanner;
public class Assignment4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		while(true) {
			System.out.print("Set the size of table and data-type (Type 'Q' or 'q' to quit): \n");
			input = scan.nextLine();
			
			if("Q".equals(input))
				break;
			if("q".equals(input))
				break;
					
			int indexOfFirstSpace = input.indexOf(' ');
			int indexOfSecondSpace = input.indexOf(' ', indexOfFirstSpace + 1);
			
			String firstValue = input.substring(0, indexOfFirstSpace);
			String secondValue = input.substring(indexOfFirstSpace + 1, indexOfSecondSpace);
			String inputText = input.substring(indexOfSecondSpace + 1);
			
			int numbersOfRows = Integer.parseInt(firstValue);
			int numbersOfColumns = Integer.parseInt(secondValue);
			
			
			if ( numbersOfRows <= 0 || numbersOfColumns <= 0 || inputText == null) {
				System.out.println("Try again. The input was invalid.");
			}
			
			if (inputText.equals("\"numbers\"")){
			System.out.print("   *   |");
			for (int j = 1; j <= numbersOfColumns; j++){
				System.out.printf("%4d", j);
				}
			System.out.println();
			System.out.println("----------------------------------------------");
			
			for (int i = 1; i <= numbersOfRows; i++){
				System.out.printf("%4d", i);
				System.out.printf("%4s", '|');						
				for (int j = 1; j <= numbersOfColumns; j++){
					System.out.printf("%4d", i*j);
					}
					System.out.println();
					}
					System.out.println();
			}

					
			if (inputText.equals("\"even numbers\"")){
				numbersOfColumns = 2;
				
				System.out.print("   *   |");
				for (int j = 1; j <= numbersOfColumns; j++){
					System.out.printf("%4d", j);
					}
				System.out.println();
				System.out.println("----------------------------------------------");
				
				for (int i = 1; i <= numbersOfRows; i++){
					System.out.printf("%4d", i);
					System.out.printf("%4s", '|');						
					for (int j = 1; j <= numbersOfColumns; j++){
						System.out.printf("%4d", i*j*2);
						}
						System.out.println();
						}
						System.out.println();
			}
			
			if (inputText.equals("\"time table\"")){
				System.out.print("   *   |");
				for (int j = 1; j <= numbersOfColumns; j++){
					System.out.printf("%4d", j);
					}
				System.out.println();
				System.out.println("----------------------------------------------");
				
				for (int i = 1; i <= numbersOfRows; i++){
					System.out.printf("%4d", i);
					System.out.printf("%4s", '|');						
					for (int j = 1; j <= numbersOfColumns; j++){
						System.out.printf("%4d", i*j);
						}
						System.out.println();
						}
						System.out.println();
				}

			if (inputText.equals("\"sum table\"")){
				System.out.print("   *   |");
				
				for (int j = 1; j <= numbersOfColumns; j++){
					System.out.printf("%4d", j);
					}
				System.out.println();
				System.out.println("------------------------------");
				
				for (int i = 1; i <= numbersOfRows; i++){
					System.out.printf("%4d", i);
					System.out.printf("%4s", '|');
						for (int j = 1; j <= numbersOfColumns; j++){
							System.out.printf("%4d", i+j);
						}
						System.out.println();
					}
					System.out.println();
			}
		
			
			
			}
	}
}	


/*
a) use indexOfSpace. Than substring. Also use Integer.parseInt() to change the first integer to int.
b) for (int i = 4 ; i >= 0; i--){
		for (int j = 0; j <= i; j++) System.out.print("*");
			System.out.println();
c) Output is 260.  i = 20; j = 13 
d) for (int a = 1; a < 10000; a++)
		for (int b = 1; b <= a; b ++)
		System.out.print(a + " " + b + " ");
		b+=a+=b;
e) 1234 2468 36912
*/
