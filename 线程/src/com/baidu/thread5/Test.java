package com.baidu.thread5;

public class Test {
	public static void main(String[] args) {
		/**
		 * 	���������������ڲ��࣬��������̣߳���֤�������ģʽ֮����ʽ�����ڵ�ȱ�ݣ�
	      	��ʹ�ö��߳������ʱ��Ͳ������ˡ���
		 */
		new Thread(){
			@Override
			public void run() {
				//��ȡ����
				SingleInstanceDemo instance = SingleInstanceDemo.getInstance();
				System.out.println(instance);
			}
		}.start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//��ȡ����
				SingleInstanceDemo instance = SingleInstanceDemo.getInstance();
				System.out.println(instance);
			}
		}).start();
		
	}

}
