package com.ureca.day3;

interface Run{
	void go();
	void stop();
}
//static class Car implements Run{
//
//@Override
//public void go() {
//	// TODO Auto-generated method stub
//	System.out.println("go()");
//}
//
//@Override
//public void stop() {
//	// TODO Auto-generated method stub
//	System.out.println("stop()");
//}
//}
public class AnonymousTest {
	static class Car implements Run{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("go()");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop()");
	}
} //중첩 클래스로 들어가면 차이점? : top level class =현재 패키지에서 다 사용 가능. 클래스명은 car
	// 중첩클래스는 Anonymous$Car
	public static void main(String[] args) {
		Run r1 = new Car();
		r1.go();
		System.out.println(r1.getClass().getName());
		

		Run r2 = new Run(){
			@Override
			public void go() {
				// TODO Auto-generated method stub
				System.out.println("go()");
			}

			@Override
			public void stop() {
			}
		};
		r2.go();
		System.out.println(r2.getClass().getName());
		
//		class ? implements Run{
//			
//			@Override
//			public void stop() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void go() {
//				// TODO Auto-generated method stub
//				
//			}
//		}
//		Run r3 = new ?();
//		r3.go();
//		System.out.println(r3.getClass().getName());

	}

}
