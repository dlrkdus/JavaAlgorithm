package com.ureca.day2;

import java.util.Arrays;

public class CopyOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 90, 80, 100 };
//		arr[3] = 95; //java.lang.ArrayIndexOutOfBoundsException
//		arr = {90,80,100,95};
		arr = new int[]{90,80,100,95};
		arr[3] = 85;
		System.out.println(Arrays.toString(arr));
		
		
		int[] brr = new int[4];
		System.arraycopy(arr, 0, brr, 0, arr.length);
		System.out.println(Arrays.toString(brr));
		
		
		int[] crr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(crr));
		
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] b = Arrays.copyOf(a, a.length);
		for(int[] b1 : b) System.out.println(Arrays.toString(b1));
		
		System.out.println();
		a[0][0] = 11;
		b[1][1] = 55;
		for(int[] a1 : a) System.out.println(Arrays.toString(a1));
		for(int[] b1 : b) System.out.println(Arrays.toString(b1));
		
		//1차원에서는 deep copy가 가능
		//2차원에서는 deep copy가 안됨
		
		int[][] c = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j];
			}
		}
		
		for(int[] c1 : c) System.out.println(Arrays.toString(c1));
		
		c[2][2] = 99;
		for(int[] a1 : a) System.out.println(Arrays.toString(a1));
		for(int[] c1 : c) System.out.println(Arrays.toString(c1));
	}

}
