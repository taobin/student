package com.baidu.thread3;

public class Test {
	public static void main(String[] args) {
		ThreadTickets  t = new ThreadTickets();
		ThreadTickets  t1 = new ThreadTickets();
		ThreadTickets  t2 = new ThreadTickets();
		t.setName("����һ");
		t1.setName("���ڶ�");
		t2.setName("������");
		t.start();
		t1.start();
		t2.start();
	}
}
