package revision;

import java.util.List;

import java.util.ArrayList;

public class ArrayListimpl {
	
	 public static void main(String[] args) {
		
		 List list = new ArrayList();
		 
		 
		 list.add(10);
		 list.add(null);
		 list.add("Baunty");
		 list.add(null);
		 list.add("Sachin");
		 list.add(10);
		 list.add("Sachin");
		 
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		 
		 
		 
	}

}
