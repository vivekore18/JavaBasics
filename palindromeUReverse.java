package Programs;

import java.util.Scanner;

public class palindromeUReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values in palindrome ");
		String input = sc.nextLine();
		
		StringBuffer original = new StringBuffer(input);
		StringBuffer reverse = new StringBuffer(original).reverse();
		
		if(original.toString().equals(reverse.toString()))
			//strOriginal.toString()).compareTo(strReverse.toString())==0
			//String.valueOf(strOriginal).equals(String.valueOf(strReverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}


			
}
}
