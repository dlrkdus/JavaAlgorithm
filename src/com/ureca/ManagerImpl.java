package com.ureca;

import java.util.Arrays;

public class ManagerImpl {
	private Person[] pa;
	private int index;

	// Step 2.
	private static ManagerImpl instance = new ManagerImpl();

	// Step 1.
	// 객체를 내부에서 딱 한개만 만들라고 private - 싱글톤 디자인 패턴
	private ManagerImpl(int size) {
		pa = new Person[size];
	}

	private ManagerImpl() {
		this(10);
	}

	// Step 3.
	public static ManagerImpl getInstance() {
		return instance;
	}

	public void add(Person p) {
		pa[index++] = p;
	}

	public Person[] search() {
		return Arrays.copyOf(pa, index);
	}

	public Person search(String name) {
		for (int i = 0; i < index; i++) {
			if (pa[i].getName().equals(name))
				return pa[i];
		}
		return null;
	}

	public void update(Person p) {
		for (int i = 0; i < index; i++) {
			if (pa[i].getName().equals(p.getName())) {
				pa[i] = p;
				return;
			}
		}
	}

	public void delete(String name) {
		for (int i = 0; i < index; i++) {
			if (pa[i].getName().equals(name)) {
				index--;
				pa[i] = pa[index];
//				pa[index] = null;
				return;
			}
		}
	}

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
