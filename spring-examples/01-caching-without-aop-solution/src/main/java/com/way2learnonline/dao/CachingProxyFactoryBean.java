package com.way2learnonline.dao;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class CachingProxyFactoryBean extends AbstractFactoryBean<Object> {
	
	private Object target;

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//return an object of a proxy instance 
	//it creates in-memory class definition
	@Override
	protected Object createInstance() throws Exception {
		// TODO Auto-generated method stub
		return	Proxy.newProxyInstance(target.getClass().getClassLoader(), 
								target.getClass().getInterfaces(),
								new CachingInvocationHandler(target));
	}

}
