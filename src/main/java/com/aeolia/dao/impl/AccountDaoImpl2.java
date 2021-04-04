package com.aeolia.dao.impl;

import com.aeolia.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName： AccountDaoImpl2
 * @Description： TODO
 * @Author： 姚金鑫
 * @Date： 2021/4/2 17:57
 * @Version： 1.0
 **/
@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao {


    @Override
    public void saveAccount() {
        System.out.println("accountDao2被执行了");
    }
}
