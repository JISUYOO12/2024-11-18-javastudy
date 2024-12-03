/*배열 => 같은 데이터를 묶어서 관리 (변수 여러개 제어하기 쉽게 하나으ㅣ)
		---------
		용도가 통일
    = 연속적으로 메모리가 배치 (같은 크기로 제작)
	= 구분자 => 인덱스(0부터 순차적으로) => 반복문을 사용하기 편리
								// --------- 중복을 제거
 	= 몇개 저장 => 데이터형
 		-----------------선언
 	= 초기화
 	= 요청된 데이터를 구하기
 	= 결과값 출력
 		
import java.util.Arrays;

public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		/*int[] score={100,90,85};
		int total=0;
		System.out.println(Arrays.toString(score));
		for(int i=0;i<score.length;i++)
		{
			System.out.println((i+1)+"번학생:"+score[i]+'점');
			total+=score[i];
		}
		
		System.out.println("학생들의 총점:"+total+'점');*/
		//2번
		/*int[] arr= {50,45,35,12,70};
		System.out.println("======사원실적======");
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("사원"+"("+(i+1)+")"+" "+arr[i]);
			sum+=arr[i]; //arr에 있는 정수를 sum에 누적 //
		}
		System.out.println("1월 실적의 총점:"+sum);
		System.out.printf("1월 실적의 평균:%.2f\n",sum/(double)arr.length);
		
		int max=arr[0]; //실적
		int min=arr[0];
		int maxi=0; //실적이 가장 큰 사원의 사번
		int mini=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				maxi=i;
			}
				
			if(min>arr[i])
			{
				min=arr[i];
				mini=i;
			}
		
		}
		System.out.println("실적이 가장 높은 사번과 실적:");
		System.out.println("사원("+(maxi+1)+")"); //max+1 => maxi가 0부터 시작되니까 +1을 줌
		System.out.println("실적:"+max);
		System.out.println("실적이 가장 적은 사번과 실적:");
		System.out.println("사원("+(mini+1)+")");
		System.out.println("실적:"+min);
		*/
		//3,4번
		/*int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i; 
			sum+=arr[i];
		}
		System.out.println("0~9까지의 합:"+sum);
		*/
		//5번
		/*
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		
		int evenTotal=0; //짝수의 합
		int oddTotal=0;  // 홀수의 합
		for(int i:arr) // 값만 가져와서 홀/짝 확인
		{
			if(i%2==0)
				evenTotal+=i;
			else
				oddTotal+=i;
		}
		System.out.println("짝수의 합:"+evenTotal);
		System.out.println("홀수의 합:"+oddTotal);
		*/
		//6번
		/*
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		int[] result=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			result[arr[i]]++;
				//------인덱스값
		}
		//출력
		for(int i=0;i<result.length;i++)
		{
			System.out.println(i+"의 갯수:"+result[i]);
		}
		*/
		//7번
		/*char[] arr= new char[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(arr));
		//초기값 => 50% 
		//ASC정렬 ==> 선택정렬
		for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=1+i;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j]) {
					 char temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println("정렬 후 :");
		 System.out.println(Arrays.toString(arr));
		//DESC정렬 ==> 버블정렬
		 /*for(int i=arr.length-1;i>=0;i--)
		 {
			 System.out.print(arr[i]+" ");
		 }*/
		 //108 ~ 110page
/*
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-j;j++)
			{
				if(arr[j]<arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
		
		// => 스택 / 큐

		
	}

}*/
