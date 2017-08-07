package Programs;


import java.util.Arrays;

public class secondlargestno {

	
public static void main(String[] args) {
	
	int a[] ={1,6,2,39,45,9};
	Arrays.sort(a);
	System.out.println("first : "+a[a.length-1]);
	System.out.println("second : "+a[a.length-2]);
}
}
