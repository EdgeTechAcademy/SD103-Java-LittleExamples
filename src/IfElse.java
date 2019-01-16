public class IfElse {
	public static void main(String[] args) {
		//	create two variables
		int num1, num2, ans=0;

		//	ask the user for two numbers.
		num1 = Utils.getNumber("Give me a number? ");
		num2 = Utils.getNumber("Give me another number? ");


		if (num1 < 100) {			//	if the first number is less than 100 multiply the two numbers and print the result
			ans = num1 * num2;
		} else if ( num1 < 200) {	//	if the first number is less than 200 add them together
			ans = num1 + num2;
		} else if (num1 < 300) {	//	if the first number is less than 300 substract them
			ans = num1 - num2;
		}
		System.out.println("num1: " + num1 + ", num2: " + num2 + " The answer is " + ans);
	}
}
