import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;

    // Map for quick doctor lookup by name
    private Map<String, Doctor> doctorMap;

    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        doctorMap = new HashMap<>();
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
        doctorMap.put(d.getName().toLowerCase(), d);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void showPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient p : patients) {
            p.displayInfo();
        }
    }

    public void showDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }

        for (Doctor d : doctors) {
            d.displayInfo();
        }
    }

    public void findDoctorByName(String name) {
        Doctor d = doctorMap.get(name.toLowerCase());
        if (d == null) {
            System.out.println("Doctor not found.");
        } else {
            d.displayInfo();
        }
    }

    public void clearData() {
        patients.clear();
        doctors.clear();
        doctorMap.clear();
    }
}
