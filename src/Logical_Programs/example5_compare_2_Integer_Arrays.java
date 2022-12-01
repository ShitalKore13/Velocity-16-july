package Logical_Programs;

import java.util.Arrays;

public class example5_compare_2_Integer_Arrays {

	public static void main(String[] args) {
		int sh1[]= {10 ,13};
		int sh2[]= {10, 13};
		int sh3[]= {20, 10};
		
		System.out.println(Arrays.equals(sh1, sh2));
		
		System.out.println(Arrays.equals(sh1, sh3));
		
		System.out.println(Arrays.equals(sh2, sh3));
	}
}
