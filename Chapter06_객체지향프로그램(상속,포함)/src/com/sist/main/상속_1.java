package com.sist.main;
/*
 * 변경 (수정)
 * ---------- 오버라이딩 
 * => 변수 오버라이딩
 * => 메소드 오버라이딩
 */
class Super // 상속을 내리는 클래스
{
	String name;
	int age;
	
	//초기화
	public Super()
	{
		name="홍길동";
		age=25;
	}
}
class Sub extends Super // 상속받는 클래스
{
	/*
	 * 	String name;
		int age;
	 */
	public Sub()
	{
		name="심청이";
		age=27;
	}
	public void display()
	{
		System.out.println("Super:name="+super.name);
		//super => 상속 내림 클래스의 변수 , 메소드
		System.out.println("Super:age="+super.age);
	}
}
public class 상속_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
