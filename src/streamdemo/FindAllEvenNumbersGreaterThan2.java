package streamdemo;

import java.util.stream.IntStream;

public class FindAllEvenNumbersGreaterThan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find all even numbers greater than 2
		IntStream.of(1, 2, 3, 4, 5,6,8,12).filter(n-> n > 2).filter(n-> n % 2 == 0).forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		IntStream.range(1, 100).filter(x->x>50).filter(x->x%2==0).forEach(System.out::println);

	}

}
