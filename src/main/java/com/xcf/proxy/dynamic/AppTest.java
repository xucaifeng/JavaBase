package com.xcf.proxy.dynamic;

public class AppTest {
	
	public static void main(String[] args) {
		
		IUserDao userDao = new UserDaoImpl();
		System.out.println(userDao.getClass());
		
		// 给目标对象创建代理对象
		IUserDao proxyFactory = (IUserDao) new ProxyFactory(userDao).getProxyInstance();
		
		proxyFactory.save();
	}

}
