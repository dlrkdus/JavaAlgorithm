package com.ureca;

public class initTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println(i);
		
//		String s=null;
		String s = "ABC";
//		String s = new String("ABC");
		s=s.concat("DEF"); //s 주소에 저장해야 하므로 주소 갱신해야함. 

		System.out.println(s);
		System.out.println(s.length()); //NullPointException
//		System.out.println("ABC".length());
		
		System.out.println(1/2); //정수/정수 = 정수
		
		
	}

}
