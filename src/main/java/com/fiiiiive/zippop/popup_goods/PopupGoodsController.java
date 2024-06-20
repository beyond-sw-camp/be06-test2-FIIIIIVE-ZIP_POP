package com.fiiiiive.zippop.popup_goods;

import com.fiiiiive.zippop.config.BaseResponse;
import com.fiiiiive.zippop.popup_goods.model.PopupGoodsRegisterReq;
import com.fiiiiive.zippop.popup_goods.model.PopupGoodsSearchRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/popup_goods")
public class PopupGoodsController {
    private PopupGoodsService popupGoodsService;
    public PopupGoodsController(PopupGoodsService popupGoodsService){this.popupGoodsService = popupGoodsService; }

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public ResponseEntity<BaseResponse> register(@RequestBody PopupGoodsRegisterReq popupGoodsRegisterReq) {
        BaseResponse baseResponse = popupGoodsService.register(popupGoodsRegisterReq);
        return ResponseEntity.ok(baseResponse);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/searchAll")
    public ResponseEntity<List<PopupGoodsSearchRes>> searchAll() {
        List<PopupGoodsSearchRes> popupGoodsSearchResList = popupGoodsService.searchAll();
        return ResponseEntity.ok(popupGoodsSearchResList);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public ResponseEntity<PopupGoodsSearchRes> read(@RequestParam("product_idx") String product_idx) {
        PopupGoodsSearchRes popupGoodsSearchRes = popupGoodsService.search(product_idx);
        return ResponseEntity.ok(popupGoodsSearchRes);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    public  ResponseEntity<BaseResponse> delete(@RequestParam("product_idx") String product_idx) {
        BaseResponse baseResponse  = popupGoodsService.delete(product_idx);
        return ResponseEntity.ok(baseResponse);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/update")
    public  ResponseEntity<BaseResponse> update(@RequestParam("product_idx") String product_idx, @RequestBody PopupGoodsRegisterReq popupGoodsRegisterReq) {
        BaseResponse baseResponse = popupGoodsService.updateById(popupGoodsRegisterReq, product_idx);
        return ResponseEntity.ok(baseResponse);
    }
}
