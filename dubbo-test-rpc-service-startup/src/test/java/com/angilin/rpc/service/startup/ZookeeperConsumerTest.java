package com.angilin.rpc.service.startup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.angilin.rpc.model.SysAccountObj;
import com.angilin.rpc.service.AccountService;

public class ZookeeperConsumerTest {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer-zookeeper.xml"});
        context.start();
 
        AccountService accountService = (AccountService)context.getBean("accountService"); // 获取远程服务代理
        SysAccountObj account = accountService.login("admin", "123456"); // 执行远程方法
 
        System.out.println( account.getAccountNickName() ); // 显示调用结果
    }
}
