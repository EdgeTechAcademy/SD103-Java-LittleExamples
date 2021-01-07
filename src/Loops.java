public class Loops {
	public static void main(String[] args) {
		String[] courses = { "Java", "C Sharp", "JavaScript", "HTML", "SQL", "MongoDB"};

		//	just your basic for loop
		for (int i = 0; i < courses.length; i++) {
			System.out.println(courses[i]);
		}

		//	the enhanced for loop
		for ( String nextCourse : courses) {
			System.out.println("Course taught at Edge Tech: " + nextCourse);
		}

		int stop = 0;
		while (stop >= 0) {			//	the while loop is PRE test loop
			stop = Utils.getNumber("while - Enter -1 to stop ");
		}

		do {						//	the do while is a POST test loop
			stop = Utils.getNumber("do-while Enter -1 to stop ");
		} while (stop >= 0);
	}
}
