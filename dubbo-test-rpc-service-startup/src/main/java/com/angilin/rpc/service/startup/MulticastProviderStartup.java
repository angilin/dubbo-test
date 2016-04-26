package com.angilin.rpc.service.startup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MulticastProviderStartup {
		 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider-multicast.xml"});
        context.start();
 
        System.in.read(); // 按任意键退出
    }
	 
}
