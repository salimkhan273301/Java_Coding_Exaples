package streamdemo;

import java.util.Scanner;

public class ReverseString {
	private static String revStr(String s) {
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
	
		
		
		
		
		
		return sb.toString();
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String reversestring=revStr(s);
		System.out.println(reversestring);


	}


}
