public class Day003_Q1 {
    public static void main(String[] args) {
        Employee_D3Q1 earr[] = new Employee_D3Q1[5];
        Manager_D3Q1 marr[] = new Manager_D3Q1[2];
        earr[0] = new Employee_D3Q1(101, "Rajesh", "Surat", 786232L);
        earr[1] = new Employee_D3Q1(102, "Ethan", "Delhi", 7868672L);
        earr[2] = new Employee_D3Q1(103, "Rohan", "Mumbai", 786232L);
        earr[3] = new Employee_D3Q1(104, "Jarvis", "Hyderabad", 124232L);
        earr[4] = new Employee_D3Q1(105, "Nithin", "Kolkata", 45762L);
        marr[0] = new Manager_D3Q1(101, "Rajesh", "Surat", 786232L, "Python", 5);
        marr[1] = new Manager_D3Q1(107, "Raghav", "Chennai", 213432L, "Java", 10);
        
        for (int i = 0; i < earr.length; i++) {
            System.out.println("\nThe Detail of Employee " + (i + 1) + " is ");
            earr[i].Display();
        }
        for (int i = 0; i < marr.length; i++) {
            System.out.println("\nThe Detail of Manager " + (i + 1) + " is ");
            marr[i].Display();
        }
    }   
}

class Employee_D3Q1 {
    int empno;
    String ename;
    String address;
    long contactno;

    Employee_D3Q1(int empno, String ename, String address, long contactno) {
        this.empno = empno;
        this.ename = ename;
        this.address = address;
        this.contactno = contactno;
    }

    void Display() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactno);
    }
}

class Manager_D3Q1 extends Employee_D3Q1 {
    String dept;
    int noofrepotees;

    Manager_D3Q1(int empno, String ename, String address, long contactno, String dept, int noofrepotees) {
        super(empno, ename, address, contactno);
        this.dept = dept;
        this.noofrepotees = noofrepotees;
    }

    void Display() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactno);
        System.out.println("Departmant Name: " + dept);
        System.out.println("No of Reportee: " + noofrepotees);
    }
}