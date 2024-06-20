package com.fiiiiive.zippop.popup_goods;

import com.fiiiiive.zippop.popup_goods.model.PopupGoodsRegisterReq;
import com.fiiiiive.zippop.popup_goods.model.PopupGoodsSearchRes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class PopupGoodsRepository {
    private JdbcTemplate jdbcTemplate;
    public PopupGoodsRepository(DataSource dataSource) { this.jdbcTemplate = new JdbcTemplate(dataSource); }

    public int register(PopupGoodsRegisterReq popupGoodsRegisterReq) {
        jdbcTemplate.update(
                "INSERT INTO test.popup_goods (product_name, product_price, product_content, product_image, product_amount, store_idx) VALUE (?, ?, ?, ?, ?, ?);",
                popupGoodsRegisterReq.getProduct_name(),
                popupGoodsRegisterReq.getProduct_price(),
                popupGoodsRegisterReq.getProduct_content(),
                popupGoodsRegisterReq.getProduct_image(),
                popupGoodsRegisterReq.getProduct_amount(),
                popupGoodsRegisterReq.getStore_idx());
        return 0;
    }

    public List<PopupGoodsSearchRes> searchAll() {
        List<PopupGoodsSearchRes> popupGoodsSearchResList = jdbcTemplate.query(
                "SELECT * FROM test.popup_goods;",
                (rs, rowNum) -> {
                    PopupGoodsSearchRes response = new PopupGoodsSearchRes(
                            rs.getString("product_name"),
                            rs.getInt("product_price"),
                            rs.getString("product_content"),
                            rs.getInt("product_amount"),
                            rs.getString("product_image"),
                            rs.getInt("store_idx")
                    );
                    return response;
                }
        );
        return popupGoodsSearchResList;
    }

    public PopupGoodsSearchRes findById(String product_idx) {
        PopupGoodsSearchRes popupGoodsSearchRes = jdbcTemplate.queryForObject(
                "SELECT * FROM test.popup_goods where product_idx = ?;",
                (rs, rowNum) -> {
                    PopupGoodsSearchRes response = new PopupGoodsSearchRes(
                            rs.getString("product_name"),
                            rs.getInt("product_price"),
                            rs.getString("product_content"),
                            rs.getInt("product_amount"),
                            rs.getString("product_image"),
                            rs.getInt("store_idx")
                    );
                    return response;
                },
                product_idx
        );
        return popupGoodsSearchRes;
    }

    public int deleteById(String product_idx) {
        jdbcTemplate.update("DELETE FROM test.popup_goods WHERE product_idx = ?", product_idx);
        return 0;
    }

    public int updateById(PopupGoodsRegisterReq popupGoodsRegisterReq, String product_idx){
        jdbcTemplate.update("UPDATE test.popup_goods SET product_name = ?, product_price = ?, product_content = ?, product_image = ?, product_amount = ?, store_idx = ? WHERE product_idx = ?",
                popupGoodsRegisterReq.getProduct_name(),
                popupGoodsRegisterReq.getProduct_price(),
                popupGoodsRegisterReq.getProduct_content(),
                popupGoodsRegisterReq.getProduct_image(),
                popupGoodsRegisterReq.getProduct_amount(),
                popupGoodsRegisterReq.getStore_idx(),
                product_idx
        );
        return 0;
    }
}