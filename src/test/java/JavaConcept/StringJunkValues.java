package JavaConcept;

public class StringJunkValues {
	public static void main(String[] args) {
		String s="testautomation$%^&*fgdsgsS  DFG12345";
		String value=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(value);

	}
}
