package Programs;

import java.util.Scanner;

public class practice {
	
	
	/**
	1 
	1 2 
	1 2 3 	
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 5 6 	 */
	/*
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++){
			
			for(int j=1;j<=i;j++){
				
				System.out.print(j+" "); //"*"+" "
			}
			System.out.println();
		}
	}*/
	
	/**
	    1 
		2 2 
		3 3 3 
		4 4 4 4 
		5 5 5 5 5 
		6 6 6 6 6 6 
		7 7 7 7 7 7 7 
	 */
	/*public static void main(String[] args) {
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			
			System.out.println();
		}
	}*/
	
	/**
	 *  1 2 3 4 5 6 
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1
	 */
	
	/*public static void main(String[] args) {
		
		for(int i=6;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}*/
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
		
		
		
	}

}
