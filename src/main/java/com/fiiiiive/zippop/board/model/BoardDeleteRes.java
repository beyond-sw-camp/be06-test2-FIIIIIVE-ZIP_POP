package com.fiiiiive.zippop.board.model;

public class BoardDeleteRes {
    int post_idx;

    public BoardDeleteRes() {
    }

    public BoardDeleteRes(int post_idx) {
        this.post_idx = post_idx;
    }

    public int getPost_idx() {
        return post_idx;
    }

    public void setPost_idx(int post_idx) {
        this.post_idx = post_idx;
    }
}
