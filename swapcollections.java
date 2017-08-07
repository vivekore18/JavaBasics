package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swapcollections {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("before swaping "+list);
		Collections.swap(list, 2, 3);
		System.out.println("after swaping "+list);
		
		Collections.reverse(list);
		System.out.println("after reverse "+list);
		
	}
}
