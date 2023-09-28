package JavaConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



public class MapConcept {

	public static void main(String[] args) {
		// key value
		Map<Integer,String> m=new HashMap<Integer,String>();//integer=class
		m.put(1, "Manish");
		m.put(1, "Manish");
		m.put(2, "Rahul");
		m.put(2, "don");
		m.put(3, "Naveen");
		m.put(4, "Naveen");
		System.out.println(m);
		Set<Entry<Integer,String>> s= m.entrySet();// convert map into set
		for(Entry<Integer,String>t:s) {
			System.out.println(t.getKey()+" "+t.getValue());
			//comment
		}
	}

	

	
}
