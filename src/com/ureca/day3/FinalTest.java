package com.ureca.day3;

public class FinalTest {
	//static 필드
	public static final int i=11; //전역상수
	public static       int j=12; //전역변수
	//instance 필드
	public        final int k=13; //생성자에서 수정 가능한 상수. 
	public              int l=14; //인스턴스 변수 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i,j,k,l은 어떻게 차이 날까? 
		//classArea에 할당되는 것은 : i,j, 딱 한 번 할당되어 공유됨.
		//Heap에 할당되는 것은 : k,l
		// 변수는? 상수는? :i,k는 상수, j,l은 변수

	}

}
