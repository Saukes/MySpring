package cn.mldn.MySpring.test;

import java.rmi.RemoteException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.MySpring.service.IMessageService;


@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
	@Autowired
	private IMessageService messageService ;
	@Test
	public void testAdd () throws Exception {
		System.out.println(this.messageService.echo("www.mldn.cn"));
	}
	
}
