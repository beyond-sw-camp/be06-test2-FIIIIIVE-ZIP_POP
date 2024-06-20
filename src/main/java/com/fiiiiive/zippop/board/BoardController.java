package com.fiiiiive.zippop.board;


import com.fiiiiive.zippop.board.model.BoardCreateReq;
import com.fiiiiive.zippop.board.model.BoardCreateRes;
import com.fiiiiive.zippop.board.model.BoardReadRes;
import com.fiiiiive.zippop.board.model.BoardUpdateRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ResponseEntity<BoardCreateRes> create(@RequestBody BoardCreateReq dto){
        BoardCreateRes response = boardService.create(dto);
        return ResponseEntity.ok(response);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/read")
    public ResponseEntity<BoardReadRes> read(int idx){
        BoardReadRes response = boardService.read(idx);
        return ResponseEntity.ok(response);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/readall")
    public ResponseEntity<List<BoardReadRes>> readAll(){
        List<BoardReadRes> response = boardService.readAll();
        return ResponseEntity.ok(response);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update")
    public ResponseEntity<String> update(@RequestParam("idx") int idx){
        String response = boardService.update(idx);
        return ResponseEntity.ok(response);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete")
    public ResponseEntity<String> delete(@RequestParam("idx")String idx){
        String response = boardService.delete(idx);
        return ResponseEntity.ok(response);
    }


}
