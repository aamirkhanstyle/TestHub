package JavaConcept;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Manish");//0
		l.add("Rahul");//1
		l.add("Testing");//2
		l.add("Manish");//3
		System.out.println(l);
	
		System.out.println(l.get(2));
		int len=l.size();
		for(int i=0;i<len;i++) {
			System.out.println(l.get(i));
		}
	}
	
}
