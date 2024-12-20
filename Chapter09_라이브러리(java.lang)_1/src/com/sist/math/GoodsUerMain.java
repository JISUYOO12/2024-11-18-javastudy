package com.sist.math;

public class GoodsUerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsDAO dao=GoodsDAO.newInstance();
		// newInstance(), getInstance()
		// Calendar cal=Calendar.getInstance()
		int count=dao.goodsTotalPage();
		int totalpage=(int)(Math.ceil(count/15.0));
		System.out.println(totalpage);
		
	}

}
