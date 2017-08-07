package Programs;

import java.util.ArrayList;

public class Uniquenumberarray {
	public static void main(String[] args) {
		
		
			 
		 int a[] = {2,4,1,5,2,3,7,4,7,4,8,3,1,0} ;
				
		  ArrayList<Integer>ab =new ArrayList<Integer>(); 
		
		for(int i=0;i<a.length;i++) 
			{ 
				int k=0; 
				
			 if(!ab.contains(a[i]))
			    { 
				  ab.add(a[i]);
				    k++; 
			for(int j=i+1;j<a.length;j++) //for(int j=0;j<1;j++)
			{ 
				if(a[i]==a[j]) 
				{ 
					k++;
				} 
				}
			//System.out.println(a[i]); 
			//System.out.println(k); 
			if(k==1) System.out.println(a[i] +" is unique number"); 
			
			    } }
			
		
		
		
		
		
}
}

