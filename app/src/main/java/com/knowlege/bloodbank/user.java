package com.knowlege.bloodbank;

import android.content.Context;
import android.content.Intent;

public class user {

    private  String email,pass,conforpass,mobno,address,do_you_donate_in_last_6_month,bloodgroup,state,city,fullname;

    public user() {
    }

    public user(String email1, String pass1, String conpass1, String adress1, String finalFlag, String blodgroup1, String mobno1, String state1, String city1, String fullname1)
    { this.email=email1;
     this.pass=pass1;
     this.conforpass=conpass1;
     this.fullname=fullname1;
     this.mobno=mobno1;
     this.state=state1;
     this.city=city1;
     this.address=adress1;
     this.bloodgroup=blodgroup1;
     this.do_you_donate_in_last_6_month=finalFlag;

    }
    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String fullname1)
    {
        this.fullname=fullname1;
    }


    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email1)
    {
        this.email=email1;
    }


    public String getPass()
    {
        return pass;
    }

    public void setPass(String pass1)
    {
        this.pass=pass1;
    }

    public  String getConforpass()
    {
        return conforpass;
    }
    public void setConforpass(String conforpass1)
    {
        this.conforpass=conforpass1;
    }


    public String getMobno()
    {
        return mobno;
    }
    public void setMobno(String mobno1)
    {
        this.mobno=mobno1;
    }

    public String getState()
    {
        return  state;
    }
    public void setState(String state1)
    {
        this.state=state1;
    }

    public String getCity()
    {
        return city;
    }
    public  void setCity(String city1)
    {
        this.city=city1;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address1)
    {
        this.address=address1;
    }

    public String getFlag()
    {
        return do_you_donate_in_last_6_month;
    }
    public void setFlag(String flag1)
    {
        this.do_you_donate_in_last_6_month=flag1;
    }

    public String getBloodgroup()
    {
        return bloodgroup;
    }
    public void setBloodgroup(String bloodgroup1)
    {
        this.bloodgroup=bloodgroup1;
    }
}
