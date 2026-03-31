import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        // Load existing data at start
        for (Patient p : FileManager.loadPatients("patients.txt")) {
            hospital.addPatient(p);
        }

        for (Doctor d : FileManager.loadDoctors("doctors.txt")) {
            hospital.addDoctor(d);
        }

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Search Doctor by Name");
            System.out.println("6. Save Data");
            System.out.println("7. Exit");

            try {
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter patient name: ");
                        String pname = scanner.nextLine();

                        System.out.print("Enter patient age: ");
                        int page = scanner.nextInt();
                        scanner.nextLine();

                        if (page < 0) {
                            throw new Exception("Age cannot be negative.");
                        }

                        System.out.print("Enter illness: ");
                        String illness = scanner.nextLine();

                        hospital.addPatient(new Patient(pname, page, illness));
                        System.out.println("Patient added successfully.");
                        break;

                    case 2:
                        System.out.print("Enter doctor name: ");
                        String dname = scanner.nextLine();

                        System.out.print("Enter doctor age: ");
                        int dage = scanner.nextInt();
                        scanner.nextLine();

                        if (dage < 0) {
                            throw new Exception("Age cannot be negative.");
                        }

                        System.out.print("Enter specialty: ");
                        String specialty = scanner.nextLine();

                        hospital.addDoctor(new Doctor(dname, dage, specialty));
                        System.out.println("Doctor added successfully.");
                        break;

                    case 3:
                        hospital.showPatients();
                        break;

                    case 4:
                        hospital.showDoctors();
                        break;

                    case 5:
                        System.out.print("Enter doctor name to search: ");
                        String searchName = scanner.nextLine();
                        hospital.findDoctorByName(searchName);
                        break;

                    case 6:
                        FileManager.savePatients(hospital.getPatients(), "patients.txt");
                        FileManager.saveDoctors(hospital.getDoctors(), "doctors.txt");
                        break;

                    case 7:
                        System.out.println("Saving before exit...");
                        FileManager.savePatients(hospital.getPatients(), "patients.txt");
                        FileManager.saveDoctors(hospital.getDoctors(), "doctors.txt");
                        System.out.println("Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option. Try again.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
