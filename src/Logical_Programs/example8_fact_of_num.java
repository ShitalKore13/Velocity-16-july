package Logical_Programs;

import java.util.Scanner;

public class example8_fact_of_num {

	public static void main(String[] args) {
		
		System.out.println("enter num:");
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();   //4
		
		int fact = 1;  //24
		//4   0>=1
		for(int i=num; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println(fact);   //12*2=24*1=24
	}
}
