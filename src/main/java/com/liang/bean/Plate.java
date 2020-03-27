package com.liang.bean;

import java.util.Date;
//板块
public class Plate {
    private Integer bid;//板块id

    private String bname;//板块名字

    private String btime;//板块创建时间

    public Plate() {
		super();
	}

	public Plate(Integer bid, String bname, String btime) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btime = btime;
	}

	public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime.substring(0,btime.length()-2);
    }

	@Override
	public String toString() {
		return "Plate [bid=" + bid + ", bname=" + bname + ", btime=" + btime + "]";
	}
    
}