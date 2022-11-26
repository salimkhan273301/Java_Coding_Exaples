package streamdemo;

import java.util.stream.Stream;

public class Streamdemo1 {

	public static void main(String[] args) {
		//Stream.iterate(0, x->x+3).limit(11).forEach(System.out::println);

		Stream.iterate(1, x->x+1).filter(y->y%3==0).limit(10).forEach(System.out::println);
	}

}
