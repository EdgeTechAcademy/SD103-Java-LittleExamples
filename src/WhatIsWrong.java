import jdk.jshell.execution.Util;

public class WhatIsWrong {
	public static void main(String[] args) {

//  print "I am looping i = #" from 1 to 7
		for (int i = 1; i <= 7; i++) {
			System.out.println("I am looping i = " + i);
		}

//  print "loop number "" from -5 to 5
		for (int i = -5; i < 6; i++) {
			System.out.println("loop number " + i);
		}
//  print these messages 5 times
// loop number # = 0
// here I am
// loop number # = 1
// here I am
// loop number # = 2
// here I am
// loop number # = 3
// here I am
// loop number # = 4
// here I am
		for (int i = 0; i < 5; i++) {
			System.out.println("Loop # = " + i);
			System.out.println("Here I am");
		}
//  This while loop should print out the loopCnt until it hits 5
		int loopCnt = Utils.getNumber("Enter a number less than 10", 10);
		while (loopCnt > 5) {
			System.out.println("loopCnt = " + loopCnt);
			loopCnt--;
		}

		int studentId = Utils.getNumber("ID ");
		System.out.println("StudentId = " + studentId);

		float studentAge;
		studentAge = 24.5f;       // fix the assignment so that you set the students age to 24.5

		//		( this is a paren
		//		{ this is a curly or handlebars
		  /* print out messages about the year*/
		int year = Utils.getNumber("What year is it? ");
		if (year < 1980) {
			System.out.println("Who cares about time before 1980");
		}
		else if (year < 1990) {
			System.out.println("pfft! Who cares about Gen Y");
		}
		else if (year > 1995) {
			System.out.println("Shout out to Millenials");
			System.out.println("Millenials! Rule!");
		}

		//   list of Race Horses
		String[] raceHorces = new String[8];
		raceHorces[7] = "Rana is so Wrong!!";

		raceHorces[0] = "Seabiscuit";
		raceHorces[1] = "Man O'War";
		raceHorces[2] = "Shut Out";
		raceHorces[3] = "Behave Yourself";
		raceHorces[4] = "Lucky Debonair";
		raceHorces[5] = "Pink Star";
		raceHorces[6] = "Aristides";

		System.out.println("Last horse in list " + raceHorces[6]);    // print the last horse
		System.out.println("Last horse in list " + raceHorces[raceHorces.length-1]);    // print the last horse
		System.out.println("First horse in list " + raceHorces[1]);    // print the first horse

		// print the city names
		String[] aNames = {"Austin", "Dallas", "Fort Worth", "Arlington", "Houston", "Lubbock"};
		for (String aName : aNames) {
			System.out.println("aName = " + aName);
		}
		String[] trains = {"The City of New Orleans", "California Zephyr",
							"Capital Corridor", "Coast Starlight", "Empire Service"};
	}
}
