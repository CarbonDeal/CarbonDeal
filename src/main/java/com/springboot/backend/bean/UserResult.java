package com.springboot.backend.bean;

public class UserResult {
    //返回信息
    private String msg;
    //数据是否正常请求
    private Boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public User getDetail() {
        return detail;
    }

    public void setDetail(User detail) {
        this.detail = detail;
    }

    //具体返回的数据
    private User detail;
}
