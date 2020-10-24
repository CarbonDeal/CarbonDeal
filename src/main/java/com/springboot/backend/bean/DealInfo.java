package com.springboot.backend.bean;
import java.util.Date;
public class DealInfo {
    private String housetext;
    private  String subTypeName;
    private  Date indate;
    private  Double open;

    private Double high;
    private  Double low;
    private Double average;
    private Double close;
    private Double deal;
    private Double dealamount;
    private Integer dealnum;
    private String dataid;
    public String getHousetext() {
        return housetext;
    }

    public void setHousetext(String housetext) {
        this.housetext = housetext;
    }

    public String getSubTypeName() {
        return subTypeName;
    }

    public void setSubTypeName() {
        this.subTypeName = subTypeName;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getDeal() {
        return deal;
    }

    public void setDeal(Double deal) {
        this.deal = deal;
    }

    public Double getDealamount() {
        return dealamount;
    }

    public void setDealamount(Double dealamount) {
        this.dealamount = dealamount;
    }

    public int getDealnum() {
        return dealnum;
    }

    public void setDealnum(Integer dealnum) {
        this.dealnum = dealnum;
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }



}
