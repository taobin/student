package com.baidu.thread4;

public class RunableTickets implements Runnable {
	static int tickets = 50;
	// Object obj = new Object();
	int x;

	@Override
	public void run() {
		if (x % 2 == 0) {
			while (true) {
				synchronized (RunableTickets.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							// TODO: handle exception
						}
						System.out.println(Thread.currentThread().getName()
								+ "正在出售第：" + tickets-- + "张票");
					}
				}
			}
		} else {
			sellTickets();
		}
		x++;
	}

	private static synchronized void sellTickets() {
		if (tickets > 0) {
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第："
					+ tickets-- + "张票");
		}

	}

}
