/*
 * 3명의 학생
 * 	=> 국어/영어/수학점수를 입력받아서 
 * 	=> 총점 / 평균 / 학점 / 등수를 출력한다 
 */
import java.util.Scanner;
public class 배열응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] arr=new int[3][7]; 
		int[] kor=new int[3]; //000
		int[] eng=new int[3]; //1번 / 2번 / 3번 => 인덱스번호 일치
		int[] math=new int[3]; 
		int[] total=new int[3];
		double[] avg=new double[3]; //0.0,0.0,0.0
		char[] score=new char[3];//'\0'
		int[] rank=new int[3];
		
		//점수입력을 받아서 => 초기화 ==> avg
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"'국어 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"'영어 입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"'수학 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//학점 계산
		for(int i=0;i<kor.length;i++)
		{
			switch((int)(avg[i])/10) //정수 , 문자 , 문자열
			{
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
			score[i]='A';
			break;
			case 7:
			score[i]='A';
			break;
			case 6:
			score[i]='A';
			break;
			default:
				score[i]='f';
			}
		}
		//등수 계산
		//출력
		
		for(int i=0;i<kor.length;i++)
		{
			//System.out.printf("%5d%5d%5d%7d%7.2f\n",kor[i],eng[i],math[i],total[i],avg[i]);
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",kor[i],eng[i],math[i],total[i],avg[i]);
			//-5d => 왼쪽 정렬 => 공백을 출력 => 3자리
			//JDK 1.5이상에서만 사용이 가능 => 
			// C언어와 동일하게 => exe파일 => C언어에서 도입
			// 썬 => 순수하게 자바로만 라이브러리 추가
			// 오라클에서 자바인수 => C언어 => C언어로 변경이 되는 경향
			// 람다식 (함수 포인터) , NIO ... => 호환성
			// 
			//%5d=> 출력할 공간 5개를 만듬 (앞에 공백 3칸을 만듬)
		}
	}

}
