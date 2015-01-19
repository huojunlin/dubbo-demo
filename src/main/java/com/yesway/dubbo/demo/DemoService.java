package com.yesway.dubbo.demo;

public interface DemoService {

	public void sayHello();

	public String returnHello();

	public MsgInfo returnMsgInfo(MsgInfo info);

}