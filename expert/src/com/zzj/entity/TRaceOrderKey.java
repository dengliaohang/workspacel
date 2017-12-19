package com.zzj.entity;

public class TRaceOrderKey {
    private String expertid;

    private String demandid;

    public String getExpertid() {
        return expertid;
    }

    public void setExpertid(String expertid) {
        this.expertid = expertid == null ? null : expertid.trim();
    }

    public String getDemandid() {
        return demandid;
    }

    public void setDemandid(String demandid) {
        this.demandid = demandid == null ? null : demandid.trim();
    }
}