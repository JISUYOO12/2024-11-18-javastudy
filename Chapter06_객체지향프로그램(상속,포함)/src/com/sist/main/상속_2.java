package com.sist.main;
/*
 *  메소드 오버라이딩 => 메소드의 기능 변경 => 유지보수
 *  --------------------------------------
 *  오버라이딩 조건 ***** 인터페이스 
 *  1. 상속 => 상속받은 메소드를 변경해서 사용
 *  2. 메소드명이 동일하다
 *  3. 매개변수가 동일
 *  4. 리턴형이 동일
 *  5. 접근지정어가 확대 가능 , 축소 불가능 
 *  
 *  class A
 *  {
 *  	void display(){}
 *  }
 *  class B extends A
 *  {
 *  	1. void display(){
 *  	2. public void display(){} => 확장 
 *  	3. protected void display(){} => 확장
 *  	4. private void display(){} ===> 오류 (축소) private<default
 *  
 *  }
 * 
 */
class Animal
{
	public void run()
	{
		System.out.println("걷는다");
	}
}
class Dog extends Animal
{
	
}
class Human extends Animal
{
	
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani=new Dog();
		ani.run();
		ani=new Human();
		ani.run();
		
	}

}
