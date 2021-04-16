package This;
//this is keyword is required when local variable and instance variable are same.
// class contains variables rollno and fee
class Student {
	int rollno;
	float fee;
	
//variables in constructor are same as class 
	Student(int rollno, float fee) {
		rollno = rollno;
		fee = fee;
		System.out.println(rollno+"  "+fee);
// variables in this constructor are different from class here this keyword is not required 
//	Student(int rollno, float fee) {
//		rollno = r;
//		fee = f;
//		System.out.println(r+"  "+f);
//		
//	}
	}
	void display() {
		System.out.println(rollno+"  "+fee); 
	 }
	 
}

class TestThis1 {
	public static void main(String args[]) {
		Student s1 = new Student(11, 5000f);
		Student s2 = new Student(12, 6000f);
		s1.display();  
		s2.display();  
	}
}

class Student1 {
	int rollno;
	float fee;

	Student1(int rollno, float fee) {
		this.rollno = rollno;

		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + " " + fee);
	}
}

class TestThis2 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(1, 5000f);
		Student1 s2 = new Student1(12, 6000f);
		s1.display();
		s2.display();
	}
}
