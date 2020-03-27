package com.liang.bean;

public class Article {
    private Integer fid;//帖子id

    private String titles;

    private String fcontent;//帖子内容

    private String photo;

    private Integer bid;//所属板块id

    private String time;

    private Integer userid;

    private Integer status;//帖子审核状态(0为待审核，1为通过审核，2为未通过审核，默认为0)

    /* 附加 */
    private String sum;

    private String userphoto;

    private String username;

    private String bname;

    public Article() {
        super();
    }

    public Article(Article2 article2,String photo) {
        super();
        this.fid = article2.getFid();
        this.titles = article2.getTitles();
        this.fcontent = article2.getFcontent();
        this.bid = article2.getBid();
        this.time = article2.getTime();
        this.userid = article2.getUserid();
        this.status = article2.getStatus();
        this.photo = photo;
    }

    public Article(Integer fid, String titles, String fcontent, String photo, Integer bid, String time, Integer userid, Integer status, String sum, String userphoto, String username, String bname) {
        this.fid = fid;
        this.titles = titles;
        this.fcontent = fcontent;
        this.photo = photo;
        this.bid = bid;
        this.time = time;
        this.userid = userid;
        this.status = status;
        this.sum = sum;
        this.userphoto = userphoto;
        this.username = username;
        this.bname = bname;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles == null ? null : titles.trim();
    }

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent == null ? null : fcontent.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time.substring(0,time.length()-2);
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getUserphoto() {
        return userphoto;
    }

    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto;
    }

    @Override
    public String toString() {
        return "Article{" +
                "fid=" + fid +
                ", titles='" + titles + '\'' +
                ", fcontent='" + fcontent + '\'' +
                ", photo='" + photo + '\'' +
                ", bid=" + bid +
                ", time='" + time + '\'' +
                ", userid=" + userid +
                ", status=" + status +
                ", sum='" + sum + '\'' +
                ", userphoto='" + userphoto + '\'' +
                ", username='" + username + '\'' +
                ", bname='" + bname + '\'' +
                '}';
    }
}