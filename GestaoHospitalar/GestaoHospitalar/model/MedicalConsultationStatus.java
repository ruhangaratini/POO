package GestaoHospitalar.model;

import java.util.Scanner;

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

    public static MedicalConsultationStatus fromString() {
        final Scanner scanner = new Scanner(System.in);
        final MedicalConsultationStatus[] status = MedicalConsultationStatus.values();

        System.out.println("\n");
        for(int i = 0; i < status.length; i++) {
            System.out.println((i + 1) + ". " + status[i]);
        }
        System.out.println("Opcao: ");
        final int input = scanner.nextInt();

        if(input < 1 || input > status.length) {
            System.out.println("Opcao invalida!");
            return MedicalConsultationStatus.fromString();
        }

        return status[input - 1];
    }
}
