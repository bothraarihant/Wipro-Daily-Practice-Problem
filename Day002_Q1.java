public class Day002_Q1 {
	
	public static void main(String[] args) {
		Student_D2Q1 s1 = new Student_D2Q1(001, "Rajesh", 23456L, "Java", 20000);
		Student_D2Q1 s2 = new Student_D2Q1(002, "Jarvis", 234322L, "Java", 20000);
		Student_D2Q1 s3 = new Student_D2Q1(003, "Abdul", 267576L, "Java", 20000);
		Student_D2Q1 s4 = new Student_D2Q1(004, "Ethan", 233256L, "Java", 20000);
		Student_D2Q1 s5 = new Student_D2Q1(005, "Nithin", 986546L, "Java", 20000);
		System.out.println("\nDetails of Student 1 is:");
		s1.Display();
		System.out.println("\nDetails of Student 2 is:");
		s2.Display();
		System.out.println("\nDetails of Student 3 is:");
		s3.Display();
		System.out.println("\nDetails of Student 4 is:");
		s4.Display();
		System.out.println("\nDetails of Student 5 is:");
		s5.Display();
	}
}

class Student_D2Q1 {
	int studentid;
	String name;
	long contactnumber;
	String course;
	int fees;

	Student_D2Q1(int studentid, String name, long contactnumber, String course, int fees) {
		this.studentid = studentid;
		this.name = name;
		this.contactnumber = contactnumber;
		this.course = course;
		this.fees = fees;
	}

	void Display() {
		System.out.println("Student ID: " + studentid);
		System.out.println("Name: "+name);
		System.out.println("Contact Number: "+ contactnumber);
		System.out.println("Coures: " + course);
		System.out.println("Fees: " + fees);
	}
}