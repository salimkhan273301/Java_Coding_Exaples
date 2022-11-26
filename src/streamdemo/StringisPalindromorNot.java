package streamdemo;

import java.util.Scanner;

public class StringisPalindromorNot {
	
	private static boolean isPalindrom(String s) {
		if(s.length()==0 || s.length()==1)
			return true;
		if (s.charAt(0)==s.charAt(s.length()-1))
			return isPalindrom(s.substring(1,s.length()-1));
		
		return false;
	}

	public static void main(String[] args) {
		
		

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String:");
		String s=sc.nextLine();
		if(isPalindrom(s))
			System.out.println("String is Palindrom");
		else
			System.out.println("String is not Palindrom:");

	}

	
}
