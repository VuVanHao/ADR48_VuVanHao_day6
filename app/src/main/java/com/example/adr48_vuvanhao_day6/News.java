package com.example.adr48_vuvanhao_day6;

public class News {
    private int imgAvatar,imgContent;
    private String name,time,content;
    private int like,cmt,share;

    public News() {
    }

    public News(int imgAvatar, String name, String time, String content, int imgContent, int like, int cmt, int share) {
        this.imgAvatar = imgAvatar;
        this.name = name;
        this.time = time;
        this.content = content;
        this.imgContent = imgContent;
        this.like = like;
        this.cmt = cmt;
        this.share = share;
    }

    public int getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(int imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImgContent() {
        return imgContent;
    }

    public void setImgContent(int imgContent) {
        this.imgContent = imgContent;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getCmt() {
        return cmt;
    }

    public void setCmt(int cmt) {
        this.cmt = cmt;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }
}
