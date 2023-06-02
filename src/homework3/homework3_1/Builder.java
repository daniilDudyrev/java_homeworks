package homework3.homework3_1;

public class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void build() {
        System.out.println("Builder " + getName() + " Specialization: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
