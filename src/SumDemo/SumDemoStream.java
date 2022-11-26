package SumDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalLong;

public class SumDemoStream {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("22321222","5678","7654","876545","43345","764576");
		List<String> sumlist=new ArrayList<String>();
		for(String s:list) {
		String x=s.chars().mapToLong(Character::getNumericValue).filter(y->y%2==0).count()+"";
		sumlist.add(x);
		}
		
		System.out.println(sumlist.toString());
		for(String s:sumlist) {
			String x=s.chars().mapToLong(Character::getNumericValue).max()+"";
			System.out.println(x);
			}
	}

}
