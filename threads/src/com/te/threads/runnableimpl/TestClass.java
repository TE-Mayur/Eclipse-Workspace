package com.te.threads.runnableimpl;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("------main started ---------");
		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();

		Thread thread1 = new Thread(one);
		Thread thread2 = new Thread(two);

		thread1.start();
		thread2.start();

		System.out.println("------main ended ---------");
	}

}
