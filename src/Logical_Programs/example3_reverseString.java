package Logical_Programs;

public class example3_reverseString {

	public static void main(String[] args) {
		String org="abcd";   //0 to 3
		String rev="";      //dcba
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);   //dcb+a=dcba
		}
		System.out.println(rev);
	}
}
