package practice;

public class ArraysInJava {

	public static void main(String[] args) {
		// arrays are like variables but can store more than one value at a time but only the same type of values/data types.
		int[] myintarray = {1098,254,30,4565,57};
//		()other ways of declaring an array 
//		int[] myIntArray = new int[3];(shows the number of values that will be in array)
//		int[] myIntArray = [1,2,3];
//		int[] myIntArray = new int[]{1,2,3};
		
		int index = 0;
		while (index <6) {
//			always remember the size of your array because if you put an index more than the number of values, the console will print out an error.
		System.out.println(myintarray[index]);
		index++;
		}
		
		
	}

}
