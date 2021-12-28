package com.practice.programs;

public class Test1 {

	public static void main(String[] args) {
		Good ref = new Good1();// implicit
		
		ref.show();
		 
		Good1 ref1 = (Good1) ref;// explicit
		ref1.show();
		ref1.access();

	}

}
