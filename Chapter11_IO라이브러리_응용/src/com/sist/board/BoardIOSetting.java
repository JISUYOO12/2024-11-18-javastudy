package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardIOSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=null;
		try
		{
			List<BoardVO> list=
					new ArrayList<BoardVO>();
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\Board.txt");
			oos=new ObjectOutputStream(fos);
			System.out.println("파일에 저장공간 생성 완료!!");
		oos.writeObject(list);
	
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			// 오라클 / 서버 / 파일
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}

}
