package com.te.threads.runnablelamda;

public class RunnableLamda {
	public static void main(String[] args) {
		
	 
	Runnable ref1 = ()->{
		System.out.println("---------Threadone Started--------");
		String[] names = {"a","b","c","d" };
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("---------Thread one ended -------------");
		
	 };

	 Runnable ref2 = ()->{
		 System.out.println("------Thread two started ---------");
			int[] numbers= {1,2,3,4,5,6,};
			for (int ref : numbers ) {
				System.out.println(ref);
				
			}
			System.out.println("--Thread two Ended ------------");
	 };

	 Thread thread1 = new Thread(ref1);
	 Thread thread2 = new Thread(ref2);
	 
	 thread1.start();
	 thread2.start();
 

}
}