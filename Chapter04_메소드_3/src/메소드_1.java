/*
 * 1. 형식 / 문법
 * 2. 간단한 예제 => 흐름 (동작 => 호출)
 * 3. 약간 응용 => 확장
 * 4. 기간이 지나면 감 => 2~3개월
 * 	
 * 		=> 누적
 * -------------------------------------
 * 데이터 저장
 * 	= 변수 : 메모리에 한개의 데이터 저장
 * 	= 배열 : 여러개의 데이터를 연속적으로 저장 => 인덱스 : 고정적 /같은 데이터형
 * 	= 클래스 : 여러개 데이터 저장 => 다른 데이터형 => 동적 (new)
 * 	------------------ 메모리에 저장
 * 	= 파일 => 종속 (파일과 파일의 연결이 어렵다)
 * 	= RDBMS (오라클)
 * 	= 사용자가 요청하면 => 처리
 * 	  = 연산자
 * 	  = 제어문
 *    ----------------관련된 명령문 (기능을 모아서 처리) => 메소드 
 *    사용자가 요청한 위치에 처리 결과 출력
 *     = 브라우저 출력 (웹)
 *     ------------------------------------------------
 *     일반자바 => 오라클연결 자바 ==> 웹 연결 자바 
 *     ----------------------------------
 *     | 통합 : 스프링
 *     
 *     			method(int a,double b,String c...)
 *     			=> method(A a)
 *     			method(int[] arr)
 *     메소드 :=> 결과값(리턴형), 사용자 요청값(매개변수)
 *     		   -----------	------------------
 *     			1개만 가능				제한이 없다
 *     								=> 매개변수를 많이 사용하면 프로그램 짜기가 어려움
 *     			=> 자바/C => 1개만 사용		=> 묶어서 설정 (매개변수 3개이상)
 *     			return 값
 *     			=> 파이썬 => 여러개 가능
 *     			return 값,값,값 ...
 *     			변수,변수,변수 =메소드
 *     
 *     		=> 프로그램
 *     			기본
 *     			 = 입력기능
 *     			 = 요청처리 기능 => 세분화
 *     			 = 출력기능
 *     			 = 모든 메소드는 한개의 기능만 수행 => 유지보수
 *     				=> 예외도 있음  ex) 결제창 => 등록
 *     								교통시스템
 *     									사고 / 공사 => 출력
 *     									  cctv => 위도 / 경도 opencv
 *     				----- 최적화 (속도, 사용자 편리성)	
 *     => 프로그램 => 개발보다 유지보수에 초점
 *      				  ------- 가독성,재사용
 *						  
 *					      메소드 변경 / 메소드 추가
 *	   형식)							  ------- 사용자 요청한 값 => 0 이상 사용
 *			[접근지정어] [옵션] 리턴형 메소드명(매개변수){구현부} 
 *								------- 
 *								 기능별 구분자
 *								=> 문법은 변수 식별자와 동일
 *								=> 약속 => 메소드는 소문자로 시작
 *								=> 메소드명이 동일하면 안된다
 *								=> 기능 => 처리가 다른 경우
 *								-----------------------
 *									같은 메소드명으로 사용(오버로딩)
 *
 *			-------	  ---- ------ 처리 결과값
 *								  리턴형 : 기본형,배열,클래스 
 *							=> 1개만 설정이 가능
 *			default		변경이 없는 final
 *						선언만 abstract
 *						자동 저장 => 공유
 *						------- static
 *			=> 같은 폴더에 존재
 *			   ---------- 패키지    
 *
 *  메소드의 경우의 수 
 *  
 * 	----------------------
 *		리턴형	매개변수
 *	----------------------
 *		1) o		o
 *		string	substring(int begin)
 *		  |리턴형 			| 매개변수
 *		string  substring(int begin,int end)
 *	----------------------
 *		2) o		x
 *		double random() => 0.0~0.99
 *		string trim() => 좌우 공백만 제거
 *		-----        ----
 *	----------------------
 *		3) x		o
 *		void System.out.println(String s)
 *		---- 결과값이 없다 => 메소드 자체 처리
 *		 | => 오라클 연결시에 insert/update/delete
 *	----------------------
 *		4) x		x ==> 사용빈도는 거의 없다
 *		void.System.out.println() => <br>
 *		----				   ---
 *		다음줄에 출력한다	
 *  ------------------------
 *      
 *  메소드 호출
 *  --------
 *  메소드명(전송하는 값) => void
 *  데이터형 변수=메소드명(전송하는 값)
 *  		|  |
 *  		-----
 *  
 *  => 왼쪽에 있는 데이터형이 크거나 같다 => 권장(같은 데이터형)
 *  => 통계 / 회계
 *  
 *  메소드 제작
 *  1) 반복이 많은 경우
 *  2) 기능별로 나눠서 처리 => 단락
 *  3) 다른 클래스와 연결
 *  ---------------------------
 *  메소드 사용 목적
 *  1) 반복제거
 *  2) 코드관리가 쉽게 (소스를 간결)
 *  3) 재사용
 *  
 *  메소드 호출 => 실행 순서
 *  
 *  void display()
 *  {
 *  	1문장 ----2
 *  	2문장 ----3
 *  	3문장 ----4
 *  	4문장 ----5
 *  	5문장 ----6 -----------------------
 *  }
 *  //메소드 => 시작 (JVM => 가장 먼저 호출)
 *  main()
 *  {
 *  	1문장	----1
 *  	display(); ==> 복귀 ----
 *  	2문장 ----7
 *  	3문장 ----8
 *  	display(); ===> 처음부터 마지막까지 수행
 *
 *  }
 *      
 *      
 *      
 *      
 *      */
public class 메소드_1 {
	static void  display()
	{
		int i=1; //display{}안에서만 사용이 가능
		System.out.println("i="+i);
		i++;
		//{}이 종료가 되면 자동으로 메모리에서 사라진다 = 지역변수
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		display(); // 생성 => 소멸
		display(); // 생성 => 소멸
		display(); // 생성 => 소멸
		display(); // 생성 => 소멸
		display(); // 생성 => 소멸	 
		System.out.println("main end");
	}

}
