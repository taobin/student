package com.baidu.thread3;

public class ThreadTickets extends Thread{
	static int  tickets =50;
	Object obj = new Object();
	@Override
	public void run() {
			while (true) {
				if (tickets>0) {
					System.out.println(getName()+"���ڳ��۵ڣ�"+tickets--+"��Ʊ");
				}
			}	
		}
	}

