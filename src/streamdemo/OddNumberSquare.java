package streamdemo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class OddNumberSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		IntStream.range(1, n).filter(num->num%2==1).map(num->num*num).forEach(x->System.out.print(x+"\t"));

	}

}
