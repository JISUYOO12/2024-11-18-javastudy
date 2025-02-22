/*
 *  자바에서 지원하는 연산자
 *  => 연산자 , 피연산자
 *  10 +20
 *  --   --
 *  |    |
 *  ---------피연산자
 *  1. 피연산자가 1개인 경우 : 단항연산자
 *  2. 피연산자가 2개인 경우 : 이항연산자
 *  3. 피연산자가 3개인 경우 : 삼항연산자
 * 
 * => 데이터 저장 ==> 연산처리 / 제어처리 ==> 처리 결과 출력
 *					---------------
 *					| 소스코딩이 많다(알고리즘)
 *					| 재사용 => 관련된 소스를 묶어서 관리
 *								==================
 *								| 메소드
 * => 변수 / 연산자 / 제어문
 * 변수 : 한개를 저장해서 가공후에 출력
 * --- 데이터형을 어떻게 선택
 * 		ex) 점수 => 국어, 영어, 수학 ... int
 * 			평군 => double
 * 			학점 => String
 * 변수에서 가장 많이 사용되는 데이터형
 * 정수 : int / long 
 * 		 byte b1=10;
 * 		 byte b2=127;
 * 		 int b3=(b1+b2);
 * 
 * 실수 : double
 * 문자 : char
 * 논리 : boolean
 * 문자열 : String
 * ================================ 웹/윈도우 ==> 문자열
 * 										|
 * 										JTextField
 * 										<input type="text"> => int
 * 연산처리 ===> 38page
 * 1. 단항연산자
 * 	  증감연산자 (++,--) : 1증가 , 1감소
 * 		=> 반복문에서 주로 사용
 * 		=> 총알 , 아바타 이동 (게임)
 *		=> 전치연산자 / 후치연산자
 *			============= 1 증가 , 1 감소
 *		int a=10;
 *		a++;
 *		=> a=11
 *
 * 		int a=10;
 * 		++a
 * 		=> a=11
 *		===================
 *		int a=10;
 *		int b=a++;
 *			-- --
 *			1  2
 *			b=a
 *			a=a+1
 *		=> b=10
 *		   a=11
 *
 *
 *		int a=10
 *		int b=++a;
 *			-- --
 *			2	1
 *		a=a+1
 *		b=a
 *		=> a=11, b=11
 *
 *  	int a= 10;
 *  	a--; => a=a-1
 *  	=> a=9
 *  	int a=10;
 *  	--a; => a=a-1
 *  	=> a=9
 *  
 *  	기능 : 출력 / 증가
 *  	int a=10;
 *  	System.out.println(a++);
 *  	1. System.out.println(a); =>10
 *  	2. a=a+1;

		System.out.println(++a);
		1. a=a+1
		2.System.out.println(a); =>11
		
		
 *		 
 * */
public class 연산자_단항연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		System.out.println(a++); 출력후에 증가
		System.out.println(a);
	*/
		/*
		int a=10;
		System.out.println(++a); //증가후에 출력
		System.out.println(a);
		
			 8 : 주소값 
			----
			값 : 10 ==> 데이터 가공
			변수명 : a
			----
		*/
		/*for(int i=1;i<10;i++)
			System.out.println(i);
			*/
		int a=10;
		a++;
		a++;
		--a;
		--a;
		++a;
		System.out.println(a);//다섯번 증가
		// 변수는 필요시에 변경이 가능 데이터형 변수면
		// 상수는 변경이 불가능 = 데이터 고정 final 데이터형 변수명s
		
	}		

}
