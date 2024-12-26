package com.sist.music;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;
public class musicMain {
	// 지니뮤직
	// 멜론
	// => 공통(교집합) , 차집합 / 합집합
	public Set<String> genieMusic()
	{
		Set<String> set=new HashSet();
		try
		{
			Document doc=(Document) Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=((Elements) doc).select("table.list-wrap a.title");
			//System.out.println(title);
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
				
			}
		}catch(Exception ex) {}
		return set;
	}
	public Set<String> melonMusic()
	{
		Set<String> set=new HashSet();
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		musicMain mm=new musicMain();
		Set<String> genie=mm.genieMusic();
		for(String music:genie)
		{
			System.out.println(music);
		}
		System.out.println("=================");
		Set<String> melon=mm.melonMusic();
		for(String music:melon)
		{
			System.out.println(music);
		}
		System.out.println("============차집합");
		// 오라클 => MINUS removeAll()
		// [1,2,3,4,5] - [4,5,6,7,8] =1,2,3
		genie.removeAll(melon);
//		for(String music:melon)
//		{
//			System.out.println(music);
//		}
		System.out.println("==== 통일곡 출력(교집합) ====");
		//  [1,2,3,4,5]  [4,5,6,7,8] =4,5
		// retainAll() => INTERSECT => JOIN
		genie.retainAll(melon);
		System.out.println("통일곡:"+genie.size());
		for(String music:melon)
		{
		System.out.println(music);
		}
		
		System.out.println("====== 멜론+지니 =========");
		// UNION => addAll 
		// => 중복된 경우에 1개만 첨부
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		// UNION ALL => 중복된 데이터 포함
		System.out.println("데이터 갯수:"+list.size());
		for(String music:list)
		{
			System.out.println(music);
		}
		// 중복 제거
		Set<String> hap=new HashSet<String>();
		hap.addAll(list);
		for(String music:list)
		{
			System.out.println(music);
		}
		System.out.println("===중복없는곡===");
		System.out.println("곡수:"+hap.size());
		for(String music:hap)
		{
			System.out.println(music);
		}
		// addAll() : 모든 데이터 읽기 (합집합) / removeAll() : 차집합 / retainAll() : 교집합
		// => JOIN
	}

}
