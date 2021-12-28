package com.te.threads.runnableimpl;

public class ThreadTwo  implements Runnable{

	@Override
	public void run() {
		System.out.println("------Thread two started ---------");
		int[] numbers= {1,2,3,4,5,6,};
		for (int ref : numbers ) {
			System.out.println(ref);
			
		}
		System.out.println("--Thread two Ended ------------");
	}
	
	

}
