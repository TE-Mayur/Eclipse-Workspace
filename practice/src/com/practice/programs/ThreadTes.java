package com.practice.programs;

public class ThreadTes {

	public static void main(String[] args) {
		Thread ref = new Thread();

		Runnable ref1 = () -> {
			ref.run();
		};

		Runnable ref2 = () -> {f
			ref.run();
		};

		Thread thr = new Thread(ref1);
		Thread thr2 = new Thread(ref2);

		thr.start();
		thr2.start();

	}
}
