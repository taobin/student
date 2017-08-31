package com.baidu.thread1;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(getName()+i);
		}
	}
}
