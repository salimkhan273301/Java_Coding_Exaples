package streamdemo;

import java.util.Scanner;

public class ReverseStringByArr {

	
		private static String revStr(String s) {
			
			char[] str=s.toCharArray();
			String s1="";
			for(int i=str.length-1; i>=0;i--)
			{
				s1+=str[i];
			}
			return s1;
		}


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String:");
			String s=sc.nextLine();
			String reversestring=revStr(s);
			System.out.println(reversestring);


		

	}

}
