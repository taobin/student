package com.baidu.thread1;

public class Test {
	public static void main(String[] args) {
		MyThread  t = new MyThread();
		MyThread  t1 = new MyThread();
		MyThread  t2 = new MyThread();
		t.setName("����");
		t1.setName("����");
		t2.setName("����");
		t.setPriority(6);
		
		t.start();
		t1.start();
		t2.start();
	}
}
