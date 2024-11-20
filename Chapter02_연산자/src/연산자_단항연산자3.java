/*
 * 
 * 형변환연산자
 * ======== long => int , char => int , byte => int 
 * 			int => double , double => int 
 * 			숫자 / 문자(정수인식) => boolean은 제외
 * 
 * 			데이터형의 크기
 * 			<===                =====>
 * 			DownCasting         Upcasting
 * 			: 데이터형을 작게       : 데이터형을 크게
 * 			=> 강제  	            => 자동
 * 			byte < short < int < long < float < double 
 * 					char
 *		
 *			byte b=10;
 *			int i=b;
 *					---int로 변경
 *
 *			int a=10;
 *			double d=a;
 *			=> d=10.0;	
 * 			
 * 			10 + 10.5 => 20.5 => 연산은 같은 데이터형만 처리가 가능
 * 			int  double
 * 			|
 * 			10.0 + 10.5 => 20.5
 * 			int 값이 자동으로 double값으로 바뀜
 *  		작은 값 -> 큰 데이터로 바뀜
 *  		** 가장 큰 데이터형으로 바뀜
 *  		** 예외 : int 데이터형(byte, char, short)은 
 *  			byte + byte
 *  			100    50  =>150 => int
 *  							  | 오버플로우 발생 
 *  			char + char => int 
 *  			byte + int => int
 *  			double + float = double
 *  			short + byte + char =int
 *  			
 *  			*** 필요시에는 강제로 변환
 *  						======== 형변환 연산자
 *  
 *  				(int)10.5 + (int)20.3
 *  				=========   ===============
 *  				10 			20  ==>30
 *  
 *  				(int)(10.5+20.5) => 31
 *  						----------
 *  						31.0
 *  
 *  			=> 연산자 => () 최우선순위 연산자
 *  			=> 3+5*2 =>13
 *  			
 *  
 *  			(데이터형)변수
 *  			=> 10/3 => 3 (정수/정수=정수)
 *  			=> 10/(double)3 =>
 * 
 * */
public class 연산자_단항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*int a=10;
			double d=a;
			System.out.println(d);
			
			char c='A';
			int e=c;
			System.out.println(e);
			*/
		/*byte b1=100;
		byte b2=23;
		int b3=b1+b2;
		System.out.println(b1+b2);
		*/
		/*
		int a=10;
		int b=3;
		System.out.println(a/b);
		System.out.println(a/(double)b);
		*/
		int a=123456;
		double d=123456.78;
		int res=(int)((d-a)*100);
		
		System.out.println(res);
		/*
		 * 
		 */
			
	
	
	}

}
