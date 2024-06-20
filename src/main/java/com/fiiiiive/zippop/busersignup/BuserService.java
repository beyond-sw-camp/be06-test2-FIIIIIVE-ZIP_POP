package com.fiiiiive.zippop.busersignup;

import com.fiiiiive.zippop.busersignup.model.BuserSignupReq;
import com.fiiiiive.zippop.busersignup.model.BuserSignupRes;
import org.springframework.stereotype.Service;

@Service
public class BuserService {
    private BuserRepository buserRepository;

    public BuserService(BuserRepository buserRepository) {this.buserRepository = buserRepository;}

    public BuserSignupRes signup(BuserSignupReq dto) {
        buserRepository.save(dto);

        return new BuserSignupRes(dto.getCompany_name()+"님 가입이 완료되었습니다.");
    }
}