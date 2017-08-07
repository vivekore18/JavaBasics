package Programs;

public class largestnumber {
	
	public static void main(String[] args) {
		
		int a[]={999,2,54,15,40,100,20,011,299,30,499,699,66,77};
		 int smallest = a[0];
         int largetst = a[0];
        
         for(int i=1; i<a.length; i++)
         {
                 if(a[i] > largetst)
                         largetst = a[i];
                 else if (a[i] < smallest)
                         smallest = a[i];
                
         }
        
         System.out.println("Largest Number is : " + largetst);
         System.out.println("Smallest Number is : " + smallest);
 }
}