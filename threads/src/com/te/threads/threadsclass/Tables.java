package com.te.threads.threadsclass;

public class Tables {

	public synchronized void tableInfo(int a) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i * a);
		}
		System.out.println("Table completed");
	}
}
