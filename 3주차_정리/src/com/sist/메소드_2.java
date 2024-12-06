package com.sist;
import java.util.Scanner;
import java.io.*; //파일 , 네트워크 전송 : 읽기 / 쓰기
// input / output => io => 반드시 예외처리
/*
 * 마지막장 12장 
 * ------
 * |
 * 자바 관련 모든 문법 => 응용
 * = 데이터베이스 (o) => 웹
 * = 네트워크 => 온라인 게임 
 * 웹 => 쓰레드 , 네트워크 => 흐름
 * ------------------------------
 * 
 * 
 * 
 */
public class 메소드_2 {       // 클래스 안에 들어와서
	static String seoulData; // 자동초기화 => null
	//초기화 (자동) => 초기화 블럭 => 자동 로그인 / 쿠키 읽기 / 오라클 연동
	static
	{
		try 
		{
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0;
			StringBuffer sb=new StringBuffer(); //저장해놓고 seoulData 로 옮겨줌
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			seoulData=sb.toString();
			fr.close();
		}catch(Exception ex) {}	
	}
	
	static void menu()
	{
		System.out.println("====메뉴====");
		System.out.println("1. 명소 목록");
		System.out.println("2. 명소 상세 보기");
		System.out.println("3. 명소 검색(명소명)");
		System.out.println("4. 명소 검색(주소)");
		System.out.println("5. 종료");
		System.out.println("==================");
	}
	
	/*
	 *  검색
	 *   => stirng[] arr=new string[10]; => List
	 *   							---- 
	 *   1. 갯수 루프
	 *   2. 변수 찾아서 루프
	 */
	static String[] find(int type,String findData)
	{
		// 확인 => 검색된 갯수 ?
		String[] datas=seoulData.split("\n");
		int count=0;
		for(String seoul:datas)
		{
			String[] sd=seoul.split("\\|");
			String ss="";
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(findData))
			{
				//System.out.println(sd[1]+"--"+sd[3]);
				count++; // 배열의 갯수 확인
				
			}
			
		}
		// 배열 크기 확인 
		String[] data=new String[count];
		int i=0;
		for(String seoul:datas)
		{
			String[] sd=seoul.split("\\|");
			String ss="";
			
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(findData))
			{
				//System.out.println(sd[1]+"--"+sd[3]);
				data[i]=sd[1]+"--"+sd[3];
			}
		}
		return data;
	}
	// 조립 => 사용자 정의 메소드 반드시 호출
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			menu();
			System.out.print("메뉴 선택:");
			int m=scan.nextInt();
			switch(m)
			{
			case 5:
				System.out.println("프로그램 종료!!");
				System.exit(0);// 종료  break를 주면 switch문이 종료됨
			case 1:
				// 고민 => 데이터를 받아서 출력 , 메소드안에서 출력
										// -------------- => 이게 더 편함
				break;
			case 3: case 4:
				System.out.print("명소(1),주소(2):");
				int type=scan.nextInt();
				System.out.println("검색어 입력:");
				String fd=scan.next();
				String[] ss=find(type,fd);
				for(String s:ss)
				{	if(s!=null)
						System.out.println(s);
				}
				break;
			}
		}
	}
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		process();
	}

}
