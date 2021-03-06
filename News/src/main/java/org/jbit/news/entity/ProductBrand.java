package org.jbit.news.entity;

import java.util.Date;

public class ProductBrand {
    private int nid;
    private String brand;
    private int brandparent_id;
    private String summary;
    private int sort_id;
    private String operator;
    private String operate_time;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBrandparent_id() {
        return brandparent_id;
    }

    public void setBrandparent_id(int brandparent_id) {
        this.brandparent_id = brandparent_id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getSort_id() {
        return sort_id;
    }

    public void setSort_id(int sort_id) {
        this.sort_id = sort_id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperate_time() {
        return operate_time;
    }

    public void setOperate_time(String operate_time) {
        this.operate_time = operate_time;
    }
}
