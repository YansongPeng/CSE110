//**********************************************************************
//Name: Yansong Peng
//Title: Assignment2.java
//Author: Yansong Peng
//Description: Display questions and calculate user inputs.
//Time spent: 20 minutes
//Date: 2/07/2014
//**********************************************************************
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		int sum = 0;
		double average;
	
		Scanner scan = new Scanner (System.in);

		System.out.println("*** TASK1: Calculate the average of three inputs ***");
		
		System.out.println("Please input the first integer: ");
		value1 = scan.nextInt();
	
		System.out.println("Please input the second integer: ");
		value2 = scan.nextInt();
		
		System.out.println("Please input the third integer: ");
		value3 = scan.nextInt();
		
		sum = value1 + value2 + value3;
		
		average = (double)sum / 3;
		DecimalFormat fmt = new DecimalFormat("#.00");
		System.out.println("The average of three inputs is: " + fmt.format(average));
		
		System.out.println(" ");
		System.out.println("*** TASK2: Calculate the # of characters ***");
		
		int charaNum1 = 0;
		int charaNum2 = 0;
		int charaNum3 = 0;
		int totalChar = 0;
		
		System.out.println("What is your first name? ");
		String str1 = scan.next();
		char[] cha1 = str1.toCharArray();
		for(int i = 0; i < cha1.length; i++) {
			charaNum1++;
		}
		
		System.out.println("What is your middle name (If not, just type the LETTER 'N')?");
		String str2 = scan.next();
		char[] cha2 = str2.toCharArray();
		for(int x = 0; x < cha2.length; x++) {
			if(cha2[x] == 'N') {
				charaNum2 = 0;
			}
			else {
				charaNum2++;
			}
		}
	
		System.out.println("What is your last name? ");
		String str3 = scan.next();
		char[] cha3 = str3.toCharArray();
		for(int y = 0; y < cha3.length; y++) {
			charaNum3++;
		}
		
		totalChar = charaNum1 + charaNum2 + charaNum3;
		System.out.println("The total number of character is: " + totalChar);
		
		System.out.println(" ");
		System.out.println("*** TASK 3: Calculate the change ***");
		
		final int PENNIES_PER_DOLLAR = 100;
		final int PENNIES_PER_QUARTER = 25;
		final int PENNIES_PER_DIMES = 10;
		final int PENNIES_PER_NICKELS = 5;
		final int PENNIES = 1;
		
		System.out.println("How much is the item? ");
		double itemPrice = scan.nextDouble();
		System.out.println("How much do you pay? ");
		double itemPay = scan.nextDouble();
		
		double changeDue = itemPay - itemPrice;
		changeDue = changeDue * PENNIES_PER_DOLLAR;
		double dollarBills = changeDue % PENNIES_PER_DOLLAR;
		changeDue = changeDue - dollarBills;
		double quarters = changeDue % PENNIES_PER_QUARTER;
		changeDue = changeDue - quarters * PENNIES_PER_QUARTER;
		double dimes = changeDue % PENNIES_PER_DIMES;
		changeDue = changeDue - dimes * PENNIES_PER_DIMES;
		double nickels = changeDue % PENNIES_PER_NICKELS;
		changeDue = changeDue - nickels * PENNIES_PER_NICKELS;
		double pennies = changeDue % PENNIES;
		
		System.out.println("The change in ");
		System.out.println("\t" + "Dollar bills: " + dollarBills);
		System.out.println("\t" + "Quarters: " + quarters);
		System.out.println("\t" + "Dimes: " + dimes);
		System.out.println("\t" + "Nickels: " + nickels);
		System.out.println("\t" + "Pennies: " + pennies);
		
		System.out.println("*** END OF Assignment#2 ***");
	}
}

//***************************************************************************
//a. 56
//b. java.long
//c. InputStream
//d. 33
//e. public void println(int x): it can print an integer and end the line.
//***************************************************************************