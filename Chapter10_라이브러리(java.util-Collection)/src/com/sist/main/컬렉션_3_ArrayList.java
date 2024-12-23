package com.sist.main;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor // 생성자 만들기 => 코드는 짧아지나 가독성이 떨어질 수 있다
@NoArgsConstructor  // default 생성자
class Student
{	
	private int hakbun;
	private String name;
	private int kor,eng,math;
}


public class 컬렉션_3_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // 배열 고정 => 가변
										// 추가시마다 자동으로 메모리가 늘어난다
		// 데이터 추가
		list.add(new Student(1,"홍길동",90,80,70));
		list.add(new Student(2,"심청이",97,85,72));
		list.add(new Student(3,"박문수",93,86,73));
		list.add(new Student(4,"이순신",94,87,74));
		list.add(new Student(5,"강감찬",95,88,75));
		System.out.println("학생 인원:"+list.size());
        for(Object std:list)
        {
        	Student s=(Student)std;
        	
        	String ss=String.format("%.2f", 
        			(s.getKor()+s.getEng()+s.getMath())/3.0);
        	
        	System.out.println(s.getHakbun()+" "
        			+s.getName()+" "
        			+s.getKor()+" "
        			+s.getEng()+" "
        			+s.getMath()+" "
        			+(s.getKor()+s.getEng()+s.getMath())
        			+" "
        			+ss);
        }
	}

	private static int getMath() {
		// TODO Auto-generated method stub
		return 0;
	}

}
