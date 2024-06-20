package com.fiiiiive.zippop.cusersignup;

import com.fiiiiive.zippop.cusersignup.model.CuserSignupCreateReq;
import com.fiiiiive.zippop.cusersignup.model.CuserSignupCreateRes;
import org.springframework.stereotype.Service;

@Service
public class CuserSignupService {
    private CuserSignupRepository cuserSignupRepository;

    public CuserSignupService(CuserSignupRepository getCuserSignupRepository) {
        this.cuserSignupRepository = getCuserSignupRepository;
    }

    public CuserSignupCreateRes create(CuserSignupCreateReq dto) {
        cuserSignupRepository.save(dto);
        return new CuserSignupCreateRes(dto.getCustomer_id() + "님 가입이 완료되었습니다.");
    }
}
