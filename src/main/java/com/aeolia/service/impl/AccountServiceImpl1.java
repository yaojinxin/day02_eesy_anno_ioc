package com.aeolia.service.impl;

import com.aeolia.dao.AccountDao;
import com.aeolia.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @ClassName： AccountServiceImpl1
 * @Description： TODO
 * @Author： 姚金鑫
 * @Date： 2021/4/2 17:59
 * @Version： 1.0
 **/
@Service("accountService1")
public class AccountServiceImpl1 implements AccountService {
    @Autowired
    @Qualifier("accountDao2")
    private AccountDao accountDao;
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
