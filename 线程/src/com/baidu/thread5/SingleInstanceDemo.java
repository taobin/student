package com.baidu.thread5;

public class SingleInstanceDemo {
	//�������ģʽ֮����ʽ
		//˽�л�����
		private SingleInstanceDemo(){}
		
		//�ṩ��Ա����
		private static SingleInstanceDemo instance = null;
		
		//�ṩһ�������ķ��ʷ�ʽ
		public static synchronized SingleInstanceDemo getInstance(){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (instance==null) {
				return instance = new SingleInstanceDemo();
			}else {
				return instance;
			}
		}
}
