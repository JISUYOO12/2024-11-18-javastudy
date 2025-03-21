package com.sist.main;
/*
 *   CREATE TABLE recipe(
	   no NUMBER,
	   title VARCHAR2(4000) CONSTRAINT recipe_title_nn NOT NULL,
	   poster VARCHAR2(260) CONSTRAINT recipe_poster_nn NOT NULL,
	   chef VARCHAR2(500) CONSTRAINT recipe_chef_nn NOT NULL,
	   link VARCHAR2(300),
	   hit NUMBER DEFAULT 0,
	   CONSTRAINT recipe_no_pk PRIMARY KEY(no)
	);
 */
public class RecipeVO {
	private int no;
    private String title;
    private String poster;
    private String chef;
    private String link;
    private int hit;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
    
}
