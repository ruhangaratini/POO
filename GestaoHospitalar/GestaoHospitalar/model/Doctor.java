package GestaoHospitalar.model;

public class Doctor extends Person implements Entity {
    private int id;
    private String crm;
    private String speciality;
    private String ctps;

    public Doctor(String name, String identity, String cpf, String address, String phone, String crm, String speciality, String ctps) {
        super(name, identity, cpf, address, phone);
        this.crm = crm;
        this.speciality = speciality;
        this.ctps = ctps;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
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
        return super.toString() + "\nCRM: " + this.crm + "\n" +
            "Speciality: " + this.speciality + "\n" +
            "CTPS: " + this.ctps;
    }

}
