package sample1;

public class demo16 {

	public static void main(String[] args) {
		int a=1;
		int b=a++;
		int c=a++;
		int d=a++;
		
		System.out.println(b++);
		System.out.println(a++);
		System.out.println(c++);
		System.out.println(d++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
