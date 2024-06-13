package com.ureca.school;

public non-sealed class Employee extends Person {
	private char dept;

	public Employee(String name, int age, char dept) {
		super(name, age);
		setDept(dept);
	}

	public Employee(String name, char dept) {
		this(name, 99, dept);
	}

	public Employee(String name) {
		this(name, 99, 'U');
	}

	public Employee() {
		this("모지리", 99, 'U');
	}

	public char getDept() {
		return dept;
	}

	public void setDept(char dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return super.toString() + getDept();
	}
//	@Override
//	public void printAll() {
//		super.printAll();
//		System.out.println(getDept());
//	}

}
