package JavaConcept;

public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Automation Test";
String re="";
String rev="";
int len=s.length();
for(int i=len-1;i>=0;i--) {
	re=re+s.charAt(i);
}
System.out.println(re);

// reverse the words
String[]t=s.split(" ");
int l=t.length;
for(int i=l-1;i>=0;i--) {
	rev=rev+" "+t[i];
}
System.out.println(rev);
	}

}
