package com.ureca;

public sealed class Person permits Student, Teacher, Employee {

	private String name = "아무개";
	private int age;

	// 생성자 오버로딩

	public Person(String name, int age) {
		// super(); //super로 상위 생성자 재사용
		setName(name);
		setAge(age);
	}

	public Person(String name) {
		this(name, 99);
	}

	public Person() {
		this("모지리", 99);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// this가 없으면 local 변수가 변경이 됨
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		checkAge(age);
	}

	private void checkAge(int age) {
		if (age < 1 || age > 99) {
			System.out.println("invalid age : " + age);
			System.exit(0);
		} else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + "\t" + getAge() + "\t";
	}

	/*
	 * 리팩토링 했을 때 printAll()은 없었음 -> 복사해서 만든거 오버라이딩을 할라면 접근 지정자의 범위가 같거나 더 넓어야됨
	 * return 타입은 상관 없음 파라미터와 메소드 명은 반드시 같아야 됨 폴리몰티즘? 을 완벽하게 하려면 Exception도 고려해야됨
	 */
	public void printAll() /* throws IOException */ {
//		System.out.print(getName() + "\t" + getAge() + "\t");
		/*
		 * toString Override 했을 경우 사용할 수 있음 아래 세개는 모두 같은 결과 출력
		 */
//		System.out.print(this.toString());
//		System.out.print(toString());
		System.out.println(this);
	}

}