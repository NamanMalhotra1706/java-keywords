class Employee{
    private static String companyName = "Capgemini";
    private static int totalEmployee;
    public String name;
    private final int id;
    public String designation;

    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee+=1;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Using instanceof
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployee);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Naman Malhotra",102, "Software Engineer");
        Employee emp2 = new Employee("Manvi Grover", 103, "Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();

    }
}
