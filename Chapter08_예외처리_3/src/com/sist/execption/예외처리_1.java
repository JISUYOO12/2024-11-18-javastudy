package com.sist.execption;
/*
 * 예외처리 방법
 * 1. 직접처리 (예외복구)
 * 	  try
 * 	   {
 * 			정상적으로 수행하는 문장
 * 			=> 오류발생 가능성이 있다
 * 		}catch
 * 		{
 * 			오류발생 => 처리 복구
 * 			오류내용만 확인
 * 		}
 * 		finally
 * 		{
 * 				닫기(서버,오라클,파일) => 자원 (resource) 반환
 * 				=> 무조건 수행하는 문장 
 * 		}
 * 2. 간접처리 : throws
 * 
 * 
 * 
 * checkException 				UncheckException
 * 	----------					--------------
 * 	반드시 예외처리					필요시에만 예외처리
 * 								RuntimeException
 * 								ArithmeticException
 * 								ArrayIndexOutOfException
 * 								ClassCastException
 * 								=> throws 뒤에서 사용하지 않는다 => 예외를 피하는 상태 / 시스템에 의해 처리
 * 									try~catch => 예외를 직접 잡아서 필요시에 => 복구
 * 								=> 특별한 경우가 아니면 => throws
 * 								===> try~catch
 */
public class 예외처리_1 {
//	public int div(int a,int b) throws ArithmeticException // 언체크 => 예외처리 선택적 작성
//	{
//		return a/b;
//		
//	}
//	public void print()
//	{
//		int c=div(10,0);
//	}
	public void display() throws Exception,ClassNotFoundException
	{
		System.out.println("display call...");
	}
	// check => 호출시에는 반드시 예외처리를 하고 사용한다
	// uncheck => throws 문장을 사용하지 않는다
	// 1. try ~ catch
	public void print()
	{	try {
		display();
	}catch(ClassNotFoundException e) {}
	 catch(Exception e) {}
	
	}
	public void print2()
	{
		try
		{
			display();
		}catch(Throwable e) {}
	}
	// 3. throws
	public void print3() throws Exception,ClassNotFoundException
	{
		display();
	}
	// 4. throws 
	public void print4() throws Exception
	{
		display();
	}
	/*
	 * 소스가 없는 경우 => 새로운 메소드를 만드는 경우
	 * 	try~catch => 개발
	 * 
	 * 	이미 소스 코딩이 있는 경우 => 새로운 기능 추가
	 * 	throws => 유지보수
	 * ------
	 *  1. 예상되는 예외를 메소드뒤에 선언
	 *  2. 메소드 호출시에 반드시 예외처리 후 호출
	 *  -------------------------------
	 *  	=> 직접처리
	 *  	=> 선언하고 사용할 수 있다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
