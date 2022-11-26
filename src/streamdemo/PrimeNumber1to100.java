package streamdemo;

import java.util.Scanner;

public class PrimeNumber1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting point:");
		int a=sc.nextInt();
		System.out.println("Enter ending point:");
		int b=sc.nextInt();
		for(int i=a; i<=b; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0) {
					count+=1;
				}
			}
			if(count==2)
			{
				System.out.print(i+"\t");
			}
		}

	}

}
