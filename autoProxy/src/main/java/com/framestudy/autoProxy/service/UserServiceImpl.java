package com.framestudy.autoProxy.service;
/**
 * 真实类
 * @author Administrator
 *
 */
public class UserServiceImpl implements IUserService {

	@Override
	public void sayHello(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+",Hello!");
	}

}
