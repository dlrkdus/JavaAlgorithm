package com.ureca.day3;

import java.io.Serializable;

interface IA{
	
}
interface IB{
	
}
interface IFlyer extends IA,IB{ //인터페이스도 extends가 되네? 인텊
	/*public static final*/ int i=11; //컴파일러가 자동으로 public static final을 붙여서 상수가 된다. 
	int j=12;
	
	/*public abstract*/ void fly(); //컴파일러가 자동으로 public abstract를 붙여줌
	void land();
	void takeoff();
}
class Airplane implements IFlyer{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 날아요 ");
	}

	@Override
	public void land() {}

	@Override
	public void takeoff() {}
	// void fly(), void land(), void takeoff() 자동 상속 
}
class Bird implements IFlyer{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("새가 날아요 ");
	}

	@Override
	public void land() {}

	@Override
	public void takeoff() {}
	// void fly(), void land(), void takeoff() 자동 상속 
}
class Superman implements IFlyer{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("슈퍼맨이 날아요 ");
	}

	@Override
	public void land() {}

	@Override
	public void takeoff() {}
	// void fly(), void land(), void takeoff() 자동 상속 
}

public class FlyerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serializable s = new Serializable() {};
		System.out.println(s); //뭐야 객체 왜 생성돼 
		//이 인터페이스를 상속한 이름이 없는 객체가 생성된 것. 
		IFlyer f = new Airplane();
		f.fly(); System.out.println();
		IFlyer[] fa = new IFlyer[3];
		fa[0]=f;
		fa[1]=new Bird();
		fa[2]=new Superman();
		for(IFlyer t:fa) t.fly();
	}

}
