package com.ureca.day4;

import java.io.IOException;

@SuppressWarnings("serial")
class MyException extends Exception {

	public MyException() {
		this("MyException");
	}

	public MyException(String message) {
		super(message);
	}
	
}

public class ExceptionTest {

	public static void main(String[] args) throws MyException {
		
		//알고리즘 풀 때 예외 신경 쓰지 않으려고 ! 

		try {
			System.out.println("start");
			
			String s=null; //로컬 변수 초기화 필수 
//			System.out.println(s.length()); //NullPointerException
			
//			System.in.read(); //IOException 
//			int i =10/0; //RuntimeException
//			
//			if(true) return; //finally o 
//			System.exit(0);//유일하게 finally가 실행되지 않는 경우 
			System.out.println("이거 출력하고 싶다. 하지만 예외가 발생되면 출력되지 않을 것. ");

			//내부적으로 예외를 생성하고 던져줘야한다. 
			throw new MyException(); //발생한 Exception이 전달된다. 
			
			
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("NullPointerException"+e.getMessage());
		
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("ArithmeticException"+e.getMessage());
		} catch (RuntimeException e) {
			//e.printStackTrace();
			System.out.println("RuntimeException"+e.getMessage());
		
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Exception"+e.getMessage());
		
		} catch (Throwable e) {
			//e.printStackTrace();
			System.out.println("Throwable"+e.getMessage());
		}		 // 다형성 원칙에 따라 상위 클래스 exception도 적용 가능
		finally {
			System.out.println("finally");
		}

		System.out.println("end");

	}

}
