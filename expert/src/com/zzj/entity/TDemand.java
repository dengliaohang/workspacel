package com.zzj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TDemand {
    private String id;

    private String name;

    private String description;

    private String keyword;

    private BigDecimal price;

    private Integer paytype;

    private String publisher;

    private String areaid;

    private String regionid;

    private Date publishday;

    private Date lastday;

    private Boolean isspecial;

    private String expertid;

    private Integer state;

    private Integer visit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid == null ? null : regionid.trim();
    }

    public Date getPublishday() {
        return publishday;
    }

    public void setPublishday(Date publishday) {
        this.publishday = publishday;
    }

    public Date getLastday() {
        return lastday;
    }

    public void setLastday(Date lastday) {
        this.lastday = lastday;
    }

    public Boolean getIsspecial() {
        return isspecial;
    }

    public void setIsspecial(Boolean isspecial) {
        this.isspecial = isspecial;
    }

    public String getExpertid() {
        return expertid;
    }

    public void setExpertid(String expertid) {
        this.expertid = expertid == null ? null : expertid.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getVisit() {
        return visit;
    }

    public void setVisit(Integer visit) {
        this.visit = visit;
    }
}