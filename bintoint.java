package Programs;

import java.util.Scanner;

public class bintoint {

	public static void main(String[] args) {
		
			/***** binary to integer  ****/
		 Scanner in = new Scanner( System.in );
		 System.out.println("Enter a binary number: ");
		 String binaryString =in.nextLine();
		 
		 System.out.println("Result bin to int: "+Integer.parseInt(binaryString,4));
		 
		 /***********int to binary************/
		 
		 System.out.println("int to bin: "+Integer.toBinaryString(29));

		 

		
	}
}
