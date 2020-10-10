package com.springboot.backend.bean;
import java.util.Date;
public class user {
    private char housetext;
    private  char subTypeName;
    private  Date indate;
    private  double open;

    private double high;
    private  double low;
    private double average;
    private double close;
    private double deal;
    private double dealamount;
    private int dealnum;
    private char dataid;

    public char getHousetext() {
        return housetext;
    }

    public void setHousetext(char housetext) {
        this.housetext = housetext;
    }

    public char getSubTypeName() {
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

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getDeal() {
        return deal;
    }

    public void setDeal(double deal) {
        this.deal = deal;
    }

    public double getDealamount() {
        return dealamount;
    }

    public void setDealamount(double dealamount) {
        this.dealamount = dealamount;
    }

    public int getDealnum() {
        return dealnum;
    }

    public void setDealnum(int dealnum) {
        this.dealnum = dealnum;
    }

    public char getDataid() {
        return dataid;
    }

    public void setDataid(char dataid) {
        this.dataid = dataid;
    }



}
