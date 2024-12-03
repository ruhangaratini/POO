package GestaoHospitalar.repository;

import GestaoHospitalar.model.Patient;

public class PatientRepository extends DAO<Patient> {
    private static PatientRepository instance;

    private PatientRepository() {}

    public static PatientRepository getInstance() {
        if(PatientRepository.instance == null)
            PatientRepository.instance = new PatientRepository();

        return PatientRepository.instance;
    }
}
