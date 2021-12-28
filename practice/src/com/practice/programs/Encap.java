package com.practice.programs;

public class Encap {

	private int i;
	
//	public int getIvalue(){
//	 return i;
//	
//	}
//	public void setIvalue(int i) {
//		this.i=i;
//	}	
	
	

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		public static void main(String[] args) {
			Encap ref = new Encap();
			ref.setI(90);
			System.out.println(ref.getI());
		}
	}


