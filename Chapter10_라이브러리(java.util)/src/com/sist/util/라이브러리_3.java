package com.sist.util;
import java.util.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red|yellow|green|pink|magenta|blue|black|cyan";
		StringTokenizer st=new StringTokenizer(color,"|");
		//String[] colors=color.split("\\|");
		
		System.out.println("컬러 갯수:"+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.print(st.nextToken());
		}
		/*
		 * hasMoreTokens
		 * 
		 * -------------------
		 * => before First
		 * -------------------
		 * red => st.nextToken() => true  다음 데이터가 있는경우
		 * 
		 * -------------------
		 * yellow => st.nextToken() => true 
		 * -------------------
		 * green=> st.nextToken() => true 
		 * -------------------
		    ...=> st.nextToken() => false
		 * -------------------
		 * ==> after last
		 */
		
		
		// 초과시에는 오류
//		String color1=st.nextToken();
//		String color2=st.nextToken();
//		String color3=st.nextToken();
//		String color4=st.nextToken();
//		String color5=st.nextToken();
//		String color6=st.nextToken();
//		String color7=st.nextToken();
//		String color8=st.nextToken();
		// String color9=st.nextToken(); => 초과시 오류
		
		
		
	}

}
