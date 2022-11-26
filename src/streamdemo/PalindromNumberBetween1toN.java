package streamdemo;

import java.util.Scanner;

public class PalindromNumberBetween1toN {
	private static boolean isPalindrom(int i) {
		int num=i;
		int r,s = 0;
		while(num!=0)
		{
			r=num%10;
			s=s*10+r;
			num=num/10;
			
		}
		if(s==i)
		return true;
		return false;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the LastPoint:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			
			if(isPalindrom(i))
				System.out.print(i+"\t");
		}

	}

	
}
