package com.sist.lib;
// finallize() => 소멸자 함수 => 객체가 메모리에서 해제 => 자동호출
class Sawon /* extends Object*/
{
	private int sabun;
	private String name;
	
	public Sawon() // 생성자호출
	{
		sabun=1;
		name="홍길동";
		System.out.println("객체 생성 = 초기화 완료");
	}
	public void print() //메소드 활용
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		
	}
	// 소멸 여부 확인
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		// 객체의 생명주기
		System.out.println("사원 객체 소멸:Heap에서 사라짐");
	}
	
}
public class 라이브러리_Object_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa=new Sawon(); // 객체생성
		sa.print(); // 객체 활용
		sa=null; //주소값 지우기 
		System.gc(); // =>  가비지컬렉션 호출 => null ,  사용하지 않는 데이터를 회수
		
		/*
		Object o=10; => AutoBox
		int i=(int)o; => UnBox
		int a=(int)10.5;
		
		=> Object / String / Wrapper
		
		Integer i=100; 
		int k=i;
		*/
		
	}

}
