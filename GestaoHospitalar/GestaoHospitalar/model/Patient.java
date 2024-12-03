package GestaoHospitalar.model;

public class Patient extends Person implements Entity {
    private int id;
    private String healthPlan;
    private String healthPlanNumber;

    public Patient(String name, String identity, String cpf, String address, String phone, String healthPlan, String healthPlanNumber) {
        super(name, identity, cpf, address, phone);
        this.healthPlan = healthPlan;
        this.healthPlanNumber = healthPlanNumber;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getHealthPlanNumber() {
        return healthPlanNumber;
    }

    public void setHealthPlanNumber(String healthPlanNumber) {
        this.healthPlanNumber = healthPlanNumber;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHealthPlan: " + this.healthPlan + "\n" +
            "HealthPlanNumber: " + this.healthPlanNumber;
    }

}
