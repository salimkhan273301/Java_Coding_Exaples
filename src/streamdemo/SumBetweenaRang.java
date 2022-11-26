package streamdemo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumBetweenaRang {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Last Point:");
		
		int n=sc.nextInt();
		
		int sum=IntStream.range(0, n+1)
				.sum();
		System.out.println(sum);
	}

}
