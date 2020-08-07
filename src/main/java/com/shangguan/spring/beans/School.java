package com.shangguan.spring.beans;

import java.io.Serializable;

public class School implements Serializable {
    private Integer sid;

    private String saddress;

    private String sdescription;

    private String sname;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", saddress=").append(saddress);
        sb.append(", sdescription=").append(sdescription);
        sb.append(", sname=").append(sname);
        sb.append("]");
        return sb.toString();
    }
}