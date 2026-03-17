import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Exit");

            try {
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter patient name: ");
                        String pname = scanner.nextLine();

                        System.out.print("Enter age: ");
                        int page = scanner.nextInt();
                        scanner.nextLine();

                        if (page < 0) throw new Exception("Age cannot be negative!");

                        System.out.print("Enter illness: ");
                        String illness = scanner.nextLine();

                        hospital.addPatient(new Patient(pname, page, illness));
                        break;

                    case 2:
                        System.out.print("Enter doctor name: ");
                        String dname = scanner.nextLine();

                        System.out.print("Enter age: ");
                        int dage = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter specialty: ");
                        String specialty = scanner.nextLine();

                        hospital.addDoctor(new Doctor(dname, dage, specialty));
                        break;

                    case 3:
                        hospital.showPatients();
                        break;

                    case 4:
                        hospital.showDoctors();
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option!");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // clear bad input
            } finally {
                System.out.println("Operation completed.");
            }
        }
    }
}
