package com.framestudy.autoProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

	public static Object getProxyObject(final Object c){
		return Proxy.newProxyInstance(c.getClass().getClassLoader(), c.getClass().getInterfaces(), 
			new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
					// TODO Auto-generated method stub
					return method.invoke(c, args);
				}
			});
	}
}
