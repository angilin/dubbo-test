package com.angilin.rpc.service.startup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HessianProviderStartup {
		 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider-hessian.xml"});
        context.start();
 
        System.in.read(); // 按任意键退出
    }
	 
}
