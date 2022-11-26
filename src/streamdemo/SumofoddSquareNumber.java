package streamdemo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumofoddSquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		long x=IntStream.range(1,n).map(num->num*num).filter(num->num%2==0).sum();
		System.out.println(x);

	}

}
