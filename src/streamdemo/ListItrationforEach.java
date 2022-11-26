package streamdemo;

import java.util.ArrayList;
import java.util.List;

public class ListItrationforEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Hasan");
		list.add("Rehan");
		list.add("Nadeem");
		list.add("Ajeet");
		list.add("Qasim");
		list.add("Hasim");
		list.stream().forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		list.stream().filter(s->s.startsWith("H")).sorted().forEach(x->System.out.print(x+"\t"));
		System.out.println("\n-------------------------------------------------------------");
		list.stream().sorted().forEach(x->System.out.print(x+"\t"));

	}

}
