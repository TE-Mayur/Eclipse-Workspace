package com.te.threads.bank;

public class Bank {

	int amount = 10000;
	
	public synchronized void withDraw(int money) {
		System.out.println("Going to withdraw...");
		if (money > amount) {
			System.out.println("Less Balance .. !! Waiting for deposite");
			try {
				wait(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		amount -= money;
		System.out.println("Withdraw successfull");
	
	}
	
	public synchronized void deposite(int money) {
		System.out.println("Deposite Money -_-");
		amount += money;
		System.out.println("Deposite Successfull");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
	
	
	
	
	
	
	 
	
	
	
}
