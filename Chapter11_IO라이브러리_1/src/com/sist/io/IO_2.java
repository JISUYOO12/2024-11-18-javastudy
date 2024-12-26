package com.sist.io;
/*
 * listFiles() : file[] => 폴더안에 있는 모든 정보
 * isFile() : 파일여부 확인
 * getPath() : 경로명 + 파일명
 * mkdir() : 폴더 만들기
 * createNewFile() : 파일 만들기
 * 
 * read() / write()
 * => BufferedReader => readLine()
 * => 파일은 반드시 닫아야한다
 */
import java.io.File;
import java.util.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("c:\\javaDev");
		File[] list=dir.listFiles();
		for(File f:list)
		{
			if(f.isFile())
			{
				System.out.println(f.getName()+" "+f.length()+"bytes");
			}
			else if(f.isDirectory())
			{
				System.out.println(f.getName()+"<DIR>"); // gewtName : 파일명만 읽어오기
			}
		}
	}
}
