package com.atguigu.cloudalibaba.service.impl;

import com.atguigu.cloudalibaba.dao.StorageDao;
import com.atguigu.cloudalibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 21:16
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class );
    
    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("====== storage-service 中扣减库存开始 ======");
        storageDao.decrease(productId, count);
        LOGGER.info("====== storage-service 中扣减库存结束 ======");
    }

}
