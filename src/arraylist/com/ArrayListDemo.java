package arraylist.com;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("salim");
		list.add("nadeem");
		list.add("hasan");
		list.add("rehan");
		list.add("sajid");
		list.add("salma");
		list.add("tahir");
		list.add("zahid");

		// sorting using stram api
		list.stream().sorted().forEach(System.out::println);

		System.out.println("================================================");
		
		
		// in desending order using stream api
		
		list.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		
		System.out.println("================================================");
		
		// filter all string start with s, change it to upper case, and sort them in ass
		
		list.stream().filter(x->x.startsWith("s")).map(String::toUpperCase).sorted().forEach(System.out::println);
		System.out.println("=======================================================================");
		list.stream().filter(f->f.startsWith("s")).map(g->g.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		
		
		System.out.println("================================================================");
		
		
		// check any string start  with a or not, if match it return true otherwise false...
		
		boolean b=list.stream().anyMatch(y->y.startsWith("s"));
		System.out.println(b);
		
		
		System.out.println("================================================");
		
		
		// check all string start  with a or not, if match it return true otherwise false...
		
		boolean b1=list.stream().allMatch(z->z.startsWith("s"));
		System.out.println(b1);
		
		
		
		System.out.println("================================================");
		
		
		// check non string start  with a or not, if match it return true otherwise false...
		
		boolean b3=list.stream().noneMatch(s->s.startsWith("s"));
		System.out.println(b3);
		
		
		System.out.println("================================================");
		
		
		// check n of string start  with s, 
		
		long x=list.stream().filter(n->n.startsWith("s")).count();
		System.out.println(x);
	}

}
