 package Programs;

import java.util.HashSet;

public class DuplicatesInArray{
	
	public static void main(String args[]) {
		
		String[] str = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" }; 
		

		/*for (int i=0;i<str.length;i++) 
		  { 
			for (int j=i+1;j<str.length;j++) 
			{ 
				if (str[i].equals(str[j]) ) 
				{ 
					System.out.println("duplicate found :"+str[j]);
				}
				*/
				HashSet<String> set = new HashSet<String>();
				 
		        for (String a : str)
		        {
		            if(!set.add(a))
		            {
		                System.out.println("Duplicate Element is : "+a);
		            }
		        }
      }
	 
  }

		  
	


