package com.baidu.thread2;

public class Test {
	public static void main(String[] args) {
		RunableDemo r = new RunableDemo();
		Thread t1 = new Thread(r);
		t1.start();
	}
}
