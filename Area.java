package Programs;


import java.util.Scanner;

public class Area {
	
	
	public static void main(String[] args) {
		
		int radius = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of r");
		 radius = sc.nextInt();
		int pi = (int) Math.PI;
		double area = pi*radius*radius;
		
		System.out.println(area);
		
		
		 
		
}
}
