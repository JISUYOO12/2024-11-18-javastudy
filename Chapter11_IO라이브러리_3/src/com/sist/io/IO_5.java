package com.sist.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
// 문자 단위 저장 => write(String s)
import java.util.*;
public class IO_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw=new FileWriter("c:\\java_data\\student.txt",true);
			String msg="Hello Oracle!!";
			// 크롤링 / Open API
//			fw.write(msg);
//			fw.close();
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(msg);
			System.out.println("저장완료!");
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}

}
