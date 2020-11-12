package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @ClassName TestSpring
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/11/10 8:10
 **/
public class TestSpring {

    @Test
    public void run1() {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.findAll();
        accountService.save(new Account());
    }
}
