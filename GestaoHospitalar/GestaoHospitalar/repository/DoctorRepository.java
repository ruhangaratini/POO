package GestaoHospitalar.repository;

import GestaoHospitalar.model.Doctor;

public class DoctorRepository extends DAO<Doctor> {
    private static DoctorRepository instance;

    private DoctorRepository () {}

    public static DoctorRepository getInstance() {
        if(DoctorRepository.instance == null)
            DoctorRepository.instance = new DoctorRepository();

        return DoctorRepository.instance;
    }
}
