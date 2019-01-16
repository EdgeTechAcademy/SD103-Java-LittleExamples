import java.util.Calendar;
import java.util.Date;

public class F_If {
	public static void main(String[] args) {

		//  or the highway of Java?
		//  we ask questions and change our direction if needed
		//  for instance what should we do during the day??
		Calendar date = Calendar.getInstance();
		int hour = date.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hour = " + hour);
		if (hour < 7) {
			System.out.println("Let me sleep");
		}
		if (hour >= 23) {
			System.out.println("class dismissed");
		}
		if (hour == 12 || hour == 18) {
			System.out.println("let's have lunch or dinner");
		}


		//  You have several choices when it comes to comparing things
		//  if ( a == 100 )     == are the values the same?
		//  if ( a != 100 )     != are the values the different?
		//  if ( a > 100 )      >  is the value on the left greater than the value on the right?
		//  if ( a >= 100 )     >= is the value on the left greater than or EQUAL TO the value on the right?
		//  if ( a < 100 )      <  is the value on the left less than the value on the right?
		//  if ( a <= 100 )      <= is the value on the left less than or EQUAL TO the value on the right?
		//  if the answer is true then do the block of code right below the if
		//  if the answer is false then jump down to the ELSE block of code and do that

		//  TODO Assignment
		//      create 3 or 4 different int variables, assign them some values between -10 and 10
		//      test them to see which ones are different, equal or < or > - print out a message
		//      change the values several times and just prove to yourself that the code works
		//      you will need an else to print if they are NOT < or > or whatever you choose

		//  TODO Assignment
		//  	create a set of expressions for what you are doing each day of the week
		int dow = date.get(Calendar.DAY_OF_WEEK);
		if (dow == Calendar.SUNDAY) {
			System.out.println("Going to Church");
		}
		else if (dow == Calendar.MONDAY) {
			System.out.println("Start class again");
		}
		else if (dow == Calendar.TUESDAY) {
			System.out.println("pretty much the same as monday");
		}
		else if (dow == Calendar.WEDNESDAY) {
			System.out.println("half day at school");
		}

		////////////////////////
		String activity = "";
		switch (dow) {
			case	Calendar.SUNDAY		:	activity = "Going to Church";			break;
			case	Calendar.MONDAY		:	activity = "Start class again";			break;
			case	Calendar.TUESDAY	:	activity = "same as monday";			break;
			case	Calendar.WEDNESDAY 	:	activity = "half day at school";		break;
			case	Calendar.THURSDAY 	:	activity = "weekend begins";			break;
			case	Calendar.FRIDAY 	:	activity = "no school";					break;
			case	Calendar.SATURDAY	:	activity = "stuff and things";			break;
			default : 						activity = ""; 							break;
		}
		System.out.println("activity = " + activity);

		//	https://github.com/EdgeTechAcademy/JavaCode.git
		String option = Utils.getInput("Type Programming Language");
		//	compare to		here's your message
		//	java 			print January
		//	c# 				print feb
		//	javascript 		print april

///////////////////////////////////

		//	use a switch statement to print what you do each day of the week

		//  TODO Assignment
		//      create a set of expressions to print the likely weather for each month of the year
		if (date.get(Calendar.MONTH) == Calendar.JANUARY) {
			System.out.println("Cold");
		}
		if (date.get(Calendar.MONTH) == Calendar.FEBRUARY) {
			System.out.println("Colder");
		}
		//	and so on

		//  how do we compare strings? They are not numbers but Aarvark is less than Apple
		//  The String object has several compare methods
		String animal = "Aardvark";
		String fruit = "Apple";
		//  compareTo will return
		//      a negative number if the string is less than the string being compared to
		//      0 if they are equal
		//      a positive number if the string is greater than the compared string
		if (animal.compareTo(fruit) > 0) {
			System.out.println("animal = " + animal + " is greater than " + fruit);
		} else {
			System.out.println("fruit = " + fruit + " is greater than " + animal);
		}

		//  equals will return true or false if the strings match or do not match
		String newAnimal = "aardvark";
		if (animal.equals(newAnimal)) {
			System.out.println("the animal " + animal + " is indeed an Aardvark");
		} else {
			System.out.println("the animal " + animal + " is NOT an " + newAnimal);
		}

		//  equalsIgnoreCase will also compare but ignores the differences between upper and lower case
		if (animal.equalsIgnoreCase(newAnimal)) {
			System.out.println("the animal " + animal + " is indeed an " + newAnimal);
		} else {
			System.out.println("the animal " + animal + " is NOT an " + newAnimal);
		}
		//  compareToIgnoreCase is also available

		String where = Utils.getInput("Where did live? ");
		if (where.equalsIgnoreCase("Orem")) {
			System.out.println("I was between 1 and 19 or between 22 and 26");
		}


		int testscore = (args.length == 1) ? Integer.parseInt(args[0]) : 33;
		char grade;
		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}
}
