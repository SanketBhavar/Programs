package com.mypack;

class MyThread8 extends Thread {
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Sanket Thread");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {				
			}		
		}
	}
}

public class ThreadDemo8 {
	public static void main(String[] args) {
		
	}
}
