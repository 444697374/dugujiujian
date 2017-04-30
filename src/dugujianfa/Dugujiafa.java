package dugujianfa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Dugujiafa {

	public static void main(String[] args) {
		
		System.out.println("hello,dugujiafa");
		HashMap  map = new HashMap();
		map.put("1", "a");
		map.put("2", "b");
		map.put("5", 3);
		map.put("3", 4);
		map.put("4", 5);
		map.put("6", 5);

		map.put("7", "AAAAAAAAAA");
		map.put("7", "AAAAAAAAAA");
		map.put("7", "AAAAAAAAAA");
		map.put("7", "AAAAAAAAAA");
		map.put("7", "AAAAAAAAAA");

		map.put("7", 5);
		map.put("8", 5);
		map.put("9", 5);
		map.put("0", 5);

			Set entrySet = map.entrySet();
	
			//Iterator iterator = entrySet.iterator();
			
		for(Object e:entrySet){
			Entry eh = (Entry)e;
			
		}
			
		/*	while(iterator.hasNext()){
				Object next = iterator.next();
				Entry e =(Entry)next;
				System.out.println(e.getValue());
				
			}*/
			
		
		/*	Object next =() iterator.next();
			
			for(Object object:entrySet){
				Entry en = (Entry)object;
				System.out.println(en.getValue());
			}*/
			
	}

}
