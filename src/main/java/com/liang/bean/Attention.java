package com.liang.bean;
//关注
public class Attention {
	int gid;//关注表id
	
	int userid;//主动关注着id

	int beuserid;//被关注着id

	public Attention() {
		super();
	}

	public Attention(int gid, int userid, int beuserid) {
		super();
		this.gid = gid;
		this.userid = userid;
		this.beuserid = beuserid;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getBeuserid() {
		return beuserid;
	}

	public void setBeuserid(int beuserid) {
		this.beuserid = beuserid;
	}

	@Override
	public String toString() {
		return "Attention [gid=" + gid + ", userid=" + userid + ", beuserid=" + beuserid + "]";
	}
}
