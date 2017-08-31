package com.baidu.thread5;

public class Test {
	public static void main(String[] args) {
		/**
		 * 	案例：利用匿名内部类，启动多个线程，验证单例设计模式之懒汉式所存在的缺陷，
	      	当使用多线程来搞的时候就不单例了。。
		 */
		new Thread(){
			@Override
			public void run() {
				//获取对象
				SingleInstanceDemo instance = SingleInstanceDemo.getInstance();
				System.out.println(instance);
			}
		}.start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//获取对象
				SingleInstanceDemo instance = SingleInstanceDemo.getInstance();
				System.out.println(instance);
			}
		}).start();
		
	}

}
