package com.ureca.day3;
class Count{
	public static int si;
	public int i;
	
	static { //static block
		si=1;
		System.out.println("static{1}"+si);
	}
	public static int getSi() {
		return si;
	}
	static { //static block
		si=2;
		System.out.println("static{1}"+si);
	}

}
//classloader 절차
//1. Count.si 등록
//2. Count.getSi() 등록
//3. static block 차례대로 1번씩 실행
//4. main 메소드가 없으므로 실행 X
public class StaticCount {
	static {
		System.out.println("main보다 먼저");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() start");
//		System.out.println(Count.i); //인스턴스 변수, 메소드, this,super, non-static은 사용 불가 
		System.out.println(Count.si);
		Count c1 = new Count();
		c1.si++;
		System.out.println(c1.si);
		System.out.println(c1.getSi());
		System.out.println(Count.si);
		System.out.println(Count.getSi());
		//객체로 접근하든 클래스로 접근하든 똑같다. 방법은 자유롭게 
		Count c2 = new Count();
		c2.si++;
		System.out.println(c2.si);
		System.out.println(c2.getSi());
		System.out.println(Count.si);
		System.out.println(Count.getSi());
		
		System.out.println(c1.si);
		System.out.println(c1.getSi());

	}
}
//static 변수부터 등록, 
//필드, 메소드부터 등록 , 
//static 블록 실행 
