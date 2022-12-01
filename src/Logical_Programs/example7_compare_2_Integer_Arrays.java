package Logical_Programs;

import java.util.Arrays;

public class example7_compare_2_Integer_Arrays {

	public static void main(String[] args) {
		int sh1[]= {99, 99, 99};
		int sh2[]= {33, 33, 33,};
		int sh3[]= {99, 99, 99};
		
		System.out.println(Arrays.equals(sh1, sh2));
		
		System.out.println(Arrays.equals(sh2, sh3));
		
		System.out.println(Arrays.equals(sh1, sh3));
	}
}
