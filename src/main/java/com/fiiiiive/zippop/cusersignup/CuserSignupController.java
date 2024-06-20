package com.fiiiiive.zippop.cusersignup;

import com.fiiiiive.zippop.cusersignup.model.CuserSignupCreateReq;
import com.fiiiiive.zippop.cusersignup.model.CuserSignupCreateRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuser")
public class CuserSignupController {
    private CuserSignupService cuserSignupService;

    public CuserSignupController(CuserSignupService cuserSignupService) {
        this.cuserSignupService = cuserSignupService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public ResponseEntity<CuserSignupCreateRes> create(@RequestBody CuserSignupCreateReq dto) {
        CuserSignupCreateRes response = cuserSignupService.create(dto);
        return ResponseEntity.ok(response);
        }
}
