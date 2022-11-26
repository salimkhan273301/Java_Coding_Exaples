package arraylist.com;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {

Long count=IntStream.of(1,2,3,8,88,98,45,44).filter(x->x%2==0).count();
System.out.println(count);

// get sum of int stream using reduction method

OptionalInt op_int=IntStream.of(1,2,3,4,5).reduce((a,b)->a+b);
System.out.println("Sum = "+op_int.getAsInt());

	}

}
