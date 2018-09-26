package com.etc.entity;

public class Price {
    private Integer priceid;

    private String startadd;

    private String endadd;

    private Double firstkgprice;

    private Double perkgprice;

    public Integer getPriceid() {
        return priceid;
    }

    public void setPriceid(Integer priceid) {
        this.priceid = priceid;
    }

    public String getStartadd() {
        return startadd;
    }

    public void setStartadd(String startadd) {
        this.startadd = startadd == null ? null : startadd.trim();
    }

    public String getEndadd() {
        return endadd;
    }

    public void setEndadd(String endadd) {
        this.endadd = endadd == null ? null : endadd.trim();
    }

    public Double getFirstkgprice() {
        return firstkgprice;
    }

    public void setFirstkgprice(Double firstkgprice) {
        this.firstkgprice = firstkgprice;
    }

    public Double getPerkgprice() {
        return perkgprice;
    }

    public void setPerkgprice(Double perkgprice) {
        this.perkgprice = perkgprice;
    }
}