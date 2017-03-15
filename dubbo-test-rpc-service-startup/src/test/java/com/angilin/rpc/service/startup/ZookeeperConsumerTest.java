package com.angilin.rpc.service.startup;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.angilin.rpc.model.Cat;
import com.angilin.rpc.model.Mouse;
import com.angilin.rpc.model.SysAccountObj;
import com.angilin.rpc.service.AccountService;

public class ZookeeperConsumerTest {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer-zookeeper.xml"});
        context.start();
 
        AccountService accountService = (AccountService)context.getBean("accountService"); // 获取远程服务代理
        SysAccountObj account = accountService.login("admin", "123456"); // 执行远程方法
 
        System.out.println( account.getAccountNickName() ); // 显示调用结果
        
        List<Object> pets = account.getPets();
        for(Object pet : pets){
        	if(pet instanceof Cat){
        		System.out.println(((Cat)pet).getCatName());
        	}
        	if(pet instanceof Mouse){
        		System.out.println(((Mouse)pet).getMouseName());
        	}
        }
    }
}
