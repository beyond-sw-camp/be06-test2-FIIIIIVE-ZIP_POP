package com.fiiiiive.zippop.board.model;

public class BoardReadRes {
    private String post_title;

    private String customer_idx;
    private String post_idx;
    private String post_content;

    public BoardReadRes() {
    }

    public BoardReadRes(String post_title, String customer_idx, String post_idx, String post_content) {
        this.post_title = post_title;
        this.customer_idx = customer_idx;
        this.post_idx = post_idx;
        this.post_content = post_content;
    }

    public String getCustomer_idx() {
        return customer_idx;
    }

    public void setCustomer_idx(String customer_idx) {
        this.customer_idx = customer_idx;
    }

    public String getPost_idx() {
        return post_idx;
    }

    public void setPost_idx(String post_idx) {
        this.post_idx = post_idx;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }





}

