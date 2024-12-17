package com.sist.seoul;
import java.io.*;

import com.sist.vo.seoulVO;
public class Seoul {
  
  public String getFileData(String path)
  {
	  StringBuffer sb=new StringBuffer();
	  try
	  {
		  FileReader fr=new FileReader(path);
		  int i=0; // 문자 1개 읽기
		  while((i=fr.read())!=-1)
		  {
			  sb.append((char)i);
		  }
		  fr.close();
	  }catch(Exception ex) {}
	  
	  return sb.toString();
  }
  
  public seoulVO[] seoulAllData(int type)
  {
	  seoulVO[] datas=null;
	  String data="";
	  if(type==1) // location 
	  {
		  data=getFileData("c:\\javaDev\\seoul_location.txt");
	  }
	  else
	  {
		  data=getFileData("c:\\javaDev\\seoul_nature.txt");
	  }
	  String[] seoul=data.split("\n");
	  datas=new seoulVO[seoul.length];
	  
	  int i=0;
	  for(String s:seoul)
	  {
		  String[] ss=s.split("\\|");
		  datas[i]=new seoulVO();
		  datas[i].setNo(ss[0]);
		  datas[i].setName(ss[1]);
		  datas[i].setContent(ss[2]);
		  datas[i].setAddress(ss[3]);
		  i++;
	  }
	  return datas;
  }
  /*public SeoulVO[] seoulListData(int page)
  {
	  SeoulVO[] seoul=new SeoulVO[];
	  
	  return seoul;
  }
  public SeoulVO[] seoulFindData(int type,String findData)
  {
	  
  }*/
}