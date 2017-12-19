package com.zzj.entity;

import java.util.Date;

public class TSystemMsg {
    private Integer id;

    private String from;

    private String to;

    private String content;

    private String fromgroup;

    private Integer friendgroup;

    private String remark;

    private Integer type;

    private Boolean isread;

    private Integer result;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getFromgroup() {
        return fromgroup;
    }

    public void setFromgroup(String fromgroup) {
        this.fromgroup = fromgroup == null ? null : fromgroup.trim();
    }

    public Integer getFriendgroup() {
        return friendgroup;
    }

    public void setFriendgroup(Integer friendgroup) {
        this.friendgroup = friendgroup;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getIsread() {
        return isread;
    }

    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}