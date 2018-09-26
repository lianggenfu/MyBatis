package com.etc.entity;

public class Orders {
    private Integer deliveryid;

    private Integer userid;

    private String sendname;

    private String sendadd;

    private String senddetailadd;

    private String sendphone;

    private String sendpostcode;

    private String acceptname;

    private String acceptadd;

    private String acceptdetailadd;

    private String acceptphone;

    private String acceptpostcode;

    private String isinsurance;

    private Integer insuranceprice;

    private Integer payment;

    private double money;

    private Float weight;

    private String type;

    private Integer status;

    private Integer transportation;

    public Integer getDeliveryid() {
        return deliveryid;
    }

    public void setDeliveryid(Integer deliveryid) {
        this.deliveryid = deliveryid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname == null ? null : sendname.trim();
    }

    public String getSendadd() {
        return sendadd;
    }

    public void setSendadd(String sendadd) {
        this.sendadd = sendadd == null ? null : sendadd.trim();
    }

    public String getSenddetailadd() {
        return senddetailadd;
    }

    public void setSenddetailadd(String senddetailadd) {
        this.senddetailadd = senddetailadd == null ? null : senddetailadd.trim();
    }

    public String getSendphone() {
        return sendphone;
    }

    public void setSendphone(String sendphone) {
        this.sendphone = sendphone == null ? null : sendphone.trim();
    }

    public String getSendpostcode() {
        return sendpostcode;
    }

    public void setSendpostcode(String sendpostcode) {
        this.sendpostcode = sendpostcode == null ? null : sendpostcode.trim();
    }

    public String getAcceptname() {
        return acceptname;
    }

    public void setAcceptname(String acceptname) {
        this.acceptname = acceptname == null ? null : acceptname.trim();
    }

    public String getAcceptadd() {
        return acceptadd;
    }

    public void setAcceptadd(String acceptadd) {
        this.acceptadd = acceptadd == null ? null : acceptadd.trim();
    }

    public String getAcceptdetailadd() {
        return acceptdetailadd;
    }

    public void setAcceptdetailadd(String acceptdetailadd) {
        this.acceptdetailadd = acceptdetailadd == null ? null : acceptdetailadd.trim();
    }

    public String getAcceptphone() {
        return acceptphone;
    }

    public void setAcceptphone(String acceptphone) {
        this.acceptphone = acceptphone == null ? null : acceptphone.trim();
    }

    public String getAcceptpostcode() {
        return acceptpostcode;
    }

    public void setAcceptpostcode(String acceptpostcode) {
        this.acceptpostcode = acceptpostcode == null ? null : acceptpostcode.trim();
    }

    public String getIsinsurance() {
        return isinsurance;
    }

    public void setIsinsurance(String isinsurance) {
        this.isinsurance = isinsurance == null ? null : isinsurance.trim();
    }

    public Integer getInsuranceprice() {
        return insuranceprice;
    }

    public void setInsuranceprice(Integer insuranceprice) {
        this.insuranceprice = insuranceprice;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTransportation() {
        return transportation;
    }

    public void setTransportation(Integer transportation) {
        this.transportation = transportation;
    }
}