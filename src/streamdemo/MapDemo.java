package streamdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1,"Salim");
		hmap.put(2, "Hasan");
		hmap.put(3, "Rehan");
		hmap.put(4, "Hasnain");
		hmap.put(5, "Sadab");
		hmap.put(6,"Nasir");
		hmap.forEach((key,value)->System.out.println(key+"-"+value));
		
		System.out.println("------------------------------------");
		hmap.forEach((key,value)->{
			if(key%2==0) {
				System.out.println(value+"\t");
			}
			
		});
		
System.out.println("-------------------------");
hmap.forEach((key,value)->{
	if("Hasan".equals(value)) {
		System.out.println(key);
	}
});

	}

}
