package com.sist.vo;

public class DeptVO {
	private int deptno;
	private String dname,loc;
	public int getDeptno() {
		return deptno;
		// TO_CHAR => 문자열 => String
		// => 문자열을 받을 수 있게 String 변수 추가
		// 1. 정수 (천단위 , )
		// 2. 날짜 변환
		//
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
