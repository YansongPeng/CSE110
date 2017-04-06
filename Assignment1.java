//**********************************************************************
//Name: Yansong Peng
//Title: Assignment1.java
//Author: Yansong Peng
//Description: Print the information of a character of game you like.
//Time spent: 20 minutes
//Date: 1/31/2014
//**********************************************************************
public class Assignment1 {
	public static void main(String[] args)
	{
		String charaName = "Kobe Bryant";
		String gameName = "NBA 2K14";
		int relesDate = 2013;
		double hours = 225.5;
		String clear = "Yes";
		
		System.out.println("Name of character: " + charaName);
		System.out.println("Name of Game: " + gameName);
		System.out.println("Year of Release: " + relesDate);
		System.out.println("Total Hours Played: " + hours);
		System.out.println("Cleared: " + clear);
		System.out.println(charaName + ", " + gameName + ", " + relesDate + ", " + hours + ", " + clear);
		System.out.println('\"' + charaName + "\" \"" + gameName + "\" \"" + relesDate + "\" \"" + hours + "\" \"" + clear + '\"');
		System.out.println(charaName + "\\" + gameName + "\\" + relesDate + "\\" + hours + "\\" + clear);
	}
}

/*
The answer in Program#1
a) It was not compiled successfully because file name should be same as class name.
b) It was not compiled successfully because there is syntax error on token, it is a misplaced construct.
c) It does not generate any compile-error, but it is useless, I do not think it's meaningful.
d) It was not compiled successfully because there is a syntax error, the ClassBody isn't complete.
e) It does not generate any compile-error, but it is not accurate, it cannot show the decimal number; so the "Average Score" became 0.
*/