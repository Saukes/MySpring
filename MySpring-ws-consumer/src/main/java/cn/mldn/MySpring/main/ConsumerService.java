package cn.mldn.MySpring.main;

import cn.mldn.MySpring.service.IMessageService;
import cn.mldn.MySpring.service.impl.MessageServiceLocator;

public class ConsumerService {

	public static void main(String[] args) throws Exception {
		// 通过远程获取接口对象，但是获取之后的调用就好像该接口在本地存在一样
		IMessageService messageService = new MessageServiceLocator().getMessageServiceImplPort();
		System.out.println(messageService.echo("www.mldn.cn"));
	}

}
