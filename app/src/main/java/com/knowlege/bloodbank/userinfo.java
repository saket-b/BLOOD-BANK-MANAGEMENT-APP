package com.knowlege.bloodbank;

public class userinfo {
    private String fullname;
    private  String mobno;



    public userinfo()
    {

    }

    public userinfo(String fullname,String mobno) {
        this.fullname = fullname;
        this.mobno=mobno;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }
}
