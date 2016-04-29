package com.angilin.rpc.service.startup;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.service.GenericService;
import com.angilin.rpc.model.SysAccountObj;
import com.angilin.rpc.service.AccountService;

public class GenericConsumerTest {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		new String[] {"dubbo-consumer-generic.xml"});
        context.start();
 
        GenericService  baseService = (GenericService)context.getBean("accountService"); // 获取远程服务代理
        /* 如果参数里有对象，需要封装成map后传入
         * Map<String,Object> account = new HashMap<String,Object>();
        account.put("accountName", "admin");
        account.put("password", "123456");*/
        Object obj = baseService.$invoke("login", new String[] { "java.lang.String","java.lang.String" }, new Object[] {"admin","123456"});
        System.out.println( ((Map)obj).get("accountNickName") ); // 显示调用结果
    }
}
