package com.baidu.thread4;

public class Test {
	public static void main(String[] args) {
		RunableTickets rt = new RunableTickets();
		Thread  t1 = new Thread(rt);
		Thread  t2 = new Thread(rt);
		Thread  t3 = new Thread(rt);
		t1.setName("����һ");
		t2.setName("���ڶ�");
		t3.setName("������");
		t1.start();
		t2.start();
		t3.start();
	}
}
