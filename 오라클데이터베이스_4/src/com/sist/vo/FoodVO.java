package com.sist.vo;

import lombok.Data;

/*
 *  FNO                                                NUMBER(38)
 PHONE                                              VARCHAR2(128)
 ADDRESS                                            VARCHAR2(4000)
 THEME                                              VARCHAR2(4000)
 NAME                                               VARCHAR2(4000)
 TYPE                                               VARCHAR2(128)
 SCORE                                              NUMBER(38,1)
 POSTER                                             VARCHAR2(4000)
 IMAGES                                             VARCHAR2(4000)
 TIME                                               VARCHAR2(256)
 PARKING                                            VARCHAR2(256)
 CONTENT                                            VARCHAR2(2048)
 */
@Data
public class FoodVO {
	private int fno;
	private String name,type,phone,address,theme,poster,
			images,time,parking,content;
	private double score;
	
}
