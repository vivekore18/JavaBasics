 package Programs;

import java.util.Arrays;

public class Anagram {
	
	
	public static boolean isanagram(String s1,String s2){
		
		char[] A =	s1.toCharArray();
        char[] B =	s2.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A, B);
    			
	}
	 
	public static void main(String[] args) {
		String s1= "Save";
		String s2 = "vaSe";
		
		System.out.println(isanagram(s1,s2));
		
					
	}}
