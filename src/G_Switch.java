public class G_Switch {
	public static void main(String[] args) {
		int firstNum;
		boolean areWeStillGoing = true;

		while (areWeStillGoing) {
			firstNum = Utils.getNumber("Enter -1 to stop.\nGive me a number: ");
			switch (firstNum) {
				case 0: System.out.println("nothing"); 						break;
				case 1: System.out.println("One is the loneliest number"); 	break;
			}
		}
	}
}
