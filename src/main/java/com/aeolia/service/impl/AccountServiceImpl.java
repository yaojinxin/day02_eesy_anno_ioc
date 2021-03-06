package com.aeolia.service.impl;

import com.aeolia.dao.AccountDao;
import com.aeolia.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @ClassName： AccountServiceImpl
 * @Description： TODO
 * @Author： 姚金鑫
 * @Date： 2021/3/30 15:43
 * @Version： 1.0
 *
 * 用于创建对象的注解
 *      他们的作用就和在xml配置文件中编写一个<bean>标签实现的功能是一样的
 *      Component:
 *          作用：用于把当前类对象存入spring容器中
 *          属性：
 *              value：用于指定bean的id。当我们不写时，他的默认值是当前类名，且首字母改小写
 *      Controller：一般用于表现层
 *      Service：一般用在业务层
 *      Repository：一般用在持久层
 *          以上三个注解他们的作用和属性与Component是一摸一样的
 *          他们三个是spring框架为我们提供明确的三层使用的注解，使我们的三层对象更加清晰
 * 用于注入数据的
 *      他们的作用就和在xml配置文件中的<bean>标签中写一个<property>标签的作用是一样的
 *      Autowired:
 *          作用：自动按照类型注入，只要容器中有唯一的bean对象类型和要注入的变量类型匹配，就可以注入成功
 *                  如果IOC容器中没有任何bean的类型和要注入的变量类型匹配，则报错
 *                  如果IOC容器中有多个类型匹配时，按照变量名称进行匹配
 *          出现位置：
 *              可以是变量上，也可以是方法上
 *          细节：
 *              在使用注解注入时，set方法就不是必须的了
 *      Qualifier:
 *          作用：在按照类中注入的基础之上再按照名称注入。它再给类成员注入时不能单独使用。但是在给方法参数注入时可以使用
 *      Resource
 *          作用：直接按照bean的id注入。它可以独立使用
 *          属性：
 *              name：用于指定bean的id。
 *      以上三个注入都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现。
 *      另外，集合类型的注入只能通过XML来实现
 *      Value：
 *          作用：用于注入基本类型和String类型的数据
 *          属性：
 *              value：用于指定数据的值。它可以使用spring中的SpEL(也就是spring的el表达式)
 *                      ApEL的写法：${表达式}
 *
 * 用于改变作用范围的
 *      他们的作用就和在<bean>标签中使用scope属性实现的功能是一样的
 *      Scope:
 *          作用：用于指定bean的作用范围
 *          属性：
 *              value：指定范围的取值，常用取值：singleton prototype
 * 和生命周期相关的 了解
 *      他们的作用就和在<bean>标签中使用init-method和destroy-method的作用是一样的
 *      PreDestroy:用于指定销毁方法
 *      PostConstruct：用于指定初始化方法
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDao1")
    private AccountDao accountDao;
    @PostConstruct
    public void init(){
        System.out.println(this+"初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println(this+"销毁方法");
    }

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
