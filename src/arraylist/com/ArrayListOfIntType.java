package arraylist.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


public class ArrayListOfIntType {

	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, arr);
		// filter all the element greater than 2 and divisible by 3.....
		list.stream().filter(x -> x > 2).filter(y -> y % 3 == 0).forEach(System.out::println);
		
	// get sum of list using stream....	
	Optional<Integer> sum=	list.stream().reduce((x,y)->x+y);
	
	System.out.println("Sum of List Element = "+sum.get());
	
	
	// get max from list...
	
	Optional<Integer> y=list.stream().max(Integer::compare);
	System.out.println("MAX VALUE FROM LIST "+y.get());

	}

}
