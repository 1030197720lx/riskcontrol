package com.example.riskcontrol.model;

public class RegisterEvent extends Event{
    public final static String MOBILE = "mobile";

    public final static String FLAG = "flag";

    private String mobile;

    private String flag;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
