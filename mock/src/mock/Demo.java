package mock;

public class Demo {
	
	 void display() {
		System.out.println("Mayur");
	}
	
	static int square(int num) {
		int res = num * num;
		return res;
	}
	
	double grade(double score) {
		double total = 500.00;
		double perc=(score/total)*100;
		return perc;
	}
	
	public static void main(String[] args) {
		
		Demo ref = new Demo();
		
		System.out.println(ref); // memory address
		
		Demo obj = new Demo();
		
		System.out.println("Object info " + obj); // memory address
	
		obj.display(); // Mayur
		
		ref.display(); // Mayur
		
		int value = square(5);
		
		System.out.println("Square root of 5 is " + value); // 25
		
		double res = ref.grade(400);
		
		System.out.println("Percentage is " + res);
		
	}

}
