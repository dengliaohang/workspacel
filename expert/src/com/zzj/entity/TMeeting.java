package com.zzj.entity;

public class TMeeting {
    private Integer id;

    private String name;

    private String image;

    private String unit;

    private String depart;

    private String major;

    private String title;

    private String email;

    private String phone;

    private Integer sex;

    private String trafficnum;

    private Boolean ispick;

    private Integer isstay;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTrafficnum() {
        return trafficnum;
    }

    public void setTrafficnum(String trafficnum) {
        this.trafficnum = trafficnum == null ? null : trafficnum.trim();
    }

    public Boolean getIspick() {
        return ispick;
    }

    public void setIspick(Boolean ispick) {
        this.ispick = ispick;
    }

    public Integer getIsstay() {
        return isstay;
    }

    public void setIsstay(Integer isstay) {
        this.isstay = isstay;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}