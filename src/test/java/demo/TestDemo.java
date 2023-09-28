package demo;

public class TestDemo {
	static int i=10;
	public static void main(String[] args) {
		
		System.out.println(i);
		TestDemo d=new TestDemo();
		d.test();
		
	}
	public static void test() {
		int i=20;
		System.out.println(i);
	}

}
