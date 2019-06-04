package practice;

public class MethodInJava {

	public static void main(String[] args) {
		// is a piece of code that executes some logic
		int sum = Add(100,200,300);
		int result = sum * 15;
		System.out.println(result);
		
		
		

	}
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	public static int Add (int a, int b, int c) {
//		System.out.println(a + b + c);
		return (a + b + c);
	}
//	to return something write it on the return type i.e Void
	 
	
}
