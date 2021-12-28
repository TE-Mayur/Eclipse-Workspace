package com.te.first.test;

public class ConstructorTest { 
		
		int a = 10;
		int b = 2;
		
		public ConstructorTest() {
		}
		
		public ConstructorTest(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public void power() {
			System.out.println(Math.pow(a, b));
		}
	}
