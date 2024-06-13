package com.ureca;

/*
 * 위치에 관계 없이 사용 public
 * 위치에 관계 없이 상속 관계면 사용 protected
 * private - 해당 class 안에서만 사용 가능
 * default - 같은 패키지에서 사용 가능
 */
interface AA{
	
}
interface BB{
	
}
public non-sealed class Student /* extends Object */ extends Person implements AA,BB { // 자바는 항상 단일 상속, 단, implements는 여러 개 가능
	private int stuid;

	/*
	 * 싱글톤 패턴에서는 생성자도 private로 막아버림
	 */
	// 생성자 오버로딩
	// init 함수 - 생성자 : 초기값을 지정할 때 사용
	public Student(String name, int age, int stuid) {
		super(name, age);
//		setName(name);
//		setAge(age);
		setStuid(stuid);
	}

	public Student(String name, int stuid) {
		this(name, 99, stuid);
	}

	// name은 객체를 생성할 때 필수적으로 들어가야될 변수 -> 생성자를 만들어 줌
	public Student(String name) {
		this(name, 99, 202499);
	}

// 	default 생성자 : 이름이 Class 명과 같아야 됨 + return 타입 없음 + 상속x ? Compiler가 자동으로 넣어줌
	public Student() {
//		this("모지리", 99, 202499);
		this("모지리");
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	@Override
	public String toString() {
		return super.toString() + getStuid();
	}
	
	/*
	 * toString을 사용하면 printAll()은 필요가 없음
	 * printAll()은 상속을 받아 사용
	 */
//	@Override
//	public void printAll() {
//		// this - 현재 객체가 누구인지 나타냄
//		// this.생략 가능
////		System.out.println(this.name);
////		System.out.println(this.age);
////		System.out.println(this.stuid);
//		super.printAll();
//		System.out.println(getStuid());
////		System.out.println(getName() + "\t" + getAge() + "\t" + getStuid());
//	}
}
