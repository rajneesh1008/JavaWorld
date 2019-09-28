package com.reflection.core;

import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<COne> cls= COne.class;
		Class<? super COne> classObj = cls.getSuperclass();
		System.out.println(classObj.getName());
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			int count = method.getParameterCount();
			System.out.println(count);
			Class<?>[] types = method.getParameterTypes();
			System.out.println(types);
			
		Method method1=cls.getMethod("methodOne",new Class[]{});
			System.out.println(method1.getName());
		}
	}

}
