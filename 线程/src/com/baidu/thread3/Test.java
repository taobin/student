package com.baidu.thread3;

public class Test {
	public static void main(String[] args) {
		ThreadTickets  t = new ThreadTickets();
		ThreadTickets  t1 = new ThreadTickets();
		ThreadTickets  t2 = new ThreadTickets();
		t.setName("窗口一");
		t1.setName("窗口二");
		t2.setName("窗口三");
		t.start();
		t1.start();
		t2.start();
	}
}
