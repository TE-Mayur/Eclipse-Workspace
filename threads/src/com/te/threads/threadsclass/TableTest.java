package com.te.threads.threadsclass;

public class TableTest {
	public static void main(String[] args) {
		 
		Tables tables = new Tables();
		 
		 Runnable ref1 = ()->{
			 tables.tableInfo(3); 
		 };
	
	
		 Runnable ref2 = ()->{
			 tables.tableInfo(8); 
		 };
		 
		 
		 Thread thread1 = new Thread(ref1);
		 Thread thread2 = new Thread(ref2);
		 
		 thread1.start();
		 thread2.start();
	}

}
