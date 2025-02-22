package com.sist.dao;
// 데이터베이스 연결하는 클래스
import java.util.*;
import java.security.spec.RSAKeyGenParameterSpec;
import java.sql.*;
import com.sist.vo.*;
/*
 *  오라클 => SQL 
 *  		----- 자바에서 실행여부 => 자바에서 오라클 SQL문장 정리 
 *  => 오라클 / 자바 => 숙지 
 *     ----------
 *     	| 자바스크립트 
 *     -------------------- 통합해서 사용 (Spring)
 *     	
 */
public class EmpDAO {
	// 오라클 연결
	private Connection conn; // socket
	// 오라클 SQL 전송 = 결과값
	private PreparedStatement ps;
	//DAO => 사용자당 한개만 생성 => 메모리 최소화 (Connection 조절)
	private static EmpDAO dao;
	// 고정 데이터 : URL (오라클 주소)
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// XE => 데이터베이스명 => 모든 테이블이 들어가 있다
	// => 폴더 (파일 여러개)
	// 자바 12장
	// 1. 드라이버 등록 => 한번만 사용 
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 클래스명으로 메모리 할당 
		/*
		 * 1. 생성자
		 * 2. 멤버변수
		 * 3. 메소드 => 매개변수도 처리 
		 * -------------- 제어할 수 있다
		 * => 리플렉션 : => 스프링 / 메소드 자동호출이 가능 
		  
		 */
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// 싱글턴 => 메모리 공간 / 재사용
	// newInstance () / getInstance()
	// Calendar.getInstance()
	// 파싱 : XML / HTML / JSON
	// 			   ----- Jsoup
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
// 오라클 연결 
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy
		}catch(Exception ex){}
	}
	// 오라클 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// -----------------공통사항
	/*
	 * DAO => 테이블 1개에 대한 제어
	 * 	=> BoardDAO
	 * 	=> ReplyDAO
	 * Service => 관련된 테이블 여러개
	 * => BoardService : Board/Reply
	 * 
	 */
	// 1. 기능 
	/*
	 *  사원 (사번,이름,직위,입사일,급여)
	 *  부서 (부서명,근무지)
	 *  등급 (등급)
	 *  ------------------------------- 테이블 3개에서 출력에 필요한 데이터 추출 : 조인 
	 *  
	 */
	public List<EmpVO> empJoinAllData()
	{
		List<EmpVO> list=
				new ArrayList<EmpVO>();
		try
		{
			//1. 오라클 연결
			getConnection();
			// 2. 오라클로 SQL 전송
			String sql="SELECT empno,ename,job,hiredate,TO_CHAR(sal,'$999,999'),"
						+"dname,loc,grade "
						+"FROM emp,dept,salgrade "
						+"WHERE emp.deptno=dept.deptno "
						+"AND sal BETWEEN losal AND hisal";
	
			//2-1
			ps=conn.prepareStatement(sql);
			//3. sql실행후에 결과값을 메모리에 저장
			ResultSet rs=ps.executeQuery();
			// 4. 커서 위치 변경 => 첫번째 출력 위치 => rs.next()
			/*
			 *   empno,ename,job,hiredate,sal,dname,loc,grade
			 *   int   String String Date Int String String Int 
			 *   getInt getString getDate
			 */
			while(rs.next()) // 다음으로 내려간다 => 데이터가 없는 경우에 false 
			{
				EmpVO vo=new EmpVO(); // Recored 단위
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setStrSal(rs.getString(5));
				vo.getDvo().setDname(rs.getString(6));
				vo.getDvo().setLoc(rs.getString(7));
				vo.getSvo().setGrade(rs.getInt(8));
			
				list.add(vo);
				
			
			}
			rs.close();
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	public EmpVO empFindData(int empno)
	{
		EmpVO vo=new EmpVO();
		
		return vo;
	}
}
