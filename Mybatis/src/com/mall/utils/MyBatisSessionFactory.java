package com.mall.utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSessionFactory {

	private static String CONFIG_FILE_LOCATION = "mybatis-config.xml";

	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

	private static InputStream is; // 用于读取配置文件的流对象

	private static SqlSessionFactory fac;// 用于管理多个连接的工厂。一个工厂对应1个数据库。

	// 在该类的静态段中加载配置文件，这样可以确保只执行1次。
	static {
		try {
			is = Resources.getResourceAsStream(CONFIG_FILE_LOCATION);// 读取配置文件
			fac = new SqlSessionFactoryBuilder().build(is);// 通过配置文件创建1个连接工厂
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 获取1条连接
	public static SqlSession getSession() {
		SqlSession s = threadLocal.get(); // 找线程池要1条连接
		if (s == null) // 第1次时，拿不到，则由工厂获取1条连接并放入线程池
		{
			s = fac.openSession();// 由工厂获取1条连接并放入线程池
			threadLocal.set(s);// 放入线程池
		}
		return s;
	}

	// 关闭连接
	public static void closeSession() {
		SqlSession s = threadLocal.get();// 找线程池要本线程对应的连接
		threadLocal.set(null);// 将该连接从线程池中清除
		if (s != null)
			s.close();// 物理关闭连接
	}
}
