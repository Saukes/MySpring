package cn.mldn.MySpring.service.impl;

import cn.mldn.MySpring.service.IMessage;

public class MessageImpl implements IMessage {

	@Override
	public String echo(String val) {
		return "【ECHO】" + val;
	}
}
