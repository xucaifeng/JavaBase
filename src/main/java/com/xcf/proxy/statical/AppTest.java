package com.xcf.proxy.statical;
/**
 * 静态代理测试类，
 * @desc
 * @author Caifeng Xu
 * @time   2018年12月4日
 */
public class AppTest {
	
	public static void main(String[] args) {
		// 目标对象
		IUserDao userDaoImpl = new UserDaoImpl();
		System.out.println(userDaoImpl.getClass());
		System.out.println(userDaoImpl.getClass().getClassLoader());
		System.out.println(userDaoImpl.getClass().getInterfaces());
		
		// 代理对象，将目标对象传给代理对象建立代理关系
		UserDaoImplProxy userDaoImplProxy = new UserDaoImplProxy(userDaoImpl);
		
		userDaoImplProxy.save();
				 
	}

}
