package com.way2learnonline.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.way2learnonline.utils.CacheUtil;

public class CachingInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	public  CachingInvocationHandler(Object target) {
		// TODO Auto-generated constructor stub
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
		// TODO Auto-generated method stub
		
		//1. implement the caching logic which is common for multiple classes
				//2. invoke the given method if required
		
		String key = method.getName();//getCustomerByID
		
		if(params!=null && params.length>0) {
			key += "(";		
			for(Object param:params) {
				key += param;			
			}
			key += ")";			
		}
		System.out.println(key);
		
		Object returnValue = CacheUtil.cache.get(key);
		
		if(returnValue==null) {
			System.out.println("Cache Missed.. getting data from DB");
			Object returnedValue =	method.invoke(target, params);
		 CacheUtil.cache.put(key, returnedValue);
		}else {
			System.out.println("Cache hit!.. returning data from Cache");
		}

		
		return returnValue;
	}

}
