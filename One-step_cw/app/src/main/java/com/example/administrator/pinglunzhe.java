package com.example.administrator;

public class pinglunzhe {
    private String pinglunname;
    private String pingluncomment;
    private int pinglunid;
    public pinglunzhe(String pinglunname,String pingluncomment,int pinglunid){
        this.pinglunname=pinglunname;
        this.pingluncomment=pingluncomment;
        this.pinglunid=pinglunid;
    }
    public String getPinglunname(){
        return pinglunname;
    }
    public String getPingluncomment(){
        return pingluncomment;
    }
    public int getPinglunid(){
        return pinglunid;
    }
}
