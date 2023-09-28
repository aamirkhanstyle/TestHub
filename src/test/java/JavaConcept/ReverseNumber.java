package JavaConcept;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=123456789;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			System.out.println(rem);
			rev=rev*10+rem;
			System.out.println(rev);
			num=num/10;
			System.out.println(num);
			
		}
		System.out.println(rev);
		
	}
}
