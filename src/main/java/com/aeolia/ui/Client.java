package com.aeolia.ui;

import com.aeolia.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName： Client
 * @Description： TODO
 * @Author： 姚金鑫
 * @Date： 2021/3/30 15:43
 * @Version： 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        AccountService accountService1=context.getBean("accountService1",AccountService.class);
        accountService.saveAccount();
        accountService1.saveAccount();
        context.close();
    }
}
