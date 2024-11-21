/*
 * 알파벳을 입력받아서
 * 	=> 대문자 / 소문자 / 알파벳이 아닌 경우
 * 	대문자라면 => if(대문자 조건)
 *  소문자라면 => if(소문자조건)
 *  알파벳이 아니라면 => if(대문자, 소문자가 아니라면)
 *  
 */
import java.util.Scanner; //입력을 받아서 처리해주는 클래스
public class 자바제어문_단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		char ch=scan.next().charAt(0); //char를 받는 경우에 사용
		//System.out.println("ch="+ch);
		/*
		 * 기본 : 비교연산자
		 * 		 논리연산자 ==> 부정연ㅅ나자
		 * 		&& => 어디에서 어디까지 ==> 사이에 있다면
		 * 		|| => 범위에 없는 경우
		 * 			예) 0~100
		 * 			    a>=0 && a<100 ==> 처리
		 * 				a<0 || a>100 ==> 다시 입력을 요청하는 경우
		 * 
		 * 				연산자
		 * 					오라클 / javascipt / 파이썬
		 * 				1~10 11~20 
		 * 				
		 * 					
		 */
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"눈(은) 대문자입니다");
		if(ch>='a' && ch<='z')
			System.out.println(ch+"눈(은) 소문자입니다");
		if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')))
		{
			System.out.println(ch+"눈(은) 알파벳이 아닙니다");
		}
	}

}
