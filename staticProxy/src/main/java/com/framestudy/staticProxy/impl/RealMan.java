package com.framestudy.staticProxy.impl;

import com.framestudy.staticProxy.IManService;
import com.framestudy.staticProxy.beans.Girl;
/**
 * 真实对象类
 * @author Administrator
 *
 */
public class RealMan implements IManService {
	
	private Girl girl;
	
	public RealMan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RealMan(Girl girl) {
		super();
		this.girl = girl;
	}


	public void writeLetter() {
		// TODO Auto-generated method stub
		System.out.println("给"+girl.getName()+"写情书！");
	}

	public void getFlower() {
		// TODO Auto-generated method stub
		System.out.println("给"+girl.getName()+"买鲜花！");
	}

}
