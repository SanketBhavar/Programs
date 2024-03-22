package com.mypack;

class MyThread8 extends Thread {
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Sanket Thread");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}		
		}
	}
}

public class ThreadDemo8 {
	public static void main(String[] args) throws InterruptedException {
		MyThread8 t = new MyThread8();
		t.start();
		t.join();
		//join() method- If a thread wants to wait until completing some other thread.
		for(int i=0;i<5;i++) {
			System.out.println("Rahul Thread");
		}
	}
}
