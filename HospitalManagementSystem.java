class Patient {
    private static String hospitalName = "Neelam Hospital"; // Static variable shared across all patients
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    // display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Aman", 22, "Fever");
        Patient patient2 = new Patient(102, "Adarsh", 23, "Cold");

        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        // total patients admitted
        Patient.getTotalPatients();
    }
}
