package com.zzj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TService {
    private String id;

    private String expertid;

    private String areaid;

    private String regionid;

    private String name;

    private String description;

    private BigDecimal price;

    private Integer state;

    private Date publishday;

    private Boolean isbargain;

    private Integer type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getExpertid() {
        return expertid;
    }

    public void setExpertid(String expertid) {
        this.expertid = expertid == null ? null : expertid.trim();
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getPublishday() {
        return publishday;
    }

    public void setPublishday(Date publishday) {
        this.publishday = publishday;
    }

    public Boolean getIsbargain() {
        return isbargain;
    }

    public void setIsbargain(Boolean isbargain) {
        this.isbargain = isbargain;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}