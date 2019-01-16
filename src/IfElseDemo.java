class IfElseDemo {
	public static void main(String[] args) {
		int testScore = (args.length == 1) ? Integer.parseInt(args[0]) : 78;

		//testScore = Utils.getNumber("What was your score? ", 100);
		char grade;
		if (testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(testScore + " Grade = " + grade);

		//	create two variables
		int num1, num2, ans=0;

		//	ask the user for two numbers.
		num1 = Utils.getNumber("Give me a number? ");
		num2 = Utils.getNumber("Give me another number? ");

		//	if the first number is less than 100 multiply the two numbers and print the result
		//	if the first number is less than 200 add them together
		//	if the first number is less than 300 substract them
		System.out.println("ans is = " + ans);
	}
}