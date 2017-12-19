package com.zzj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TExpert {
    private String id;

    private String realname;

    private Date birthday;

    private String locationid;

    private String areaid;

    private String keyword;

    private String research;

    private String introduction;

    private String result;

    private String image;

    private String title;

    private Integer taskgrade;

    private Integer honorgrade;

    private Integer taskcount;

    private Integer visit;

    private Integer identifier;

    private Boolean isident;

    private Boolean isguest;

    private BigDecimal security;

    private Boolean isorder;

    private Date backday;

    private Boolean isdisable;

    private Integer teamorder;

    private String sign;

    private Boolean istop;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research == null ? null : research.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTaskgrade() {
        return taskgrade;
    }

    public void setTaskgrade(Integer taskgrade) {
        this.taskgrade = taskgrade;
    }

    public Integer getHonorgrade() {
        return honorgrade;
    }

    public void setHonorgrade(Integer honorgrade) {
        this.honorgrade = honorgrade;
    }

    public Integer getTaskcount() {
        return taskcount;
    }

    public void setTaskcount(Integer taskcount) {
        this.taskcount = taskcount;
    }

    public Integer getVisit() {
        return visit;
    }

    public void setVisit(Integer visit) {
        this.visit = visit;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public Boolean getIsident() {
        return isident;
    }

    public void setIsident(Boolean isident) {
        this.isident = isident;
    }

    public Boolean getIsguest() {
        return isguest;
    }

    public void setIsguest(Boolean isguest) {
        this.isguest = isguest;
    }

    public BigDecimal getSecurity() {
        return security;
    }

    public void setSecurity(BigDecimal security) {
        this.security = security;
    }

    public Boolean getIsorder() {
        return isorder;
    }

    public void setIsorder(Boolean isorder) {
        this.isorder = isorder;
    }

    public Date getBackday() {
        return backday;
    }

    public void setBackday(Date backday) {
        this.backday = backday;
    }

    public Boolean getIsdisable() {
        return isdisable;
    }

    public void setIsdisable(Boolean isdisable) {
        this.isdisable = isdisable;
    }

    public Integer getTeamorder() {
        return teamorder;
    }

    public void setTeamorder(Integer teamorder) {
        this.teamorder = teamorder;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Boolean getIstop() {
        return istop;
    }

    public void setIstop(Boolean istop) {
        this.istop = istop;
    }
}