package com.te.threads.bank;

public class BankTest {
	public static void main(String[] args) {
		
	final Bank bk = new Bank();
		
//		Runnable wd = ()->{
//			bk.withDraw(15000);
//		};
//
//		Runnable de = ()->{
//			bk.deposite(10000);
//		};
//	
//		new Thread(wd).start();
//		new Thread(de).start();
//	}
	


	Runnable wd =()->{
		bk.withDraw(15000);
	};
	
	Runnable de = ()->{
		bk.deposite(10000);
	};
	
	new Thread(wd).start();
	new Thread(de).start();
	}
	}
	