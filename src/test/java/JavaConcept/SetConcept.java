package JavaConcept;

import java.util.HashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Manish");
		s.add("Manish");
		s.add("Manish");
		s.add("Rahul");
		System.out.println(s);
		for(String t:s) {
			System.out.println(t);
		}
	}
	
}
