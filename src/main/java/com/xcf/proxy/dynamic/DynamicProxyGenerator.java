package com.xcf.proxy.dynamic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class DynamicProxyGenerator {

	public static void main(String[] args) throws IOException {
		
		byte[] classFile = ProxyGenerator.generateProxyClass(CoderImpl.class.getName(), CoderImpl.class.getInterfaces());
        File file = new File("D:/test/proxy/"+CoderImpl.class.getName()+".class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(classFile);
        fos.flush();
        fos.close();
		
	}
	
}
