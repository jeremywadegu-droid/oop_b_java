public class Patient extends Person {
    private String illness;

    public Patient(String name, int age, String illness) {
        super(name, age);
        this.illness = illness;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Illness: " + illness);
    }
}
