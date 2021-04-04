package com.aeolia.dao.impl;

import com.aeolia.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName： AccountDaoImpl1
 * @Description： TODO
 * @Author： 姚金鑫
 * @Date： 2021/4/2 17:57
 * @Version： 1.0
 **/
@Repository("accountDao1")
public class AccountDaoImpl1 implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("accountDao1被执行了");
    }
}
