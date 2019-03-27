package com.xcf.maven;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;


/**
 * 
 * @desc   查看运行期类来源的JAR包
 * 
 * <p>
 * 
 * 	有时你以为解决了但是偏偏还是报类包冲突，典型症状是java.lang.ClassNotFoundException或Method不兼容等异常，
 *  这时你可以设置一个断点，在断点处通过下面这个工具类来查看Class所来源的JAR包
 * 
 * </p>
 * 
 * @author Caifeng Xu
 * @time   2019年2月27日
 */
public class ClassLocationUtils {
	public static String where(final Class<?> clazz) {
		if (clazz == null) {
			throw new IllegalArgumentException("null input: cls");
		}
		URL result = null;
		final String clazzAsResource = clazz.getName().replace('.', '/').concat(".class");
		final ProtectionDomain protectionDomain = clazz.getProtectionDomain();
		if (protectionDomain != null) {
			final CodeSource codeSource = protectionDomain.getCodeSource();
			if (codeSource != null)
				result = codeSource.getLocation();
			if (result != null) {
				if ("file".equals(result.getProtocol())) {
					try {
						if (result.toExternalForm().endsWith(".jar") || result.toExternalForm().endsWith(".zip")) {
							result = new URL(
									"jar:".concat(result.toExternalForm()).concat("!/").concat(clazzAsResource));
						} else if (new File(result.getFile()).isDirectory()) {
							result = new URL(result, clazzAsResource);
						}
					} catch (MalformedURLException ignore) {

					}
				}
			}
		}
		if (result == null) {
			final ClassLoader clsLoader = clazz.getClassLoader();
			result = clsLoader != null ? clsLoader.getResource(clazzAsResource)
					: ClassLoader.getSystemResource(clazzAsResource);
		}
		return result.toString();
	}
}
