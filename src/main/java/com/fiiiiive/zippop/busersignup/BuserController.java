package com.fiiiiive.zippop.busersignup;

import com.fiiiiive.zippop.busersignup.model.BuserSignupReq;
import com.fiiiiive.zippop.busersignup.model.BuserSignupRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buser")
public class BuserController {
    private BuserService buserService;

    public BuserController(BuserService buserService) {this.buserService = buserService;}

    @RequestMapping(method = RequestMethod.POST, value="/signup")
    public ResponseEntity<BuserSignupRes> signup(@RequestBody BuserSignupReq dto) {
        BuserSignupRes response = buserService.signup(dto);
        return ResponseEntity.ok(response);
    }
}