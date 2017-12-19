package com.zzj.entity;

public class TUserInfo {
    private String id;

    private String username;

    private Integer usergrade;

    private Integer taskgrade;

    private String image;

    private String regionid;

    private String sign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUsergrade() {
        return usergrade;
    }

    public void setUsergrade(Integer usergrade) {
        this.usergrade = usergrade;
    }

    public Integer getTaskgrade() {
        return taskgrade;
    }

    public void setTaskgrade(Integer taskgrade) {
        this.taskgrade = taskgrade;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid == null ? null : regionid.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }
}