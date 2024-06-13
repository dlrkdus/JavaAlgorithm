package com.ureca.test;

import com.ureca.school.*;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = null;
		
		p= new Student("홍길동", 20, 202401);
		p.printAll();
		
		p = new Student("홍길순",202402);
		p.printAll(); //default 생성자로 초기화한 값 출력
		
		p = new Student("나맹구");
		p.printAll();
		
		p = new Student();
		p.printAll();
		
		System.out.println();
		
		p = new Teacher("일강사", 30, "자바");
		p.printAll();
		
		p = new Teacher("이강사","알고");
		p.printAll();
		
		p = new Teacher("삼강사");
		p.printAll();
		
		p = new Teacher();
		p.printAll();
		System.out.println();
		
		
		p = new Employee("일직원", 25, 'A');
		p.printAll();
		p = new Employee("일직원", 'A');
		p.printAll();
		p = new Employee("일직원");
		p.printAll();
		p = new Employee();
		p.printAll();
		
		
	}

}
