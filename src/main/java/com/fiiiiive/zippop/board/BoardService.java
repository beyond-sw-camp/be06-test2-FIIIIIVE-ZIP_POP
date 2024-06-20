package com.fiiiiive.zippop.board;

import com.fiiiiive.zippop.board.model.*;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BoardService {
    private com.fiiiiive.zippop.board.BoardRepository boardRepository;

    public BoardService(com.fiiiiive.zippop.board.BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public BoardCreateRes create(BoardCreateReq dto) {
        // 처리
        // DB에 저장
        boardRepository.save(dto);

        return new BoardCreateRes(dto.getPost_title(),dto.getPost_content()+"등록됨");
    }

    public BoardReadRes read(int idx) {

        BoardReadRes boardReadRes = boardRepository.findById(idx);
        return boardReadRes;
    }
    public List<BoardReadRes> readAll() {

        List<BoardReadRes> boardReadRes = boardRepository.findAll();

        return boardReadRes;
    }
    public String update(int idx){

        BoardUpdateRes boardUpdateRes = boardRepository.updateById(idx);
        return idx + "수정완료";
    }


    public String delete(String idx) {

        String result = boardRepository.deleteById(idx);
        return idx + "삭제";
    }
}
