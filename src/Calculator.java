public class Calculator {
	public static void main(String[] args) {
		double answer = 0, num1 = 0, num2 = 0;

		while(true) {
			String operator = Utils.getInput("Operator: ");

			if( operator.equalsIgnoreCase("die"))		break;
			if( operator.equalsIgnoreCase("skip"))		continue;
			int varCount = 0;

			switch (operator) {
				case "+":	case "-":	case "*":
				case "/":	case "%":	case "^":
					num1 = Utils.getDouble("1st # : ");
					num2 = Utils.getDouble("2nd # : ");
					varCount = 2;
					break;
			}
			switch (operator) {
				case "+"	:	answer = num1 + num2;	break;
				case "-"	:	answer = num1 - num2;	break;
			}
			switch (varCount) {
				case 0	:	System.out.println(operator 			 + " = " + answer);					break;
			}
		}
	}
}
