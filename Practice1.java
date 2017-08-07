package Programs;

import java.util.Scanner;

public class Practice1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int n = scan.nextInt();
		
		for(int i=1;i<=n/2;i++)
				if(n%i==0){
			
			System.out.println("perfect number");
		}
		else{
			System.out.println("not perfect number");
		}
		
	}

}
