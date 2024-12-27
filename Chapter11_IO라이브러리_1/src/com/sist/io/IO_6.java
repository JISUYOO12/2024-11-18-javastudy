package com.sist.io;
import java.io.*;
public class IO_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir=new File("c:\\java_data");
        // rm 파일명  => rm -rf 폴더명
        //dir.delete();
        File[] files=dir.listFiles();
        for(File f:files)
        {
        	f.delete();// 폴더안에 파일이 존재하면 삭제가 안된다 
        }
        dir.delete();// 폴더를 삭제 
        System.out.println("삭제 완료!!");
	}

}