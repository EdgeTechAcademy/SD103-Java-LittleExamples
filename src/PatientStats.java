import jdk.jshell.execution.Util;

public class PatientStats {
	public static void main(String[] args) {
		String name 	= Utils.getInput("Patient Name :        ");
		double temp 	= Utils.getDouble("Body Temp:           " );
//		int bpHi 		= Utils.getNumber("Blood Pression (high)");
//		int bpLo  		= Utils.getNumber("Blood Pressure (low) ");
		double height 	= Utils.getDouble("Height in meters:    " );
		int weight      = Utils.getNumber("Weight:              " );
		int age  		= Utils.getNumber("your age");
		int scale 		= Utils.getNumber("on a scale of 1 to 5");
//+96		String reason   = Utils.getInput("Reason for visit");

		String comment = "";
		if (  temp < 72 ) {
			comment = "You've been dead for several days\n";
		} else if ( temp >= 72 && temp < 87.5) {
			comment = "recently dead\n";
		}else if ( temp >= 87.5 && temp < 96) {
			comment = "get a blanket\n";
		}else if ( temp >= 96 && temp < 99) {
			comment = "Normal\n";
		}else if ( temp >= 99 && temp < 102) {
			comment = "Take an aspirin\n";
		}else if ( temp >= 102 && temp < 106) {
			comment = "Call the ER\n";
		} else {
			comment = "Call CDC. This guy is contagious\n";
		}

		if (height < 1.5) {
			comment = comment + "take growth hormones";
		} else if ( height > 2.4 ) {
			comment += "play for Mavs";
		} else {
			comment += "Patient is normal height";
		}

		switch (scale) {
			case	1	:	comment += "Patient feels terrible\""; break;
			case	2	:	comment += "atient has had worse days but not many"; break;
			case	3	:	comment += "meh"; break;
			case	4	:	comment += "Why are they here, if they feel this good?"; break;
			case	5	:	comment += "Patient probably just got as job as a programmer"; break;
		}
		System.out.println(name + " status " + comment);
	}
}
