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
		// TODO Auto-generated method stubs
        //Movie m=new Movie();
        //m.display();
		try
		{
			Class clsName=
					Class.forName("com.sist.execption.Movie");
			// 클래스 정보 읽기 
			Object obj=clsName.getDeclaredConstructor().newInstance();  //lsName.getDeclaredConstructor()는 해당 클래스의 기본 생성자를 얻습니다
																		//newInstance() 메서드는 그 생성자를 호출하여 Movie 클래스의 객체를 동적으로 생성합니다
			
			Method[] methods=clsName.getDeclaredMethods(); //getDeclaredMethods()는 클래스에서 정의된 모든 메서드를 배열 형태로 반환합니다.
			
			methods[0].invoke(obj, null); //methods[0]는 Movie 클래스에서 정의된 첫 번째 메서드를 가져옵니다. (여기서는 display() 메서드)
										  // invoke(obj, null)는 display() 메서드를 동적으로 호출하는 코드입니다.
										// obj는 Movie 클래스의 객체이고, null은 display() 메서드의 파라미터가 없으므로 넘겨줍니다.
		}catch(Exception e) {}
//		}catch(ClassNotFoundException ex){}
//		 catch(NoSuchMethodException e) {}
//		 catch(InvocationTargetException e){}
	}

}