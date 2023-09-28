package JavaConcept;

public class StringConcept {
public static void main(String[] args) {
	
		
		String s="Automation";
		String s1="test";
		int l=s.length();
		System.out.println(l);
		boolean result=s.equals(s1);
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(result);
		//String s2=s.toUpperCase();
		String s2=s.toLowerCase();
		System.out.println(s2);
		char c=s.charAt(4);
		System.out.println(c);
		System.out.println(s.concat(s1)); 
		System.out.println(s+s1);
		int i=10;
		int j=20;
		System.out.println(s+s1+i+j);
		System.out.println(i+j+s+s1);
		System.out.println(s+s1+(i+j));
		System.out.println(s+s1+i*j); 
		String s3=s.concat(s1);
		System.out.println(s3);
	}
}
