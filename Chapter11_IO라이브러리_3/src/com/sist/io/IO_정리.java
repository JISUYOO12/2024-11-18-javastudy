package com.sist.io;
import java.util.*;
import java.io.*;
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{	
//			// 웹 => 데이터 /HTML
//			BufferedReader in=new BufferedReader(new InputStreamReader(null));
//			// Scanner => 가장 단순한 입력 클래스
//			System.out.println("문자열 입력:");
//			String msg=in.readLine(); // enter => 메모리에 저장
//			System.out.println(msg);
//			// 명령프롬프트 (x) => 입력창 / 출력창
//			//				   브라우저 (윈도우)
//			
			System.out.print("입력:");
			int data=System.in.read(); // read => 한글자씩 가져옴 // readLine() => 한줄씩
			System.out.println((char)data);
			
		}catch(Exception ex) {}
	}

}
