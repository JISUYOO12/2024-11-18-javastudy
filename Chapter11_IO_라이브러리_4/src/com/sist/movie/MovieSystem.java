package com.sist.movie;
import java.io.*;
import java.util.*;
// ObjectInputStream 
public class MovieSystem {
	// 영화정보를 가지고있다 => 요청 기능 
	// 검색 WHERE titLE LIKE '%fd%' , Object readObject()
									// 형변환후에 사용
	// 객체 생성시에는 FileInputStream / FileOutputStream
	// 
	private static List<Movie> movieList=new ArrayList<Movie>();
	
	static
	{	ObjectInputStream ois=null;
		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\movie_info.txt");
			ois=new ObjectInputStream(fis);
			movieList=(List<Movie>)ois.readObject();
			// => 제어 => List로 사용
			// => 파일에 다시 저장
			// remove
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}
	public List<Movie> movieListData()
	{
		return movieList;
	}
	public Movie movieDeratilData(int mno)
	{
		Movie movie=new Movie();
		for(Movie m:movieList)
		{
			if(m.getMno()==mno)
			{
				movie=m;
				break;
			}
		}
		return movie;
	}
	// 저장되는 데이터는 반드시 implements Serializeable 사용
	// 일반저긍로 사용이 가능 =>  
	// 객체 생성시에는 FileInputStream / FileOutputStream 
	
	public List<Movie> movieFindData(String title)
	{
		List<Movie> list=new ArrayList<Movie>();
		for(Movie m:movieList)
		{
			if(m.getTitle().contains(title))
			{
				list.add(m);
			}
		}
		return list;
	}
	
}
