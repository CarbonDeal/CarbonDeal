package com.springboot.backend.bean;

public class LineChart {
    private String  city;
    private Double deal;
    private Integer dealnum;

    public Integer getDealnum() {
        return dealnum;
    }

    public void setDealnum(Integer dealnum) {
        this.dealnum = dealnum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getDeal() {
        return deal;
    }

    public void setDeal(Double deal) {
        this.deal = deal;
    }
}
