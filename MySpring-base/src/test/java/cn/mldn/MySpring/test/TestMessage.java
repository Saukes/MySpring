package cn.mldn.MySpring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.MySpring.service.IMessage;

public class TestMessage {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-base.xml");
		IMessage msg = context.getBean("messageImpl",IMessage.class);
		System.out.println(msg.echo("www.mldn.cn"));
	}
}
