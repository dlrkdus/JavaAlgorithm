package com.ureca;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");

		char c1= 'S';
		
		System.out.println(s1==s2); //주소값 비교 
		System.out.println(c1);
		System.out.println(s1.equals(s2)); //내용 비교 
		System.out.println(s3==s4); //주소값 비교 
		System.out.println(s1==s3);
		StringBuilder  sb = new StringBuilder("ABC");
		sb.append("안녕");
		System.out.println(sb);
		System.out.println(sb.toString());


	}

}
