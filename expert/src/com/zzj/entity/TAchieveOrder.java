package com.zzj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TAchieveOrder {
    private String id;

    private String achieveid;

    private String name;

    private String creater;

    private String buyer;

    private Integer buycount;

    private String cancelreason;

    private Date canceldate;

    private BigDecimal unitprice;

    private BigDecimal totalprice;

    private Integer transfertype;

    private Date buyday;

    private Date payday;

    private Boolean issent;

    private Date sendday;

    private Boolean isloan;

    private Date loanday;

    private Integer satisfy;

    private Integer state;

    private Integer evalevel;

    private Integer refund;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAchieveid() {
        return achieveid;
    }

    public void setAchieveid(String achieveid) {
        this.achieveid = achieveid == null ? null : achieveid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public Integer getBuycount() {
        return buycount;
    }

    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }

    public String getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason == null ? null : cancelreason.trim();
    }

    public Date getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getTransfertype() {
        return transfertype;
    }

    public void setTransfertype(Integer transfertype) {
        this.transfertype = transfertype;
    }

    public Date getBuyday() {
        return buyday;
    }

    public void setBuyday(Date buyday) {
        this.buyday = buyday;
    }

    public Date getPayday() {
        return payday;
    }

    public void setPayday(Date payday) {
        this.payday = payday;
    }

    public Boolean getIssent() {
        return issent;
    }

    public void setIssent(Boolean issent) {
        this.issent = issent;
    }

    public Date getSendday() {
        return sendday;
    }

    public void setSendday(Date sendday) {
        this.sendday = sendday;
    }

    public Boolean getIsloan() {
        return isloan;
    }

    public void setIsloan(Boolean isloan) {
        this.isloan = isloan;
    }

    public Date getLoanday() {
        return loanday;
    }

    public void setLoanday(Date loanday) {
        this.loanday = loanday;
    }

    public Integer getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(Integer satisfy) {
        this.satisfy = satisfy;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getEvalevel() {
        return evalevel;
    }

    public void setEvalevel(Integer evalevel) {
        this.evalevel = evalevel;
    }

    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }
}