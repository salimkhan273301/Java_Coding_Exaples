package streamdemo;

import java.util.Scanner;

public class SumisEqualto6 {
	private static int sum(int i) {
		int r,s = 0;
		while(i!=0)
		{
			r=i%10;
			s=s+r;
			i=i/10;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Last Point:");
		int n=sc.nextInt();
		for(int i=0; i<=n; i++)
		{
			if(sum(i)==6)
				System.out.print(i+"\t");
		}

	}

	

}
