package com.ureca.test;

import com.ureca.day4.DuplicatedException;
import com.ureca.day4.NotFoundException;
import com.ureca.school.*;

public class SchoolMain {

	
	public static void main(String[] args) {
		
		Manager m = ManagerImpl.getInstance();
		//add
		try {
			m.add(new Student("홍길동", 20, 202401));

		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}		
		try {
			m.add(new Student("홍길동", 20, 202401));
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}
			
		try {
			m.add(new Teacher("일강사", 30, "자바"));
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}

		try {
			m.add(new Employee("일직원", 25, 'A'));
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}
		m.printAll();
		System.out.println();
		
		//search
		Person p=null;
		try {
			p = m.search("일강사");
			System.out.println(p.toString());
			System.out.println();
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//update
		try {
			p = new Student("일강사", 20, 202402);
			m.update(p);
			for(Person t : m.search()) {
				t.printAll();
			}
			System.out.println();
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//delete
		try {
			m.delete("일강사");
			m.printAll();
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		// 5 오버라이드(재정의) //////오버로딩(중복정의)
		/*
		 * Person p = new Student("홍길동", 20, 202401); System.out.println(p.toString());
		 * 
		 */

		// 4 리턴
		/*
		 * Person get() { // int get() { //... return new Student("홍길동", 20, 202401);
		 * //new Person("홍길동", 20); }
		 */
		// 3 파라미터

		/*
		 * void set(Object o) { // void set(Person p) { // void set(int i){ //... }
		 * 
		 * set('A'); set(new Student("홍길동", 20, 202401));
		 */

		// 2 배열
		/*
		 * Object[] oa = new Object[3]; oa[0] = 123; int[] arr = new int[3]; arr[0] =
		 * 'A';
		 * 
		 * Person[] pa = new Person[3]; pa[0] = new Student("홍길동", 20, 202401); pa[1] =
		 * new Teacher("일강사", 30, "자바"); pa[2] = new Employee("일직원", 25, 'A');
		 * for(Person p : pa) p.printAll();
		 */

		// 1 다형성
		/*
		 * Object o = 123; // 내부적으로는 이렇게 동작~ new Integer(123); int i = 'A'; float f =
		 * 123L;
		 * 
		 * Person p = new Student("홍길동", 20, 202401); p.setName("손오공"); //super로 가능 //
		 * p.setStuid(202477); //Person까지만 접근 가능 Stuid 는 Student p.printAll(); //
		 * Student 클래스의 메소드가 호출이 되었는데 이게 가능한 이유는 override <= inheritance 상속 관계에 있어서 가능함
		 * // Teacher t = (Teacher) p; //명시적으로 (Teacher)로 형변환을 해줘야됨 -
		 * java.lang.ClassCastException
		 * 
		 * //instanceof로 확인 -> 해당되는 타입으로 형변환해서 사용 if(p instanceof Student) { Student s =
		 * (Student)p; s.setStuid(202477); }
		 * 
		 * if(p instanceof Student s) { //jdk 12 s.setStuid(202477); } p.printAll();
		 * System.out.println(p instanceof Object); System.out.println(p instanceof
		 * Person); System.out.println(p instanceof Student);
		 */

	}

}
