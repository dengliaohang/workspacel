package com.zzj.entity;

import java.util.Date;

public class PayLog {
    private Integer id;

    private String acct;

    private String orderid;

    private String reqsn;

    private String trxcode;

    private String oldtrxid;

    private String trxid;

    private String chnltrxid;

    private String status;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct == null ? null : acct.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getReqsn() {
        return reqsn;
    }

    public void setReqsn(String reqsn) {
        this.reqsn = reqsn == null ? null : reqsn.trim();
    }

    public String getTrxcode() {
        return trxcode;
    }

    public void setTrxcode(String trxcode) {
        this.trxcode = trxcode == null ? null : trxcode.trim();
    }

    public String getOldtrxid() {
        return oldtrxid;
    }

    public void setOldtrxid(String oldtrxid) {
        this.oldtrxid = oldtrxid == null ? null : oldtrxid.trim();
    }

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid == null ? null : trxid.trim();
    }

    public String getChnltrxid() {
        return chnltrxid;
    }

    public void setChnltrxid(String chnltrxid) {
        this.chnltrxid = chnltrxid == null ? null : chnltrxid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}