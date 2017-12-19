package com.zzj.entity;

import java.util.Date;

public class ConnectonidMatchUserid {
    private Integer id;

    private String userid;

    private String connectionid;

    private Date datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getConnectionid() {
        return connectionid;
    }

    public void setConnectionid(String connectionid) {
        this.connectionid = connectionid == null ? null : connectionid.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}