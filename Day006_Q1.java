import java.util.*;

public class Day006_Q1 {
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee emp1 = new Employee(101, "Rajesh", "bob@demo.com", 'M', 25000);
        Employee emp2 = new Employee(102, "Ethan", "alice@demo.com", 'M', 30000);
        Employee emp3 = new Employee(103, "John", "john@demo.com", 'M', 20000);
        Employee emp4 = new Employee(104, "Ram", "ram@demo.com", 'M', 50000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();
        empDb.deleteEmployee(102);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();

        System.out.println(empDb.showPaySlip(103));

    }
}

class Employee {
    private int EmpId;
    private String EmpName;
    private String EmpEmail;
    private char EmpGender;
    private float EmpSalary;

    public Employee() {
    }

    public Employee(int EmpId, String EmpName, String EmpEmail, char EmpGender, float EmpSalary) {
        super();
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpEmail = EmpEmail;
        this.EmpGender = EmpGender;
        this.EmpSalary = EmpSalary;
    }

    public String GetEmployeeDetails() {
        return "EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail + ", EmpGender=" + EmpGender
                + ", EmpSalary=" + EmpSalary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String EmpEmail) {
        this.EmpEmail = EmpEmail;
    }

    public char getEmpGender() {
        return EmpGender;
    }

    public void setEmpGender(char EmpGender) {
        this.EmpGender = EmpGender;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(float EmpSalary) {
        this.EmpSalary = EmpSalary;
    }

}

class EmployeeDB {
    List<Employee> employeeDb = new ArrayList<Employee>();

    public boolean addEmployee(Employee e) {
        return employeeDb.add(e);
    }

    public boolean deleteEmployee(int empId) {
        boolean isRemoved = false;

        Iterator<Employee> it = employeeDb.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmpId() == empId) {
                isRemoved = true;
                it.remove();
            }
        }

        return isRemoved;
    }

    public String showPaySlip(int empId) {
        String paySlip = "Invalid employee id";

        for (Employee e : employeeDb) {
            if (e.getEmpId() == empId) {
                paySlip = "Pay slip for employee id " + empId + " is " + e.getEmpSalary();
            }
        }

        return paySlip;
    }

    public Employee[] listAll() {
        Employee[] empArray = new Employee[employeeDb.size()];
        for (int i = 0; i < employeeDb.size(); i++)
            empArray[i] = employeeDb.get(i);
        return empArray;
    }
}