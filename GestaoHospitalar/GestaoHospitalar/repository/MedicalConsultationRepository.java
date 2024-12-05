package GestaoHospitalar.repository;

import GestaoHospitalar.model.MedicalConsultation;

public class MedicalConsultationRepository extends DAO<MedicalConsultation> {
    private static MedicalConsultationRepository instance;

    private MedicalConsultationRepository () {}

    public static MedicalConsultationRepository getInstance() {
        if(MedicalConsultationRepository.instance == null)
            MedicalConsultationRepository.instance = new MedicalConsultationRepository();

        return MedicalConsultationRepository.instance;
    }
}
