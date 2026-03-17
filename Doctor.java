public class Doctor extends Person {
    private String specialty;

    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Age: " + age + ", Specialty: " + specialty);
    }
}
