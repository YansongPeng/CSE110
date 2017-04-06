//***********************************************************
// Name: Yansong Peng
// Title: Assignment3.java
// Author: Yansong Peng
// Description: Write the description in your words.
// Time spent: 3 hours Estimated
// Date: 02/14/2014 
//**********************************************************
import java.util.Scanner;
public class Assignment3 {
public static void main(String arg[]) {
	int firstSide = 0;
	int secondSide = 0;
	int thirdSide =0;
	int max = 0;
	int med = 0;
	int min = 0;
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("*** TASK 1: Identify a triangle from sides ***");
	System.out.print("Please input the length of first side: ");
	firstSide = scan.nextInt();
	if(firstSide % 2 != 0){
		System.out.println(firstSide + " is an odd number.");
	}
	else{
		System.out.println(firstSide + " is an even number.");
	}
	
	System.out.print("Please input the length of second side: ");
	secondSide = scan.nextInt();
	if(secondSide == firstSide){
		System.out.println(secondSide + " is the same as the first side.");
	}
	else if(secondSide < firstSide){
		System.out.println(secondSide + " is smaller than the first side.");
	}
	else{
		System.out.println(secondSide + " is larger than the first side.");
	}
	
	System.out.print("Please input the length of third side: ");
	thirdSide = scan.nextInt();

	
	if(firstSide <= 0 || secondSide <= 0 || thirdSide <= 0 || firstSide % 1 != 0 || secondSide % 1 != 0 || thirdSide % 1 != 0){
		System.out.println("Invalid Data Input");
	}
	else {
		if (firstSide > secondSide && secondSide > thirdSide){
			max = firstSide; med = secondSide; min = thirdSide;
		}
		
		else if (firstSide > thirdSide && thirdSide > secondSide){
			max = firstSide; med = thirdSide; min = secondSide;
		}
		
		else if (secondSide > firstSide && firstSide > thirdSide){
			max = secondSide; med = firstSide; min = thirdSide;
		}
		
		else if (secondSide > thirdSide && thirdSide > firstSide){
			max = secondSide; med = thirdSide; min = firstSide;
		}
		
		else if (thirdSide > secondSide &&  secondSide> firstSide){
			max = thirdSide; med = secondSide; min = firstSide;
		}
		
		else if (thirdSide > firstSide && firstSide > secondSide){
			max = thirdSide; med = firstSide; min = secondSide;
		}
		
		else if (firstSide == secondSide && secondSide == thirdSide){
			max = med = min = firstSide = secondSide = thirdSide;
		}
		
		System.out.println("The sides are: " + max + " " + med + " " + min);
		
		if(firstSide == secondSide && firstSide == thirdSide){
			System.out.println("The triangle is: Equilateral");
		}
		else if(firstSide == secondSide && secondSide != thirdSide || firstSide == thirdSide && thirdSide != secondSide || secondSide == thirdSide && thirdSide != firstSide){
			System.out.println("The triangle is: Isosceles");
		}
		else if(max == Math.sqrt(Math.pow(med, 2) + Math.pow(min, 2))){
			System.out.println("The triangle is: Right");
		}
		else if(max > Math.sqrt(Math.pow(med, 2) + Math.pow(min, 2))){
			System.out.println("The triangle is: Acute");
		}
		else if(max < Math.sqrt(Math.pow(med, 2) + Math.pow(min, 2))){
			System.out.println("The triangle is: Obtuse");
		}
		else if(max > med + min){
			System.out.println("The triangle is: Invalid");
		}
	}
	
	System.out.println("\n*** TASK2: Identify a triangle from positions ***");
	
	double side1 = 0;
	double side2 = 0;
	double side3 = 0;
	double maxi = 0;
	double medi = 0;
	double mini = 0;
	
	System.out.print("Please input the first point, X and Y: ");
	int x1 = scan.nextInt();
	int y1 = scan.nextInt();
	System.out.println("("+ x1 + ", " + y1 + ") is the first position.");
	
	System.out.print("Please input the second point, X and Y: ");
	int x2 = scan.nextInt();
	int y2 = scan.nextInt();
	System.out.println("("+ x2 + ", " + y2 + ") is the second position.");
	
	System.out.print("Please input the third point, X and Y: ");
	int x3 = scan.nextInt();
	int y3 = scan.nextInt();
	System.out.println("("+ x3 + ", " + y3 + ") is the third position.");
	
	side1 = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2 - y1), 2));
	side2 = Math.sqrt(Math.pow((x3 - x2), 2)+ Math.pow((y3 - y2), 2));
	side3 = Math.sqrt(Math.pow((x1 - x3), 2)+ Math.pow((y1 - y3), 2));
	
	if (side1 > side2 && side2 > side3){
		maxi = side1; medi = side2; mini = side3;
	}
	
	else if (side1 > side3 && side3 > side2){
		maxi = side1; medi = side3; mini = side2;
	}
	
	else if (side2 > side1 && side1 > side3){
		maxi = side2; medi = side1; mini = side3;
	}
	
	else if (side2 > side3 && side3 > side1){
		maxi = side2; medi = side3; mini = side1;
	}
	
	else if (side3 > side2 &&  side2> side1){
		maxi = side3; medi = side2; mini = side1;
	}
	
	else if (side3 > side1 && side1 > side2){
		maxi = side3; medi = side1; mini = side2;
	}
	
	else if (side1 == side2 && side2 == side3){
		maxi = medi = mini = side1 = side2 = side3;
	}
	
	if(side1 == side2 && side1 == side3){
		System.out.println("The triangle is: Equilateral");
	}
	else if(side1 == side2 && side2 != side3 || side1 == side3 && side3 != side2 || side2 == side3 && side3 != side1){
		System.out.println("The triangle is: Isosceles");
	}
	else if(maxi == Math.sqrt(Math.pow(medi, 2) + Math.pow(mini, 2))){
		System.out.println("The triangle is: Right");
	}
	else if(maxi > Math.sqrt(Math.pow(medi, 2) + Math.pow(mini, 2))){
		System.out.println("The triangle is: Acute");
	}
	else if(maxi < Math.sqrt(Math.pow(medi, 2) + Math.pow(mini, 2))){
		System.out.println("The triangle is: Obtuse");
	}
	else if(maxi > medi + mini){
		System.out.println("The triangle is: Invalid");
	}
	
	System.out.println("\n*** END OF Assignment#3 ***");
}
}


/*
a) int num != num;
b) double total >= 97 && total <= 100;
c) String str == "ASU";
d) (a, b) = (0, 1) (1, 1)
e) (x, y) = (2, 1) (5, 4)
*/