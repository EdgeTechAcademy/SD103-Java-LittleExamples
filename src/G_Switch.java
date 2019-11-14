public class G_Switch {
	public static void main(String[] args) {
		int firstNum;
		boolean areWeStillGoing = true;

		while (areWeStillGoing) {
			firstNum = Utils.getNumber("Enter -1 to stop.\nGive me a number: ");
			switch (firstNum) {
				case 0: System.out.println("nothing"); 						break;
				case 1: System.out.println("One is the loneliest number"); 	break;
				case 2: System.out.println("Number " + firstNum); 			break;
				case 3: System.out.println("1 + 2 = " + firstNum); 			break;
				case -1: areWeStillGoing = false;							break;
			}
		}
	}
}
