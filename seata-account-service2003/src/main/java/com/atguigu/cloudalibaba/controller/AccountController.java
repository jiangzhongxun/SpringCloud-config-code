package com.atguigu.cloudalibaba.controller;

import com.atguigu.cloudalibaba.domain.Account;
import com.atguigu.cloudalibaba.domain.CommonResult;
import com.atguigu.cloudalibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 21:49
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account/decrease")
    public CommonResult<Account> decrease(@RequestParam("userId") Long userId, @RequestParam ("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult<>(200, "扣减账户余额成功！");
    }

}
