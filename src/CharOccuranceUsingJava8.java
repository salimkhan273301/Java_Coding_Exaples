import java.util.Scanner;

public class CharOccuranceUsingJava8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String str="salimullah";
		System.out.println(str);
		System.out.println("Please Enter the Char you want to count:");
		char c=sc.nextLine().charAt(0);
		long count=str.chars().filter(x->x==(char)c).count();
		//System.out.println(count);
		System.out.format("Occurance Of %c in the String : %d ",c,count);
}

}
