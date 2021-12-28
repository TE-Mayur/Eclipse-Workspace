
public class Student {

	String studName, degree, branch;
	int id;

	public Student(String studName, String degree, String branch, int id) {
		super();
		this.studName = studName;
		this.degree = degree;
		this.branch = branch;
		this.id = id;
	}

	public String toString() {
		return studName + " " + degree + " " + branch + " " + id;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object ref) {
		Student obj = (Student) ref;
		/*
		 * What operation is performed here ? 1.first we are creating reference for
		 * supermost class object 2.then that reference is getting assign to the
		 * subclass student. <now the subclass holding the super class reference>
		 */

		if (this.id == obj.id) {
			/*
			 * We are comparing current id(instance) to object class id condition false
			 * because parent class does not contain chid class behaviours...
			 */
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Student ref = new Student("Mohan", "B.E", "CSE", 1);
		System.out.println(ref.toString());
		System.out.println(ref);
		System.out.println(ref.hashCode());
		System.out.println(".............................");
		Student obj = new Student("Mahesh", "B.E", "CSE", 2);
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println(obj.hashCode());
		System.out.println(ref.equals(obj));
		System.out.println(obj.equals(ref));
		System.out.println(obj.equals(obj));
		System.out.println(ref.equals(ref));
	}
}
