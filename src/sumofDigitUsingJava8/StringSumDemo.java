package sumofDigitUsingJava8;

public class StringSumDemo {

	public static void main(String[] args) {
		String s="12345";
		//char[] arr=s.toCharArray();
		s=s.chars().mapToLong(Character::getNumericValue).sum()+"";
		System.out.println(s);
		
	}

}
