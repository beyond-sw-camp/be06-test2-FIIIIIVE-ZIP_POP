package com.fiiiiive.zippop.board;


import com.fiiiiive.zippop.board.model.BoardCreateReq;
import com.fiiiiive.zippop.board.model.BoardReadRes;
import com.fiiiiive.zippop.board.model.BoardUpdateRes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository {
    private JdbcTemplate jdbcTemplate;

    public BoardRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save(BoardCreateReq dto) {

        jdbcTemplate.update("INSERT INTO test.posts (post_title,post_content,customer_idx) VALUES(?,?,?)",
                dto.getPost_title(),
                dto.getPost_content(),
                dto.getCustomer_idx()
        );
    }

    public List<BoardReadRes> findAll() {
        List<BoardReadRes> boardReadRes = jdbcTemplate.query("SELECT * FROM test.posts",
                (rs, rownum) -> {
                    BoardReadRes response = new BoardReadRes(
                        rs.getString("post_title"),
                            rs.getString("post_content"),
                            rs.getString("post_idx"),
                            rs.getString("customer_idx")
                    );
                    return response;
                }

        );
        return boardReadRes;
    }


    public BoardReadRes findById(int idx) {
        BoardReadRes boardReadRes = jdbcTemplate.queryForObject("SELECT * FROM test.posts WHERE idx=?",
                (rs,rownum) -> {
                    BoardReadRes response = new BoardReadRes(
                            rs.getString("post_title"),
                            rs.getString("post_content"),
                            rs.getString("post_idx"),
                            rs.getString("customer_idx")
                    );
                    return response;
                },
                idx
        );

        return boardReadRes;
    } // 조회 db메서드

    public BoardUpdateRes updateById(int post_idx)
    {
        BoardCreateReq dto = new BoardCreateReq();
        jdbcTemplate.update("UPDATE test.posts SET post_title = ?, post_content = ? WHERE post_idx = ?",
                dto.getPost_title(),
                dto.getPost_content(),post_idx);
        return null;
    } // update db메서드


    public String deleteById(String post_idx) {

        jdbcTemplate.update("DELETE FROM test.posts WHERE post_idx =?",post_idx);

        return "삭제성공";
    }

}
