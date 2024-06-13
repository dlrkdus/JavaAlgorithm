package com.ureca.day3;

public class OverloadTest {
	public static int add(int x,int y) {
		System.out.println("public int add(int "+x+",int "+y+")");
		return x+y;
	}
	protected static long add(long x,long y) {
		System.out.println("public long add(long "+x+",long "+y+")");
		return x+y;
	}
	static float add(float x,float y) {
		System.out.println("public float add(float "+x+",float "+y+")");
		return x+y;
	}
	private static double add(double x,double y) {
		System.out.println("public double add(double "+x+",double "+y+")");
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(11,22)); //왜 Overload. 없이 되지? 
		System.out.println(add(11L,22L));
		System.out.println(add(1.1F,2.2F)); //부동소수점
		System.out.println(add(1.1,2.2));



	}

}
