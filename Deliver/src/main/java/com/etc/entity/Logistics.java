package com.etc.entity;

import java.util.Date;

public class Logistics {
    private Integer lid;

    private Integer deliveryid;

    private Date dltime;

    private String dladdress;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getDeliveryid() {
        return deliveryid;
    }

    public void setDeliveryid(Integer deliveryid) {
        this.deliveryid = deliveryid;
    }

    public Date getDltime() {
        return dltime;
    }

    public void setDltime(Date dltime) {
        this.dltime = dltime;
    }

    public String getDladdress() {
        return dladdress;
    }

    public void setDladdress(String dladdress) {
        this.dladdress = dladdress == null ? null : dladdress.trim();
    }
}