package com.xcf.proxy.dynamic;

/**
 * 目标对象
 * @desc
 * @author Caifeng Xu
 * @time   2018年12月4日
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public void save() {
		System.out.println("----------save-------------");
	}

}
