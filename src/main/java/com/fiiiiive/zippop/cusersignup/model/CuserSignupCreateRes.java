package com.fiiiiive.zippop.cusersignup.model;

public class CuserSignupCreateRes {
    private String customer_id;

    public CuserSignupCreateRes() {
    }

    public CuserSignupCreateRes(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}
