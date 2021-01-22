public class Calculator {
	public static void main(String[] args) {
		double answer = 0, num1 = 0, num2 = 0;

		//	TODO 	This code is only for the teacher
		//	this code is crippled in the repo.
		//	Do not commit it
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
				case "cos":		case "rand":	case "sqrt":
					num2 = Utils.getDouble("1st # : ");
					varCount = 1;
					break;
				default: varCount = -1;
			}
			switch (operator) {
				case "+"	:	answer = num1 + num2;	break;
				case "-"	:	answer = num1 - num2;	break;
				case "*"	:	answer = num1 * num2;	break;
				case "/"	:	answer = num1 / num2;	break;
				case "%"	:	answer = num1 % num2;	break;
				case "pi"	:	answer = Math.PI;		break;
				case "^"	:	answer = Math.pow(num1, num2);	break;
				case "cos"	:	answer = Math.cos(num2);	break;
				case "sqrt"	:	answer = Math.sqrt(num2);	break;
				case "rand"	:	answer = Math.floor(Math.random()* num2);break;
				//  abs     absolute value. Look at Math.????
				case    "abs"    : answer = Math.abs(num1);        break;
				case    "PI"     : answer = Math.PI;              break;
				case    "inv"    : answer = 1 / num1;            break;
				case    "10"     : answer = Math.pow(10,num1);    break;
				case    "age"    : answer = num1 * 365.24 * 24 * 60 * 60;    break;
				default          : answer = 0;           break;
			}
			switch (varCount) {
				case 0	:	System.out.println(operator 			 + " = " + answer);					break;
				case 1	:	System.out.println(operator + " " + num1 + " = " + answer);					break;
				case 2	:	System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);	break;
			}
		}
	}
}
