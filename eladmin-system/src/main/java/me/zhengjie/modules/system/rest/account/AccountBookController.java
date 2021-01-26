package me.zhengjie.modules.system.rest.account;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@Api(tags = "account/账本管理")
@RequestMapping("/account/book")
public class AccountBookController {
    private String aliAppId="2021002125611503";
    public void setAliAppId(){

    }

}
