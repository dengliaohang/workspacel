package com.zzj.entity;

import java.util.Date;

public class TRaceOrder extends TRaceOrderKey {
    private String message;

    private Date racetime;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getRacetime() {
        return racetime;
    }

    public void setRacetime(Date racetime) {
        this.racetime = racetime;
    }
}