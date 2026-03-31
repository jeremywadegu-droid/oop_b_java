import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static void savePatients(ArrayList<Patient> patients, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Patient p : patients) {
                writer.write(p.toString());
                writer.newLine();
            }
            System.out.println("Patients saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving patients: " + e.getMessage());
        }
    }

    public static void saveDoctors(ArrayList<Doctor> doctors, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Doctor d : doctors) {
                writer.write(d.toString());
                writer.newLine();
            }
            System.out.println("Doctors saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving doctors: " + e.getMessage());
        }
    }

    public static ArrayList<Patient> loadPatients(String filename) {
        ArrayList<Patient> patients = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String illness = data[2];

                patients.add(new Patient(name, age, illness));
            }

            System.out.println("Patients loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Patient file not found. A new file will be created when saving.");
        } catch (IOException e) {
            System.out.println("Error reading patients: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid patient data format in file.");
        }

        return patients;
    }

    public static ArrayList<Doctor> loadDoctors(String filename) {
        ArrayList<Doctor> doctors = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String specialty = data[2];

                doctors.add(new Doctor(name, age, specialty));
            }

            System.out.println("Doctors loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Doctor file not found. A new file will be created when saving.");
        } catch (IOException e) {
            System.out.println("Error reading doctors: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid doctor data format in file.");
        }

        return doctors;
    }
}
