package arrayprograms;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {	
		
		List<String> str = new LinkedList<String>();
		
		str.add("arun");
		str.add("tamil");
		str.add("akass");
		
	List arr =	str.stream().filter(a->a.startsWith("a")).collect(Collectors.toList());
				
	System.out.println(arr);
	
	
	}

}
