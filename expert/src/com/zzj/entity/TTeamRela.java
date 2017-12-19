package com.zzj.entity;

import java.util.Date;

public class TTeamRela {
    private String expertid;

    private String teamid;

    private String teampost;

    private Integer teamrole;

    private Date joinday;

    public String getExpertid() {
        return expertid;
    }

    public void setExpertid(String expertid) {
        this.expertid = expertid == null ? null : expertid.trim();
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid == null ? null : teamid.trim();
    }

    public String getTeampost() {
        return teampost;
    }

    public void setTeampost(String teampost) {
        this.teampost = teampost == null ? null : teampost.trim();
    }

    public Integer getTeamrole() {
        return teamrole;
    }

    public void setTeamrole(Integer teamrole) {
        this.teamrole = teamrole;
    }

    public Date getJoinday() {
        return joinday;
    }

    public void setJoinday(Date joinday) {
        this.joinday = joinday;
    }
}