package com.fiiiiive.zippop.board.model;

public class BoardUpdateRes {
    private String post_title;

    private String post_content;

    public BoardUpdateRes() {
    }

    public BoardUpdateRes(String post_title,  String post_content) {
        this.post_title = post_title;
        this.post_content = post_content;
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

