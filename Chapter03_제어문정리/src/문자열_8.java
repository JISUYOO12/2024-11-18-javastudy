// 대문자 변환  => toUpperCase()
import java.util.Scanner;
public class 문자열_8 {
/*
 * 함수 : function
 * 메소드 : method
 * ============== 기능상으로는 동일
 * Class종속여부에 따라서 나뉨 
 * C/C++/Pythopn => function 클래스 종속x
 * Java / Kotlin => method 클래스 종속o
 * 
 * String data="Hello Java"
 * data.replace('a','b') => Hello Jbvb
 * replace(문자, 문자)
 * 		-------------
 * 			old  new
 * String data="Hello Java"
 * data.replace('Java','Oracle') => Hello Oracle
 * replace(문자열,문자열)
 * 		--------------
 * 			old  new
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name="HONG GIL DONG";
		//System.out.println(name.toLowerCase());
		//Upper / Lower => 오라클
		// 데이터 관리 => 자바 + 오라클 => JSP에서 HTML로 변환
		String data="Hello Java";
		System.out.println(data.replace('a','k'));
		System.out.println(data.replace("Java","Oracle"));
		
		// 오라클 연동
		// 이미지, 줄거리, 내용
		// |, &, '' => 오라클에서 첨부할 수 없다
		// & => replace
		// & => Scanner
		// || => 문자열 결합
		// 문자열 => ''
		
	}

}
