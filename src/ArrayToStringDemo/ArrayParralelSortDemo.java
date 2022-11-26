package ArrayToStringDemo;

import java.util.Arrays;

public class ArrayParralelSortDemo {

	public static void main(String[] args) {
		int[] arr= {2,1,4,6,55,44,98,100};
		System.out.println("Before Sorting the Array:");
		System.out.println(Arrays.toString(arr));
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(x->{
			System.out.print(x+",");
		});

	}

}
