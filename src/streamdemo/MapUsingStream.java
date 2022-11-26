package streamdemo;

import java.util.HashMap;
import java.util.Map;

public class MapUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Map<Integer, String> hmap = new HashMap<Integer, String>();
		      hmap.put(1, "Sadab");
		      hmap.put(2, "Rehan"); 
		      hmap.put(3, "Nadeem");  
		      hmap.put(4, "Hasan");   
		      hmap.put(5, "Tiger");   
		      hmap.put(6, "Babar");
		      /* forEach to iterate and display each key and value pair
		       * of HashMap.    
		       */  
		      hmap.forEach((key,value)->System.out.println(key+" - "+value));
		      /* forEach to iterate a Map and display the value of a particular  
		       * key     
		       */ 
		      hmap.forEach((key,value)->{ 
		         if(key == 1){ 
		            System.out.println("Value associated with key 1 is: "+value); 
		         }  
		      });    
		      /* forEach to iterate a Map and display the key associated with a
		       * particular value     
		       */
		      hmap.forEach((key,value)->{
		         if("Hasan".equals(value)){ 
		            System.out.println("Key associated with Value Cat is: "+key);
		         }
		      }); 

	}

}
