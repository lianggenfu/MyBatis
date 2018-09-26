package com.mall.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Goods {
	
	private int gid;
	private String gname;
	private String type;
	private double price;
	private String date;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", type=" + type + ", price=" + price + ", date=" + date
				+ "]";
	}

	public Goods(int gid, String gname, String type, double price, String date) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.type = type;
		this.price = price;				
		this.date = date;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

	
	
}
