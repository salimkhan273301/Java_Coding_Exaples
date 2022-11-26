package arraylist.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertyingArrayListOfIntegerInToStream {

	public static void main(String[] args) {
		
		// convert arraylist of integer to Stream of integer....
		List<Integer> list= Arrays.asList(12,1,2,3,4,5,6,7,8,9,10,11);
		
		Stream<Integer> list1=list.stream();
		list1.forEachOrdered(System.out::println);

	}

}
