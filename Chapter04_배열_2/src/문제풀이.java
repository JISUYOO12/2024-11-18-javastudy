/*
 * 배열 : 관련된 데이터를 여러개 모아서  메모리에 저장
 * 		=> 한개의 이름으로 관리
 * 		1) 같은 데이터형 	2) 연속적인 메모리 구조
 * 		=> 한개의 이름으로 관리
 * 		-----------------
 * 		배열명 => 구분자 (인덱스)
 * 		3) 배열을 선언하면 고정적이다 => 추가, 삭제가 불가능
 * 			=> 현재 배열보다는 큰 배열을 다시 생성한다 (추가)
 * 				int[] arr=new int[5]; => 7
 * 				int[] arr_ext = new int[7]
 * 				=> 동적으로 생성은 가능 (메소드)
 * 			=> 현재 배열보다는 작은 배열을 다시 생성한다 (삭제)
 * 		4) 인덱스번호 => 0부터 ~ 
 * 			=> 배열에 저장된 갯수 => 배열명.length
 * 		5) 배열선언 / 배열 초기화
 * 		   데이터형[] 배열명={1,2,...}
 * 		   데이터형[] 배열명=new 데이터형[저장갯수]
 * 				---배열기호 => 숫자를 사용할 수 없다
 * 			int[] String[] char[]
 * 			---------------------> 데이터형
 */

import java.util.Arrays;

public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2-2
		/*int[] arr= {0,1,2,3,4,5};
		//2-3
		char[] day{'일','월','화','수','목','금','토'};
		2-4
		boolean[] bool={true,false,true,false};
		//3
		/*char[] alpha= {'a','b','c','d'};
		for(char i=0;i<alpha.length;i++)
		{
			System.out.print(alpha[i]); 인덱스를 이용
		}*/
		
		/*
		 * for(char c:alpha)
		 * System.out.print(c) 
		 * => 변수의 일종(한개 / 여러개)
		 => 배열 제어 => 값을 변경 , 값을 저장 / 값을 읽기 (index값이 있어야 변경 가능)
		 	=> 일반 for(초기화할때 사용)
		 	=> for-each => 값을 읽어서 출력
		 		---------- front (react,vueJs,aJax)
		 	변수 => 저장 / 읽기 / 변경
		
		//4
		 * 
		 */
		/*int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
			
		}
		//3의 배수만 출력

		System.out.println(Arrays.toString(arr));
		for(int i:arr)
		{
			if(i%3==0)
				System.out.println(i+" ");
			}
			
				
		}*/
		//5
		/*
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.printf("평균:%.2f",sum/10.0);
		/*
		 * 1. 저장하는 공간 (메모리)
		 * 	=> 한개,두개 => 일반 변수
		 * 	=> 3개 이상 => 배열
		 * 	=> 웹 : 사용자가 보내준 데이터 읽기
		 * 			getParameter("id")
		 * 2. 초기화
		 * 3. 처리 내용 => 평균, 갯수 , 인덱스 위치 ...
		 	=> 데이터베이스(오라클) 검색, 저장 ...
		 * 4. 결과값 출력
		 * 	=> 브라우저로 전송 setAttribute("id","admin")
		 * 		sendJson()
		 * 	[],List ==> 자바스크립트에서는 데이터형(x)
		 * 	-------- JSON	=> React / Vue / Ajax 
		 * 	List ==> []
		 *  클래스 ==> {}
		 *  
		 *  String / StringBuffer
		 *  
		 */
		
		//6
		
		/*int[] num={94,85,95,88,90}; // 명시적 초기화
		int max=num[0];
		int min=num[0];
		for(int i:num)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
			
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);*/
		
		//9
		/*
		int[] arr= {10,20,30,50,3,60,-3};
		int index=0; //for문 밖에 index를 선언해야 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==60)
				{
				index=i;
				break;
				}
		}
		System.out.println("인덱스:"+index); // 블록밖에서 index값을 사용할 수 있음
		
		
		 * 지역변수 => 블럭변수 => 메모리에서 사라진다
		 * {} => 메모리 자체에서 관리
		 * 		 ------- Stack : 지역변수 / 매개변수
		 
		{
			int a=10;
			{
				int b=20;
				{
					int c=30;
				}
			}
		}*/
		//7
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.printf("평균:%.2f",sum/10.0);
		
		

	}
}

