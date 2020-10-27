package com.springboot.backend.bean;

public class LineChart {
    private String  indate;
    private Double deal;
    private Integer dealnum;

    public Integer getDealnum() {
        return dealnum;
    }

    public void setDealnum(Integer dealnum) {
        this.dealnum = dealnum;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public Double getDeal() {
        return deal;
    }

    public void setDeal(Double deal) {
        this.deal = deal;
    }
    @Override
    public String toString() {
        return "{" +
                "indate='" + indate + '\'' +
                ", deal='" + deal + '\'' +
                ", dealnum='" + dealnum + '\'' +
                '}';
    }
}
