package com.zzj.entity;

public class TFirmInfo {
    private String id;

    private String firmname;

    private Integer firmgrade;

    private Integer taskgrade;

    private String description;

    private String honor;

    private String business;

    private String image;

    private String areaid;

    private String regionid;

    private Boolean isguest;

    private Boolean isdisable;

    private String sign;

    private Boolean isvip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFirmname() {
        return firmname;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname == null ? null : firmname.trim();
    }

    public Integer getFirmgrade() {
        return firmgrade;
    }

    public void setFirmgrade(Integer firmgrade) {
        this.firmgrade = firmgrade;
    }

    public Integer getTaskgrade() {
        return taskgrade;
    }

    public void setTaskgrade(Integer taskgrade) {
        this.taskgrade = taskgrade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor == null ? null : honor.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
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

    public Boolean getIsguest() {
        return isguest;
    }

    public void setIsguest(Boolean isguest) {
        this.isguest = isguest;
    }

    public Boolean getIsdisable() {
        return isdisable;
    }

    public void setIsdisable(Boolean isdisable) {
        this.isdisable = isdisable;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Boolean getIsvip() {
        return isvip;
    }

    public void setIsvip(Boolean isvip) {
        this.isvip = isvip;
    }
}