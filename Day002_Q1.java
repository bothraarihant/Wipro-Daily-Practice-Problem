public class Day002_Q1 {

	public static void main(String[] args) {
		Student_D2Q1 sarr[] = new Student_D2Q1[5];
		sarr[0] = new Student_D2Q1(001, "Rajesh", 23456L, "Java", 20000);
		sarr[1] = new Student_D2Q1(002, "Jarvis", 234322L, "Java", 20000);
		sarr[2] = new Student_D2Q1(003, "Abdul", 267576L, "Java", 20000);
		sarr[3] = new Student_D2Q1(004, "Ethan", 233256L, "Java", 20000);
		sarr[4] = new Student_D2Q1(005, "Nithin", 986546L, "Java", 20000);

		for (int i = 0; i < sarr.length; i++) {
			System.out.println("\nDetails of Student " + (i + 1) + " is: ");
			sarr[i].Display();
		}

		int totalfees = 0;
		for (int i = 0; i < sarr.length; i++) {
			totalfees = totalfees + sarr[i].fees;
		}
		System.out.println("\nThe total fees of all the student is:"+ totalfees);

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
		System.out.println("Name: " + name);
		System.out.println("Contact Number: " + contactnumber);
		System.out.println("Coures: " + course);
		System.out.println("Fees: " + fees);
	}
}