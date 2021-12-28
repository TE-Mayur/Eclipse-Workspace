package com.te.threads.threadsclass;

public class TableTest2 {
	public static void main(String[] args) {
		 
		Table2 tables = new Table2();
		 
		 Runnable ref1 = ()->{
			 synchronized (tables) {
				 tables.tableInfo(3); 				
			}
		 };
	
	
		 Runnable ref2 = ()->{
			 synchronized (tables) {
				 tables.tableInfo(8); 				
			}
		 };
		 
		 
		 Thread thread1 = new Thread(ref1);
		 Thread thread2 = new Thread(ref2);
		 
		 thread1.start();
		 thread2.start();
	}

}
