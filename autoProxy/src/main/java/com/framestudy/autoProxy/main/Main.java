package com.framestudy.autoProxy.main;

import com.framestudy.autoProxy.proxy.JDKProxy;
import com.framestudy.autoProxy.service.IUserService;
import com.framestudy.autoProxy.service.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUserService userService = new UserServiceImpl();
		System.out.println(userService.getClass().getSimpleName());
		System.out.println(userService.getClass().getSuperclass());
		
		IUserService proxyService = (IUserService) JDKProxy.getProxyObject(userService);
		proxyService.sayHello("xiaoming");
		System.out.println(proxyService.getClass().getSuperclass());
	}

}
