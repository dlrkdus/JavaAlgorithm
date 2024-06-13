package com.ureca.day2;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1선언
		 *2생성
		 *3사용
		 *4출력		*/
		int[] ia;
		//ia =new int[]{10,11,12};
		ia = new int[3];
		
//		ia[-1] = -1; java.lang.ArrayIndexOutOfBoundsException
		ia[0] = 10;
		ia[1] = 11;
		ia[2] = 12;
//		ia[3] = 13; java.lang.ArrayIndexOutOfBoundsException
		System.out.println(ia);
		System.out.println(ia.length);
		System.out.println(Arrays.toString(ia));
		
		
	}

}
