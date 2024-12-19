package com.sist.main;
/*
 * 자바에서 지원하는 라이브러리 
 * 				--------- 프로그램에 필요한 클래스를 모아서 개발시에 사용이 가능하게 한다
 * => 라이브러리중심 => 조립
 * => Scanner / System / String ...
 * 
 * => 라이브러리
 * 	  1) 자바에서 지원
 * 		 java.lang = 9
 * 			***Object
 * 			System
 * 			***String
 * 			StringBuffer
 * 			Math
 * 			**Wrapper : 데이터형을 클래스화
 * 			--------
 * 				***=> Integer
 * 				***=> Double
 * 				***=> Bollean
 * 				=> Byte
 * 				=> Float
 * 				***=> Long
 * 				...
 * 
 * 		 java.util = 10
 * 				=> Scanner 
 * 				=> Date / Calendar
 * 				=> Collection
 * 				---------------> 배열대체
 * 				List / Set / Map
 * 				--------------- interface
 * 				List : ArrayList, Vector, LinkedLidst
 * 											  |
 * 											Queue
 * 
 * 				Set : TreeSet / ***HashSet : 중복없는 데이터
 * 				Map : ***HashMap / HashTable
 * 		 java.io  = 11
 * 				=> FileReader  / FileWriter
 * 				=> InputStream / OutputStream
 * 				=> BufferedReader / ButteredWriter
 * 				=> BufferedInputStream / BufferedOutpiutStream
 * 				=> 입출력 / 파일 / 메모리 / 네트워크
 * 				=> ~Stream , Reader/Writer
 * 					------	 --------------
 * 					1byte		2byte(한글포함)
 * 					 | 네트워크 , 		파일업로드.다운로드
 * 				=> File
 * 		 java.sql = 12
 * 				=> Connection
 * 				=> Statement
 * 				=> ResultSet
 * 
 * 		 java.net
 * 				=> URL / ServerSocket / Socket
 * 	     java.text
 * 				=> SimpleDataFormat / MessageFormat / DecimalFormat
 * 		 java.lang.reflect
 * 				=> 리플렉션 => 메소드 / 클래스 / 변수 / 생성자
 * 			*** Annotation  , 열거형 
 * 				-------------
 * 		J2SE
 * 		웹 라이브러리 : JSP / Servlet / Spring => 2차 자바
 * 		JSEE
 * 		J2ME (X) =>Kotlin =>Dart(Flutter)
 * 		--------------
 * 		javax.swing(x) => 한번사용시 폐기
 * 		--------------------------- 1.0
 * 		=> javax.http
 * 		=>javax.servlet.http
 * 		----------------------------2.0
 * 		=> org.springframework
 * 
 * 		Java / Oracle / JSP / Spring / Spring-Boot
 * 				  | MyBatis / JPA
 * 				  | Oracle / MySQL(MariaDB)
 * 
 * 		------------------------------------------- Back
 * 		HTML / CSS / JavaScript => TypeScript
 * 		------------------------
 * 						|
 * 						JQury / VueJS / ReactJs / NodeJs / NextJS
 * 						----------------------------------------
 * 						front
 * 
 * 		1. 데이터 분석 : 파이썬 (넘파이 , 판다스 , Matplotlib)
 * 						Spring <==> 파이썬
 * 									 |
 * 									Django
 * 		2. 검색엔진 : ElasticSearch : CRUD / 검색
 *
 *    2) 외부업체 지원	: Jsoup / lombok / Spring
 *    		=> mvnrepository.com
 *    		=> simple-json / bson ....
 *    3) 사용자 정의 : 잘만들어진 클래스 / 자주 사용하는 클래스
 *    		=> .jar
 *    		=> 1차 => JSP (MVC=>Spring 형식)
 * 		=============================================================
 * 		9장 
 * 			java.lang패키지
 * 			1) import 생략 가능 => 자동추가
 * 				=> 가장 많이 사용되는 라이브러리 (String.System)
 * 			2) 대표 클래스 
 * 			   = Object : 모든 클래스의 상위 클래스
 * 			  			 ----------- Object 상속을 받는다
 * 				 public class A extends Object
 * 								---------------
 * 								생략이 가능
 * 				= 모든 클래스에 사용하는 기능 (메소드)
 * 				= toString() : 객체 주소 
 * 			 		=> 명시적 / 묵시적
 * 						A a=new A();
 * 						=> System.out.println(a.toString()) 명시적 
 * 						=> Sysyem.out.println(a) 묵시적
 * 				=> toString 
 * 					=> 자주 사용이 된다 / 객체의 값이 정상적으로 처리 확인
 * 					=> 객체를 문자열화 시킨다
 * 
 * 				=> clone() : 객체를 복제할 경우
 * 					=> 객체 복사
 * 					=> 얕은 복사 => 같은 주소를 이용
 * 					---------- Call By Reference
 * 					=> 깊은 복사 	=> clone => 새로운 메모리에 저장
 * 						------ 게임 (아바타) => prototype
 * 				=> finalize() : 소멸자 함수 => 메모리 해제
 * 				   -------------------------- System.gc() : 바로 회수
 * 				   -------------------------- 프로그램 종료시에 회수
 * 			     = equals() => 객체 비교	=> 재정의 (오버라이딩)
 * 				 = hashCode() => 비교 
 * 				
 * 
 * 
 * 
 * 				
 */
class student
{
	private String name;
	private String phone;
	private String address;
	
	// 접근 가능 => 메소드 
	public student(String name,String phone,String address)
	{	// 지역변수 / 매개변수
		/*
		 * 1. 지역변수 , 매개변수 찾기
		 * 2. 멤버변수
		 * ** 지역변수 우선순위
		 */
		this.name=name;
		this.phone=phone;
		this.address=address;
		
	}
	public void print()
	{
		System.out.println("이름:"+name);
		System.out.println("전화:"+phone);
		System.out.println("주소:"+address);
	}
}
public class 라이브러리_1 {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student("홍길동","010-1111-1111","서울");
		student s2=new student("심청이","010-2222-2222","경기");
		//	객체 출셕시에 => toString()을 호출한다
		
		
		s1.print();
		System.out.println(s1);
		s2.print(); //=> 묵시적
		System.out.println(s2.toString()); // => 명시적
		s2.print();
		
	}

}
