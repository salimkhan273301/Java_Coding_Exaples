package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfIntegerToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Step 1. Creating list of integer.");
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(11);
		listOfIntegers.add(12);
		listOfIntegers.add(13);
		listOfIntegers.add(14);
		
		System.out.println("Step 2. Converting list (ArrayList) of integer to stream.");
		Stream<Integer> streamOfInteger = listOfIntegers.stream();
		
		System.out.println("Step 3. Display stream of integer: ");
		streamOfInteger.forEach(System.out::println);

	}

}
