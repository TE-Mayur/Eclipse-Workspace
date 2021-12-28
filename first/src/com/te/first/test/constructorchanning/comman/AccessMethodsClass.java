package com.te.first.test.constructorchanning.comman;

public class AccessMethodsClass {
	public void publicMethod() {
		System.out.println("this is public method from " + AccessMethodsClass.class);
	}
	protected void protectedMethod() {
		System.out.println("this is protected method from " + AccessMethodsClass.class);
	}
	void defaultMethod() {
		System.out.println("this is default method from " + AccessMethodsClass.class);
	}

	private void privateMethod() {
		System.out.println("this is private method from " + AccessMethodsClass.class);
	}

}

