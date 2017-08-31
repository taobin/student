package com.baidu.thread2;

public class RunableDemo implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(1);
		}
		
	}

}
