package com.fiiiiive.zippop.popup_goods.model;

public class PopupGoodsSearchRes {
    String productName;
    int productPrice;
    String productContent;
    String productImage;
    int productAmount;
    int storeIdx;

    public PopupGoodsSearchRes() {}

    public PopupGoodsSearchRes(String productName, int productPrice, String productContent, int productAmount, String productImage, int storeIdx) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productContent = productContent;
        this.productAmount = productAmount;
        this.productImage = productImage;
        this.storeIdx = storeIdx;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStoreIdx() {
        return storeIdx;
    }

    public void setStoreIdx(int storeIdx) {
        this.storeIdx = storeIdx;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
