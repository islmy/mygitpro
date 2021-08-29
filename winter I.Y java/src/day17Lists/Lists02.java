package day17Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		// this time with int. 
		
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(3);
		list1.add(5);
		list1.add(4);
		list1.add(13);
		list1.add(1);
		list1.add(89);
		
		System.out.println(list1); // [3, 5, 4, 13, 1, 89]
		
		Collections.sort(list1); //------SORTED-----
		
		System.out.println(list1); // [1, 3, 4, 5, 13, 89]
		
		
		
		/*
		 * type a code to fid min and max value of list2  
		 */

		List<Integer> list2 = new ArrayList<>();
		
		
		list1.add(7);
		list1.add(2);
		list1.add(34);
		list1.add(15);
		list1.add(78);
		list1.add(9);
		
		Collections.sort(list2);
		System.out.println(list2); //now in ascending order
		
		int minNum = list2.get(0);
		System.out.println(minNum); 
		
		int maxNum = list2.get(list2.size()-1);
		System.out.println(maxNum);
		
		
		// now do remove method
		
		
		
	}

}
