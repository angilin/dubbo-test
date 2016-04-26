package com.angilin.rpc.service.startup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.angilin.rpc.service.AccountService;

public class ZookeeperProviderStartup {
		 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider-zookeeper.xml"});
        context.start();
        AccountService accountService = (AccountService)context.getBean("accountService"); 
        System.out.println(accountService);
        System.in.read(); // 按任意键退出
    }
	 
}
