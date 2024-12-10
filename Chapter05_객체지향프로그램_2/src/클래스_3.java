class Member2
{
	int no=100; //Heap => 멤버변수
	Member2(){
		System.out.println(Member2.this);
		int no=200;  //stack => 지역변수
		System.out.println("no="+(no+this.no)); //class의 멤버를 가져올때 this 사용
		// 1. 지역변수 우선순위
		// 지역변수,매개변수 => 멤버변수
		// this => 클래스 자신이 가지고 멤버(변수, 메소드)
		/*
		 * this => 자신의 객체
		 * ----- 지역변수와 매개변수 == 멤버변수가 동일한 이름을 가지고 있는 경우
		 * 						  구분자
		 * ----- 모든 클래스는 this를 가지고 있다
		 * this 는 static 변수로 되어있음
		 * JVM 
		 * 	=> A a=new A();
		 * 		this=a;
		 */
	}
}
/*
 * int a=10;
 * static int b=20;
 * 
 * static void display() => 공통으로 사용하는 기능
 * {
 * 	b만 사용이 가능
 *  A a=new A;
 *  a.b
 * }
 * void display2()
 * {
 * 	a,b => 사용이 가능
 * }
 */
public class 클래스_3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m=new Member2();
		System.out.println("m="+m);
		//static 에서는 this를 사용할 수 없다
		// this 인스턴스에서만 사용이 가능
		// => 공유
	}

}
