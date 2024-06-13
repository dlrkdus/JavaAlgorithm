package com.ureca.school;

import com.ureca.day4.DuplicatedException;
import com.ureca.day4.NotFoundException;

public interface Manager {
	//변수 선언 불가. 자동 상수 변환., 

	void add(Person p) throws DuplicatedException;

	Person[] search();

	Person search(String name) throws NotFoundException;

	void update(Person p) throws NotFoundException;

	void delete(String name) throws NotFoundException;

	void printAll();
	//	오버로딩 할 필요 없음 Person으로 받음
	//	public void add(Student s) {
	//		
	//	}
	//	
	//	public void add(Teacher t) {
	//		
	//	}
	//	public void add(Employee e) {
	//		
	//	}

}