package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class arraysorts{
	
	public static void main(String args[]) { 
	    
        //Creating and populating ArrayList in Java for Sorting 
        ArrayList<String> unsortedList = new ArrayList<String>(); 
        
        unsortedList.add("Java"); 
        unsortedList.add("C++"); 
        unsortedList.add("J2EE"); 
        
        System.out.println("unsorted ArrayList in Java : " + unsortedList); 
        
        //Sorting ArrayList in ascending Order in Java 
        Collections.sort(unsortedList); 
        System.out.println("Sorted ArrayList in Java - Ascending order : " + unsortedList); 
        
        //Sorting ArrayList in descending order in Java 
        Collections.sort(unsortedList, Collections.reverseOrder()); 
        System.out.println("Sorted ArrayList in Java - Descending order : " + unsortedList); 
    } 
} 

