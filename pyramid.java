package Programs;

public class pyramid {
	
	public static void main(String[] args) {
		
			//int a=9 ;	
		  for(int i=0;i<5;i++) {
	         for(int j=0;j<5-i;j++) {                               
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("* ");
	            //System.out.print(a+++" ");
	        }
	        System.out.println();  

	    }

	}
	
}
