package com.sist.emp;
import java.sql.*;
import java.util.*;

public class EmpDAO {
	private Connection conn; // 연결 객체
	private PreparedStatement ps; //SQL전송 객체
	// => 오라클 => 데이터 => 오라클에서 실행이 가능한 문장을 전송
							// SQL => SELECT => 데이터 검색
	private final String URL="jdbc:oracale:thin:@localhost:1521:XE";
	// jdbc:업체명:드라이브명:@IP:PORT:데이터베이스명
	// 자바 지원이 아니라 해당 데이터베이스 업체 지원
	
	// 1. 싱글턴 => 객체를 한번만 생성
	private static EmpDAO dao;
	
	// 2. 드라이버 등록 => 1번 등록 => 생성자 
	public EmpDAO()
	{
		try
		{
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			// 클래스 정보를 읽어서 메모리 할당 => 리플랙션
			// 클래스가 가지고 있는 변수 / 메소드 / 생성자 제어
			// ------------------------------- 스프링
			// 스프링 : 객체의 생명주기 (컨테이너)
			// => JSP  (MVC => 구조 : 스프링 형식)
			// 2차 => 1차 프로젝트가 어려움
			
		}catch(Exception ex) {}
	}
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
	// => JDBC (ojdbc8.jar)	=> DBCP(웹) => ORM  => DataSet(JPA)
	// 								   => MyBatis / Hibernate
	// 1. 반복 제거
	// => 연결 / 닫기 => MyBatis
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy
		}catch(Exception ex) {}
	}
	public void disConnecion()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			//exit
		}catch(Exception ex) {}
		
	}
	public TreeSet<String> empGetNames()
	{
		TreeSet<String> set=new TreeSet<String>();
		try
		{
			
		}catch(Exception ex)
		{
			
		}
		finally
		{
			disConnecion();
		}
		return set;
	}
	// 직위 => 중복 => 중복제거
	public HashSet<String> empGetJobs()
	{
		HashSet<String> set=
				new HashSet<String>();
		try
		{	// 1. 연결
			getConnection();
			// 2. 오라클 => SQL문장
			String sql="SELECT ename FROM emp";
			// 3. 오라클 전송
			ps=conn.prepareStatement(sql);
			// 4. 실행 후 데이터 읽기
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				set.add(rs.getString(1));
				// 자바 => 0
				// 오라클 => 1
			}
			rs.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnecion();
			
		}
		return set;
	}
	// 사원의 모든 정보 => 목록 (ArrayList)
	
}
