package com.ureca.school;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

import com.ureca.day4.DuplicatedException;
import com.ureca.day4.NotFoundException;

public class ManagerImpl implements Manager {
	private Person[] pa;
	private static int index;

	// Step 2.
	private static Manager instance = new ManagerImpl();

	// Step 1.
	// 객체를 내부에서 딱 한개만 만들라고 private - 싱글톤 디자인 패턴
	private ManagerImpl(int size) {
		pa = new Person[size];
	}

	private ManagerImpl() {
		this(10);
	}

	// Step 3.
	public static Manager getInstance() { //생성자가 private이라 static으로 선언해줘야함
		return instance; //그래서 Impl도 static이 돼야함. 
	}

	@Override
	public void add(Person p) throws DuplicatedException {
		try {
			search(p.getName());
			throw new DuplicatedException(p.getName()+"중복입니다.");
//			System.out.println("중복입니다.");
		} catch (NotFoundException e) {
			pa[index++] = p;
		}
		
	}

	@Override
	public Person[] search() {
		return Arrays.copyOf(pa, index);
	}

	@Override
	public Person search(String name) throws NotFoundException {
		for (int i = 0; i < index; i++) {
			if (pa[i].getName().equals(name))
				return pa[i];
		}
		//return null; null을 넘기는 대신 NotFoundException으로 예외 책임 위임
		throw new NotFoundException(name+"없습니다.");
	}

	@Override
	public void update(Person p) throws NotFoundException {
		for (int i = 0; i < index; i++) {
			if (pa[i].getName().equals(p.getName())) {
				pa[i] = p;
				return;
			}
		}
		throw new NotFoundException(p.getName()+"없습니다.");
	}

	@Override
	public void delete(String name) throws NotFoundException {
		for (int i = 0; i < index; i++) {
			if (pa[i].getName().equals(name)) {
				index--;
				pa[i] = pa[index];
//				pa[index] = null;
				return;
			}
		}
		throw new NotFoundException(name+"없습니다.");

	}

	@Override
	public void printAll() {
		for (int i = 0; i < index; i++) {
			pa[i].printAll();
		}
	}
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
