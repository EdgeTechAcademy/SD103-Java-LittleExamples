import jdk.jshell.execution.Util;

public class PatientStats {
	public static void main(String[] args) {
		String name 	= Utils.getInput("Patient Name : ");
		double temp 	= Utils.getDouble("Body Temp: " );
		double height 	= Utils.getDouble("Height in metters: " );
		int bpHi 		= Utils.getNumber("bp high");
		int bpLo  		= Utils.getNumber("bp low");
		int scale 		= Utils.getNumber("on a scale of 1 to 5");

		String comment = "";
		if (  temp < 72 ) {
			comment = "dead";
		} else if ( temp >= 72 && temp < 87.5) {
			comment = "recently dead";
		}else if ( temp >= 87.5 && temp < 96) {
			comment = "recently dead";
		}else if ( temp >= 96 && temp < 99) {
			comment = "recently dead";
		}else if ( temp >= 72 && temp < 87.5) {
			comment = "recently dead";
		}else if ( temp >= 72 && temp < 87.5) {
			comment = "recently dead";
		}

		if (height < 1.5) {
			comment += "hormones";
		} else if ( height > 2.4 ) {
			comment += "play for Mavs";
		}

		switch (scale) {
			case	1	:	comment += ""; break;
			case	2	:	comment += ""; break;
			case	3	:	comment += ""; break;
			case	4	:	comment += ""; break;
			case	5	:	comment += ""; break;
		}
		System.out.println(name + " status " + comment);
	}
}
