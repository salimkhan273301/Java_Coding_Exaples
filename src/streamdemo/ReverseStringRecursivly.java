package streamdemo;

import java.util.Scanner;

public class ReverseStringRecursivly {
	private static String revStr(String s) {
		if(s.isEmpty())
			return s;
		
		//return revStr(s.substring(1))+s.charAt(0);
		
		System.out.print(s.charAt(s.length()-1));
		return revStr(s.substring(0, s.length()-1));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String reversestring=revStr(s);
		System.out.println(reversestring);

	}

	

}
