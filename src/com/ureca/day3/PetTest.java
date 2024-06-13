package com.ureca.day3;

import java.io.Serializable;
import java.rmi.Remote;

class A{
	
}
class B{
	
}
abstract class Pet extends A implements Serializable/*객체 정렬화<br>*/,Remote/*<p>*/{
	private String name;
	
	public Pet(String name) {
		setName(name);
	}
	public Pet() {
		this("펫");
	}
	
	public abstract void speak(); //원형 메소드, 추상 메소드
	// 오버라이딩을 해야하는 강제성
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Cat extends Pet{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
}
class Dog extends Pet{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}
class Duck extends Pet{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("꽥꽥");
	}
}
public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Cat(); //Pet은 객체를 못 만드니 자식 객체로 생성한다. 
		p.speak();
		System.out.println(p.getClass().getName());
		

		Pet c=new Cat() {}; //익명 클래스 , 이것은 Cat 객체가 아니다. 
		System.out.println(c.getClass().getName());
		System.out.println(c instanceof Cat); //Cat을 상속하는 익명 객체임을 증명


		
		Pet[] pa = new Pet[3];
		pa[0]=p;
		pa[1]=new Dog();
		pa[2]=new Duck();
		for(Pet a: pa) a.speak();
		
		
	}

}
