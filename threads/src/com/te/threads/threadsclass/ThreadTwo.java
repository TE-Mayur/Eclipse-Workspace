package com.te.threads.threadsclass;

public class ThreadTwo extends Thread {

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}

}
