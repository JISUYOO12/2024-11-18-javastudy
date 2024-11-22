/*
 * 1장 : 자바 특징 / 자바 설치 / 주의점
 * 					jdk.java.net/17
 * 					classpath : .;c\jdk-17.0.2\lib
 * 					path : c:\jdk-17.0.2\bin
 * 					
 * 					=> 대소문자 구분
 * 					=> 들여쓰기
 * 					=> 주석 : 프로그램 분석
 * 					=> ctrl+shift+/ 여러줄 주석
 * 					   ctrl+shift+\ 주석해제
 * 					=> ctrl space 
 * 		===== 효환성 , 메모리 자동 회수 (가비지컬렉션) , 멀티쓰레드
 * 
 * 2장 : 변수 / 연산자
 * 		===
 * 		1) 한개의 데이터를 저장하는 메모리 공간의 별칭
 * 							  ==== 주소
 * 			=> 역활 : 쓰기(메모리 저장=대입) , 읽기 , 수정
 * 					
 * 					 int a=10			 a     a=100
 * 					 변경이 가능한 값 / 변경이 안되는 값 (상수)
 * 					 (변수)
 * 							데이터형 변수명
 * 					 (상수)	
 * 							final 데이터형 변수명; => 오류발생
 * 							final 데이터형 변수명=10; => 오류x
 * 							=> 배열의 갯수 => 상수
 * 							=> 상수 : 데이터형의 최대값,최소값
 * 		2) 메모리 크기 결정
 * 			=> 기본형 / 참조형
 * 			  ====    ====| 사용자 정의 =< class
 * 				|
 * 				자바에서 지원
 * 				정수형
 * 					byte : 1byte , 네트워크 전송, 파일읽기
 * 							-128~127
 * 							** 8bit - 1byte
 * 									------ 0,1을 채우는 공간
 * 							() 1 1 1 1 1 1 1
 * 							== 부호 (음수 :1 , 양수:0)
 * 				문자형
 * 				실수형
 * 				논리형
 * 
 * 			
 * 							
 * 
 * 3장 : 제어문
 * 4장 : 배열
 * 5장 : 객체지향 프로그램
 * 6장 : 상속
 * 7장 : 추상클래스 / 인터페이스
 * 8장 : 예외처리
 * 9장 ~ 라이브러리
 * 		***java.util / java.lang / *** java.io / java.net / *** java.sql
 * 
 */

import java.util.Scanner;

public class 정리_1주차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//모든 데이터형에 대한 정보를 가지고 있는 클래스 => Wrapper
		//System.out.println(Integer.MAX_VALUE);
		
		/*
		 * 
		 */
	}

}
