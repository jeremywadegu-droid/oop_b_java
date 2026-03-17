import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void showPatients() {
        for (Patient p : patients) {
            p.displayInfo();
        }
    }

    public void showDoctors() {
        for (Doctor d : doctors) {
            d.displayInfo();
        }
    }
}
