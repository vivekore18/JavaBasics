package Programs;

import java.util.Scanner;

public class palindromeWReverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		String input = sc.nextLine();
				
		char [] string = input.toCharArray();
		String Output ="";
		
		for(int i=string.length-1;i>=0;i--)
		{
			Output= Output+string[i];
		}
		
		if(input.toString().equals(Output.toString()))
		{
		    System.out.println("palindrome");	
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
	}

}
