package practice;

public class whileLoopstatement {

	public static void main(String[] args) {
		// a loop which a piece of code/ statement which executes a block of code again and again until some condition is met 
		int a = 20;
		while(a <= 10) {
			System.out.println(a);
			a++;
		}
			System.out.println("-------------------------");
//		while loop first evaluates the condition then executes the statement, while do executes first then evaluates the condition
		int b = 20;
		do {
			System.out.println(b);
			b++;
			
		}while (b <= 10);
		
		
		
	}

}
