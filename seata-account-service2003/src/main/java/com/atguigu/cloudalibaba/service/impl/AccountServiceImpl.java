package com.atguigu.cloudalibaba.service.impl;

import com.atguigu.cloudalibaba.dao.AccountDao;
import com.atguigu.cloudalibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 21:45
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger (AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("====== account-service 中扣减账户余额开始 ======");
        // 模拟超时异常，全局事务回滚
        // 暂停几秒钟线程
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        accountDao.decrease(userId, money);
        LOGGER.info("====== account-service 中扣减账户余额结束 ======");
    }

}
