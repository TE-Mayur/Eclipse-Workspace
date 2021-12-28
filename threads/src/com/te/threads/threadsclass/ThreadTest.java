package com.te.threads.threadsclass;

public class ThreadTest {
	public static void main(String[] args) {

		System.out.println("======= main started ========");
		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();
		
		one.start();
		
		System.out.println("-----------------");
		
		two.start();
		
		System.out.println("========= main Ended ============");
	
	
	}

}
