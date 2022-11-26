package streamdemo;

import java.util.stream.IntStream;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.range(1, 11).map(x->x*x).forEach(System.out::println);
		System.out.println("--------------------------------------------------------");
		
		long x=IntStream.range(1, 11).map(n->n*n).sum();
		System.out.println(x);

	}

}
