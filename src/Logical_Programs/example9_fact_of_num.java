package Logical_Programs;

import java.util.Scanner;

public class example9_fact_of_num {

	public static void main(String[] args) {
		System.out.println("enter num :");
		Scanner scan=new Scanner(System.in);
		int num =scan.nextInt();
		
		int fact = 1;
		
		for(int i=num; i>=1; i--)
		{
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
}
