package com.fiiiiive.zippop.cusersignup.model;

public class CuserSignupCreateReq {
    private String customer_id;
    private String customer_name;
    private String customer_passwd;
    private String customer_addr;
    private String customer_phone;
    private String customer_e_mail;
    private int customer_point;
    private int cancel_waiting_num;

    public CuserSignupCreateReq(String customer_id, String customer_name, String customer_passwd, String customer_addr, String customer_phone, String customer_e_mail, int customer_point, int cancel_waiting_num) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_passwd = customer_passwd;
        this.customer_addr = customer_addr;
        this.customer_phone = customer_phone;
        this.customer_e_mail = customer_e_mail;
        this.customer_point = customer_point;
        this.cancel_waiting_num = cancel_waiting_num;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_passwd() {
        return customer_passwd;
    }

    public String getCustomer_addr() {
        return customer_addr;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public String getCustomer_e_mail() {
        return customer_e_mail;
    }

    public int getCustomer_point() {
        return customer_point;
    }

    public int getCancel_waiting_num() {
        return cancel_waiting_num;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCustomer_passwd(String customer_passwd) {
        this.customer_passwd = customer_passwd;
    }

    public void setCustomer_addr(String customer_addr) {
        this.customer_addr = customer_addr;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public void setCustomer_e_mail(String customer_e_mail) {
        this.customer_e_mail = customer_e_mail;
    }

    public void setCustomer_point(int customer_point) {
        this.customer_point = customer_point;
    }

    public void setCancel_waiting_num(int cancel_waiting_num) {
        this.cancel_waiting_num = cancel_waiting_num;
    }
}
