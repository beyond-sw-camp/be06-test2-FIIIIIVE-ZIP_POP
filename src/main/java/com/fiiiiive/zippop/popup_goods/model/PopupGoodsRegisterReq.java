package com.fiiiiive.zippop.popup_goods.model;

public class PopupGoodsRegisterReq {
    String product_name;
    int product_price;
    String product_content;
    String product_image;
    int product_amount;
    int store_idx;

    public PopupGoodsRegisterReq(String product_name, int store_idx, int product_amount, String product_image, String product_content, int product_price) {
        this.product_name = product_name;
        this.store_idx = store_idx;
        this.product_amount = product_amount;
        this.product_image = product_image;
        this.product_content = product_content;
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_content() {
        return product_content;
    }

    public void setProduct_content(String product_content) {
        this.product_content = product_content;
    }

    public int getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(int product_amount) {
        this.product_amount = product_amount;
    }

    public int getStore_idx() {
        return store_idx;
    }

    public void setStore_idx(int store_idx) {
        this.store_idx = store_idx;
    }
}
