/*
 * 1. 변수 = 한개만 저장하는 공간,  변경이 가능
 * 		  => 1.메모리 저장 , 2. 
 * 	  ---
 * 	   1) 지역변수 : 메소드안에서 선언되는 변수
 * 	   2) 멤버변수	 : 
 *     3) 공유변수
 *     --------------------
 *     => 변수를 저장하기 위해서는 반드시 필요한 내용
 *    	   ---------------------------------
 *    		메모리 크기 결정 / 클래스 (JVM에서 크기를 모른다)
 *    							 --------------------
 *    										|
 *     메모리 저장						     new => 새로운 메모리 생성
 *     -------------------
 *     
 *     		MethodArea : Method / static (공유변수)
 *     -------------------
 *     		stack : 메모리 자체에서 관리 => 지역변수
 *     				{}이 종료가 된 경우 사라진다
 *     -------------------
 *     		Heap : 실제 데이터 공간 : 클래스/배열
 *     			   자동으로 해제되지 않는다 => 개발자가 처리
 *     				new / delete : => 가비지컬렉션
 *     								  자동 메모리 회수
 *     				=> 메모리 저장 
 *     				   ----------- 확인 int malloc() => new 
 *     							   해제 free() => delete
 *     -----------------------------------------------
 *     ==> 사용자 요청에 따른 데이터 처리
 *     1) 연산자
 *     	  단항연산자 (++,--,!,.(type))
 *     	  이항연산자(+,-,/,%=> == != <> <= >= => && ||
 *     				=,+=,-=)
 *        삼항연산자
 *     2) 제어문
 *     		if , if~else
 *     		for, while
 *     		break
 *     ------- 묶어서 처리 => 메소드 => 중복제거
 *     1. 입력
 *     2. 처리  => 세분화 
 *     3. 출력
 *     기본형
 *     ----
 *     정수 : byte(1byte),int(4byte),long(8vyte)
 *     		 -128~127     -21억 4천~21억 4천
 *     실수 : double(8byte) => 소수점 15자리 이상
 *     논리 : boolean(1byte)	=> true/false
 *     문자 : char(2byte) => 0~65535
 *     -------------------
 *     참조형 : 배열 / 클래스 (String,Integer,ArrayList)
 *     		오라클 : Connection / Statement / ResultSet
 *     *** 변경이 되는 값
 *     		누적 /루프
 *     		*** 가독성
 *     			i/j =>a/b/ m/n
 *     			
 *     
 */
/*class A
{
	int a, b, e, c, d;
}*/
import java.util.Scanner;
public class 자바1_3_정리 {
//멤버변수 => 자동 초기화 int a; => a=0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수 => 초기화가 안된다. => int a=0; 
		/*/A a=new A();
		for(int i=1;i<=100;j++)
		{
			System.out.println("a="+a);
		}*/
		Scanner scan=new Scanner(System.in);
		//int 
		//System.out.println(year+"년도"+month+"월"+day+"일");
		
		

	}

}
