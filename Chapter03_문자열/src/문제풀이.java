// 1.대소문자가 있는 문자열을 입력받아서
// 대문자는 소문자로 소문자는 대문자로 변경
// 2.문자열을 입력받아서 역순으로 출력하는 프로그램 작성
import java.util.Scanner;
//toString() : ()객체의 주소 => 오버라이딩 
/*
 *  length()
 *  substring()
 *  equals()
 *  contains()
 *  indexOf() /lastindexOf()
 *  valueOf()
 *  trim()
 *  replace()
 *  split()
 *  ------------------------ 필요적으로 암기
 *  AI ==> 데이터 수집 ==> 데이터 분석 ==> 교육
 *  		------- 전처기
 */
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2번
		 * Scanner scan=new Scanner(System.in);
		System.out.println("문자열을 입력하세요:");
		String msg=scan.next();
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		}*/
		//1번
		Scanner scan=new Scanner(System.in);
		System.out.println("변경전:");
		String msg=scan.next();
		String change="";
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			if(c>='A' && c<='Z')
			{
				change+=Character.toLowerCase(c);
			}
			else if(c>='a' && c<='z')
			{
				change+=Character.toUpperCase(c);
			}
			System.out.print("변경 후:"+change);
		}
		
		
	
	
	}

}
