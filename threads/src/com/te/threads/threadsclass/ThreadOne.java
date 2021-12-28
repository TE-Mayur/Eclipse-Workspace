package com.te.threads.threadsclass;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}
}
