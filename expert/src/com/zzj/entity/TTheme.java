package com.zzj.entity;

import java.util.Date;

public class TTheme {
    private String id;

    private String name;

    private String image;

    private String title;

    private String sex;

    private String dockgroup;

    private Integer transtype;

    private String phone;

    private String email;

    private String adress;

    private String workplace;

    private Boolean isstay;

    private Integer isexpert;

    private Date pubtime;

    private String message;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDockgroup() {
        return dockgroup;
    }

    public void setDockgroup(String dockgroup) {
        this.dockgroup = dockgroup == null ? null : dockgroup.trim();
    }

    public Integer getTranstype() {
        return transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public Boolean getIsstay() {
        return isstay;
    }

    public void setIsstay(Boolean isstay) {
        this.isstay = isstay;
    }

    public Integer getIsexpert() {
        return isexpert;
    }

    public void setIsexpert(Integer isexpert) {
        this.isexpert = isexpert;
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}