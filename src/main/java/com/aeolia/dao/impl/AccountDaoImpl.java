package com.aeolia.dao.impl;

import com.aeolia.dao.AccountDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName： AccountDaoImpl
 * @Description： TODO
 * @Author： 姚金鑫
 * @Date： 2021/3/30 15:45
 * @Version： 1.0
 **/
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("accountDao被执行了");
    }
}
