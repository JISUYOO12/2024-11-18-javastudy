package com.sist.execption;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Class.forName("") => ClassNotFoundException  // jar 파일이 없거나 class 파일이 없을 경우 발생한 경우
// CheckException => 반드시 예외처리후 사용 
// 메모리 할당 
class Movie
{
	public void display()
	{
		System.out.println("Movie:display() Call...");
	}
}
public class 예외처리_메모리할당_리플렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Movie m=new Movie();
        //m.display();
		try
		{
			Class clsName=
					Class.forName("com.sist.execption.Movie");
			// 클래스 정보 읽기 
			Object obj=clsName.getDeclaredConstructor().newInstance();
			
			Method[] methods=clsName.getDeclaredMethods();
			
			methods[0].invoke(obj, null);
		}catch(Exception e) {}
//		}catch(ClassNotFoundException ex){}
//		 catch(NoSuchMethodException e) {}
//		 catch(InvocationTargetException e){}
	}

}