package ArrayToStringDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMapnadFilterDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		ArrayList<Integer> list2=(ArrayList<Integer>) list.stream()
				.map(x->x*x)
				.limit(list.size()-2)
				.filter(y->y>=16)
				.collect(Collectors.toList());
		System.out.println(list2.toString());
	}

}
