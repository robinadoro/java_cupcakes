package practice;

public class SwitchStatements {

	public static void main(String[] args) {
		int score = 100
			;
//		byte, short value or character value. switch can substitute if statements,it waits for the condition to be true.
		switch (score) {
//		whenever a case it defined without a break, it goes to the next case statement
		case 100:
		case 99:
		case 66:
		case 90:
			System.out.println("Very Good");
			break;
//			Break, breaks out of the switch statement
		case 40:
			System.out.println("Ok");
			break;
		case 60:
			System.out.println("Good");
			break;
//		if the conditions are not met default acts on them. it iis the else condition in the switch statements
		default:
			System.out.println("The Grades are not defined");
			break;
//			
		}

	}

}
