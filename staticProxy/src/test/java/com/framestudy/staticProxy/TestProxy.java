package com.framestudy.staticProxy;

import org.junit.Test;

import com.framestudy.staticProxy.beans.Girl;
import com.framestudy.staticProxy.impl.ProxyMan;

public class TestProxy {

	@Test
	public void testStaticProxy(){
		Girl girl = new Girl("冯程程");
		IManService man = new ProxyMan(girl);
		
		man.writeLetter();
		man.getFlower();
	}
	
	
}
