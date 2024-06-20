package com.fiiiiive.zippop.popup_goods;

import com.fiiiiive.zippop.config.BaseResponse;
import com.fiiiiive.zippop.config.BaseResponseMessage;
import com.fiiiiive.zippop.popup_goods.model.PopupGoodsRegisterReq;
import com.fiiiiive.zippop.popup_goods.model.PopupGoodsSearchRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopupGoodsService {
    @Autowired
    private PopupGoodsRepository popupGoodsRepository;

    public BaseResponse register(PopupGoodsRegisterReq popupGoodsRegisterReq) {
        int result = popupGoodsRepository.register(popupGoodsRegisterReq);
        if(result == 0){ return new BaseResponse(BaseResponseMessage.POPUP_GOODS_REGISTER_SUCCESS); }
        else { return new BaseResponse(BaseResponseMessage.POPUP_GOODS_REGISTER_FAIL); }
    }

    public List<PopupGoodsSearchRes> searchAll(){
        List<PopupGoodsSearchRes> popupGoodsSearchResList = popupGoodsRepository.searchAll();
        return popupGoodsSearchResList;
    }

    public PopupGoodsSearchRes search(String product_idx){
        PopupGoodsSearchRes popupGoodsSearchRes = popupGoodsRepository.findById(product_idx);
        return popupGoodsSearchRes;
    }

    public BaseResponse delete(String idx){
        int result = popupGoodsRepository.deleteById(idx);
        if(result == 0){ return new BaseResponse(BaseResponseMessage.POPUP_GOODS_DELETE_SUCCESS); }
        else { return new BaseResponse(BaseResponseMessage.POPUP_GOODS_DELETE_FAIL); }
    }

    public BaseResponse updateById(PopupGoodsRegisterReq popupGoodsRegisterReq, String title){
        int result = popupGoodsRepository.updateById(popupGoodsRegisterReq, title);
        if(result == 0){ return new BaseResponse(BaseResponseMessage.POPUP_GOODS_UPDATE_SUCCESS); }
        else { return new BaseResponse(BaseResponseMessage.POPUP_GOODS_UPDATE_FAIL); }
    }
}
