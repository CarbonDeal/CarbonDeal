package com.springboot.backend.bean;

public class DealNum {
    private Integer value;
    private String city;
    private Double rate;
    public String getCity() {
        return city;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
