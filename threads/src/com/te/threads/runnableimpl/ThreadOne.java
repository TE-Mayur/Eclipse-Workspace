package com.te.threads.runnableimpl;

public class ThreadOne implements Runnable {

	@Override
	public void run() {
		System.out.println("--------------Thread one Started----------");
		String[] names = {"a","b","c","d" };
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("---------Thread one ended -------------");
		
	}
	

}
