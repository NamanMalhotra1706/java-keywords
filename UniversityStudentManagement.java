class Student{
    private static String universityName = "Chitkara University, Punjab";
    private static int totalStudents = 0;
    private  String name ;
    private final int rollNumber;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents+=1;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void displayTotalStudents(){
        System.out.println("Total Students: " + totalStudents);
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student stu1 = new Student(2110990913, "Naman", "A+");
        Student stu2 = new Student(2110990862, "Manvi", "O");

        stu1.displayStudentDetails();
        stu2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
