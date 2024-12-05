package GestaoHospitalar.model;

public class MedicalConsultation implements Entity {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private MedicalConsultationStatus status;

    public MedicalConsultation(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
        this.status = MedicalConsultationStatus.Entry;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public MedicalConsultationStatus getStatus() {
        return this.status;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }
}
