package com.baidu.thread5;

public class SingleInstanceDemo {
	//单例设计模式之懒汉式
		//私有化构造
		private SingleInstanceDemo(){}
		
		//提供成员变量
		private static SingleInstanceDemo instance = null;
		
		//提供一个公共的访问方式
		public static synchronized SingleInstanceDemo getInstance(){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (instance==null) {
				return instance = new SingleInstanceDemo();
			}else {
				return instance;
			}
		}
}
