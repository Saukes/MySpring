package cn.mldn.MySpring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartServiceMain {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("spring/spring-*.xml") ;
	}
}
