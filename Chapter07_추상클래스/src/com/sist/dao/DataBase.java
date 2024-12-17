package com.sist.dao;
import java.sql.*;
public abstract class DataBase {
// 기능 설정
// => 같은 기능 => 구현
	public void driverConfig()
	{
		try
		{
			Class.forName("Oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	public Connection getConnection()
	{	Connection conn=null;
		try
		{	String url="jdbc.oracle.thin:@localhost:1521:XE";
			conn=DriverManager.getConnection(null);
		}catch(Exception ex) {}
		return conn;
	}
// => 기능은 같은데 구현해야 하는 내용이 다른 경우 => 미구현 / 선언만
	public abstract void listPrint();
	public abstract void findPrint();
	

}
