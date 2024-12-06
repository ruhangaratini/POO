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

    public boolean setStatus(Doctor doctor, MedicalConsultationStatus status) {
        if(this.doctor != doctor)
            return false;

        this.status = status;
        return true;
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
        return "Paciente:\n" + this.patient + "\n\nMedico:\n" + this.doctor + "\n\nStatus:" + this.status;
    }
}
