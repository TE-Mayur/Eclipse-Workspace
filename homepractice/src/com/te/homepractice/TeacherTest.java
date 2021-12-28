package com.te.homepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherTest {
	
	public static void main(String[] args) {
		
		List<Teachers> ref = new ArrayList<Teachers>();
		
		ref.add(new Teachers(10,"Sailen"));
		ref.add(new Teachers(80,"Mayur"));
		ref.add(new Teachers(50,"Sachin"));
		ref.add(new Teachers(40,"Baunty"));
		ref.add(new Teachers(30,"Tanisha"));
		
		for (Teachers teachers : ref) {
			System.out.println(teachers);
		}
		
		System.out.println("----after sorting----");
		Collections.sort(ref);
		for (Teachers teachers : ref) {
			System.out.println(teachers);			
		}
		
		
	}

}
