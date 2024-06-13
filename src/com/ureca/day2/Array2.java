package com.ureca.day2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 선언
//		int[][] ia; //int ia[][]; //int[] ia[];
//		
//		// 2 생성
//		ia = new int[3][3]; // ia = new int[3][5]; // ia = new int[3][];
		
		// 3 사용
//		ia[0][-1] = -1; //ArrayIndexOutOfBoundsException
//		ia[0][0] = 10;
//		ia[1][1] = 11;
//		ia[2][2] = 12;
		
//		ia[2][3] = 13; //ArrayIndexOutOfBoundsException
		
		int[][] ia; 
//		= {
//				{10,0,0},
//				{0,11,0},
//				{0,0,12}
//		};
		
		ia = new int[][] {
			{10},
			{0,11},
			{0,0,12}
		};
		
		System.out.println(ia.length);
		System.out.println(ia);
		System.out.println(Arrays.toString(ia));
		
		//암기
		for(int[] a : ia) {
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println(ia[0].length);
		System.out.println(ia[1].length);
		System.out.println(ia[2].length);
		for(int i = 0; i < ia.length; i++) {
			for(int j = 0; j < ia[i].length; j++) {
				System.out.print("ia["+i+"]["+j+"]="+ia[i][j]+" ");				
			}
			System.out.println();
		}
		
		
		for(int[] a : ia) {
			for(int b : a) System.out.print(b + " ");
			System.out.println();
		}
		
	}

}
