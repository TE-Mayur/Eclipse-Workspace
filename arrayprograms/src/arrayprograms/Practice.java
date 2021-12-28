package arrayprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {

		List<Integer> ref = new ArrayList();

		ref.add(86);
		ref.add(12);
		ref.add(235);

		System.out.println("Original Array : " + ref);
		List<Integer> obj = ref.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println(obj);

		Set<Integer> obj2 = ref.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(obj2);

	}
}
