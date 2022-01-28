package com.hi.bean;

import java.sql.Date;

public class BbsBean {
	private int num;
	private String id;
	private String sub;
	private String content;
	private Date nalja;
	
//	getter & setter set이나 get을 쓰고 뒤에 필드명앞글자를 대글자로 붙인 후, ctrl+space하면 자동으로 식이 완성된다
//	num
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
//	id
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
//	sub
	public void setSub(String sub) {
		this.sub=sub;
	}	
	public String getSub() {
		return sub;
	}
	
//	content
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	
//	nalja
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	public Date getNalja() {
		return nalja;
	}
}
