package com.sist.execption;
/*
 * 예외처리 => try~catch
 * => IO / SQL 
 * => try : 정상 수행하는 문장
 * 			=> 입력값 , 실수 => 오류발생할 수도 있음 
 *		=>오류발생 => 찾아서 오류 복구
 *		----------------------
 *			catch
 *		try => if
 *		catch => else
 *		=> if~else if ...
 *		catch => 한개만 수행
 *		catch => 클래스크기에 따라 작은 순서 제작
 *				----------------------
 *				1. 계층구조
 *					Object : 최상위
 *					  |
 *					Throwable
 *					  |
 *			----------------------
 *			|					|
 *			Error 				Exception
 *			=> 처리가 불가능		=> 처리가 가능한 에러
 *			
 *			Exception
 *		Check	|	  Uncheck
 *		=> 컴파일시에		=> 필요시에 예외처리한다
 *		   예외처리가
 *		   되었는지 확인
 *		--------------------
 *		|					|
 *							실행시 => 입력값 확인
 *	IOException				RuntimeException
 *	SQLExecption				|
 *	ClassNotFoundException		NumberFormarException
 *								ArrayIndexOfBoundsException
 *								ClassCastException
 *								...
 *								NullPointerException
 *예외를 잡을 수 있는 능력은 상위클래스일수록 크다
 * => catch(Exception e)
 * 
 *	예외처리 전체 / 부분
 */
public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
