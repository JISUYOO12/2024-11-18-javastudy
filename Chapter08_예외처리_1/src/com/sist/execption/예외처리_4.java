package com.sist.execption;
import java.util.Scanner;
/*
 * 언체크 
 * ------
 * 		Throwable
 * 			| 
 * 		Exception : 예외처리의 모든 것을 잡을 수 있다
 * 			| 
 * 		RuntimeException => 배열범위 초과, 0으로 나누는경우 , 정수
 * 			|
 * 		-----------------------
 * 		|					  |
 * 		ArrayIndexOutOfBoundsException => 배열범위 초과
 * 		ArithmeticException	=> 0으로 나누는 경우
 * 		NumberFormatException => 정수변환
 * 		ClassCastException => 형변환
 * 
 * 		int a=0,b=0 ==> 밑에서도 사용 가능
 * 		try
 * 		{
 * 			int a=10;
 * 		}catch(Exception e)
 * 		{
 * 			int b=20;
 * 		}
 * 		
 * 		a,b => 사라진다
 * 
 */
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[2]; // 배열범위 , 0
		try
		{
			System.out.println("첫번째 정수 입력:");
			String s1=scan.next();
			System.out.println("두번째 정수 입력");
			String s2=scan.next();
			
			arr[0]=Integer.parseInt(s1); // 정수 변환
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		}
//		catch(RuntimeException e)
//		{
//			System.out.println("에러발생");
//		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			//System.out.println(ex.getMessage());
			// 에러 메세지만 출력
			ex.printStackTrace(); // 권장
			// 에러시 => 에러 위치 확인
		}catch(NumberFormatException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상수행");
		// 정상 수행 => catch는 수행하지 않는다
		// try안에서 오류발생시 수행
	}

}
