package com.xcf.proxy.statical;

/**
 * 代理对象
 * @desc
 * @author Caifeng Xu
 * @time   2018年12月4日
 */
public class UserDaoImplProxy implements IUserDao {

	// 接口保存目标对象
	private IUserDao target;
	
	public UserDaoImplProxy(IUserDao target) {
		this.target = target;
	}


	@Override
	public void save() {
		System.out.println("---------------开始事务--------------");
		target.save();
		System.out.println("---------------提交事务--------------");
	}

}
