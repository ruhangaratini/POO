package GestaoHospitalar.model;

public enum MedicalConsultationStatus {
    Entry,
    GeneralClinicalTreatment,
    PreSurgeryPreparation,
    Surgery,
    PostSurgery,
    ClinicalDischarge;

    @Override
    public String toString() {
        return switch (this) {
            case Entry -> "Entrada";
            case GeneralClinicalTreatment -> "Tratamento Clinico Geral";
            case PreSurgeryPreparation -> "Preparacao Pre Cirurgia";
            case Surgery -> "Cirurgia";
            case PostSurgery -> "Pos Cirurgia";
            case ClinicalDischarge -> "Alta Clinica";
        };
    }
}
