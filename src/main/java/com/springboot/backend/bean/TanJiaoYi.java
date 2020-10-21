package com.springboot.backend.bean;

import java.util.Date;

public class TanJiaoYi {
    private String title;
    private String href;
    private String from;
    private Date time;
    private  String info;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Date getTime() {
        return time;
    }

    public String getFrom() {
        return from;
    }

    public String getHref() {
        return href;
    }

    public String getInfo() {
        return info;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
