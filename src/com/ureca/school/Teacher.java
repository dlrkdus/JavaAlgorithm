package com.ureca.school;

public non-sealed class Teacher extends Person {
//	private String name;
//	private int age;
	private String suj;

	public Teacher(String name, int age, String suj) {
		super(name, age);
		setSuj(suj);
	}

	public Teacher(String name, String suj) {
		this(name, 99, suj);
	}

	public Teacher(String name) {
		this(name, 99, "무전공");
	}

	public Teacher() {
		this("모지리", 99, "무전공");
	}

	public String getSuj() {
		return suj;
	}

	public void setSuj(String suj) {
		this.suj = suj;
	}

	@Override
	public String toString() {
		return super.toString() + getSuj();
	}

//	@Override
//	public void printAll() {
//		super.printAll();
//		System.out.println(getSuj());
//	}

}
