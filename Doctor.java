public class Doctor extends Person implements MedicalService {
    private String specialty;

    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Age: " + age + ", Specialty: " + specialty);
    }

    @Override
    public void servePatient() {
        System.out.println(name + " is treating a patient.");
    }
}
