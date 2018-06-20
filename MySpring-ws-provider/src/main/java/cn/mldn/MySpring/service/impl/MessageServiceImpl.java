package cn.mldn.MySpring.service.impl;

import javax.jws.WebService;

import cn.mldn.MySpring.service.IMessageService;
@WebService(serviceName="messageService",endpointInterface="cn.mldn.MySpring.service.IMessageService")
public class MessageServiceImpl implements IMessageService {

	@Override
	public String echo(String msg) {
		if (msg == null) {
			throw new RuntimeException("空的消息，无法进行处理！");
		}
		return "【ECHO】msg = " + msg;
	}

}
