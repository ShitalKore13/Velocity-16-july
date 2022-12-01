package Logical_Programs;

import java.util.Arrays;

public class example6_compare_2_Integer_Arrays {

	public static void main(String[] args) {
		int a1[]= {10, 12, 13, 10};
		int a2[]= {10, 13, 30, 10};
		int a3[]= {10, 13, 30, 10};
		
		System.out.println(Arrays.equals(a1, a2));
		
		System.out.println(Arrays.equals(a1, a3));
		
		System.out.println(Arrays.equals(a2, a3));
	}
}
