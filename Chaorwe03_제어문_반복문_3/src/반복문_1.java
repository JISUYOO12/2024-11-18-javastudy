/*
 * while / do~while
 * 			   | 반드시 한번 이상 수행시에 주로 사용 => 거의 사용빈도는 없다
 * 	 | 반복횟수가 없는 경우에 주로 사용 (데이터베이스 / 파일 읽기)
 *  반복제어문
 * 	 |
 * 	  break : 반복 종료
 * 	  continue : 특정부분을 제외
 * 	  ========== for: 증가식으로 이동 / while : 조건식으로 이동
 * 									 ------ continue는 처음부터 시작
 * 	형식)
 * 		while
 * 		초기식	------- 1
 * 		while(조건식) ----2 =true : 반복문장 수행, false:종료
 * 		{
 * 			반복 실행 문장 -3
 * 			증가식 -------4 => 2번이동
 * 		}
 * 
 * 		do~while	: while을 보완(무조건 한번 수행)
 * 		초기식		-----1
 * 		do	
 * 		{
 * 			반복 실행문장	--2
 * 			증가식	------3
 * 		}while(조건식);	--4 =>2번으로 이동(true)
 * 							  false면 종료
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10
		System.out.println("=======for=======");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println("\n======while");
		int i=1;
		while(i<=10)
		{
			System.out.println(i+" ");
			i++;
		}
		System.out.println("\n===== do~while====="); //i=11
		i=1;
		do
		{
			System.out.println(i+" ");
			i++;
		}
		while(i<=10);
	}

}
