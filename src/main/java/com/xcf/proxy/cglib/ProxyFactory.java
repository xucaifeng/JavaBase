package com.xcf.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @desc   cglib 实现动态代理
 * @author Caifeng Xu
 * @time   2019年4月12日
 */
public class ProxyFactory implements MethodInterceptor {
	
	
	private Object target;
	
	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}

	//给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类(代理对象)
        return enhancer.create();

    }


	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		for(int i=0;i<args.length;i++){  
            System.out.println(args[i]);  
        }  
        Object result=null;  
        try{  
            //调用目标方法  
            result = method.invoke(target, args);  
            
            // 扩展
            System.out.println("-----specificFunc-----");  
        }catch(Exception e){  
            e.printStackTrace();  
            throw e;  
        }  
        return result;  
	}

}
