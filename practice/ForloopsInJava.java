package practice;

public class ForloopsInJava {

	public static void main(String[] args) {
		// it is the same as a while loop but you have more control
		int [] myintarray = {100,31,26,48,52};
		
		for(/*init;expression;increment*/ int index=0; index<5; index++  ) {
			System.out.println(myintarray[index]);
		}
		
		System.out.println("-----------------------");
//			element goes over the array one by one and stored the value one by one
		for (int element : myintarray ) {
			System.out.println(element);
		}
//			for loop initialises your variable and then checks the expression if value of index is less than 5 then executes your statement and increment the value by 1
		
	}

}
