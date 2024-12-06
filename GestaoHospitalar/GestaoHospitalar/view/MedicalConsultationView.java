package GestaoHospitalar.view;

import GestaoHospitalar.model.Doctor;
import GestaoHospitalar.model.MedicalConsultation;
import GestaoHospitalar.model.MedicalConsultationStatus;
import GestaoHospitalar.model.Patient;
import GestaoHospitalar.repository.DoctorRepository;
import GestaoHospitalar.repository.MedicalConsultationRepository;
import GestaoHospitalar.repository.PatientRepository;

import java.util.Scanner;

public class MedicalConsultationView {

    public static void showMenu() {
        final Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("6")) {
            System.out.println("\n----- Consulta -----");
            System.out.println("1. Cadastrar");
            System.out.println("2. Buscar");
            System.out.println("3. Consultar (apenas Medicos)");
            System.out.println("4. Listar");
            System.out.println("5. Sair");
            System.out.println("----------------\n");

            System.out.print("Opcao: ");
            input = scanner.next();

            switch (input) {
                case "1":
                    registerMedicalConsultation();
                    break;
                case "2":
                    searchMedicalConsultation();
                    break;
                case "3":
                    updateMedicalConsultation();
                    break;
                case "4":
                    listAll();
                    break;
            }
        }
    }

    public static void registerMedicalConsultation() {
        final Scanner scanner = new Scanner(System.in);
        final MedicalConsultationRepository repository = MedicalConsultationRepository.getInstance();
        final DoctorRepository doctorRepository = DoctorRepository.getInstance();
        final PatientRepository patientRepository = PatientRepository.getInstance();

        System.out.print("ID Medico: ");
        final Doctor doctor = doctorRepository.getByID(scanner.nextInt());

        if(doctor == null) {
            System.out.println("Medico nao encontrado!");
            return;
        }

        System.out.print("ID Medico: ");
        final Patient patient = patientRepository.getByID(scanner.nextInt());

        if(patient == null) {
            System.out.println("Paciente nao encontrado!");
            return;
        }

        repository.add(new MedicalConsultation(patient, doctor));
    }

    public static void searchMedicalConsultation() {
        final Scanner scanner = new Scanner(System.in);
        final MedicalConsultationRepository repository = MedicalConsultationRepository.getInstance();

        System.out.print("ID: ");
        final int id = scanner.nextInt();

        final MedicalConsultation consultation = repository.getByID(id);

        if(consultation == null) {
            System.out.println("Consulta nao encontrada");
            return;
        }

        System.out.println(consultation);
    }

    public static void updateMedicalConsultation() {
        final Scanner scanner = new Scanner(System.in);
        final MedicalConsultationRepository repository = MedicalConsultationRepository.getInstance();
        final DoctorRepository doctorRepository = DoctorRepository.getInstance();

        System.out.println("ID Medico Responsavel: ");
        Doctor doctor = doctorRepository.getByID(scanner.nextInt());

        if(doctor == null) {
            System.out.println("Medico nao encontrado!");
            return;
        }

        System.out.print("ID Consulta: ");
        final MedicalConsultation consultation = repository.getByID(scanner.nextInt());

        if(consultation == null) {
            System.out.println("Consulta nao encontrada!");
            return;
        }

        System.out.println("\nNovo status:\n");
        if(!consultation.setStatus(doctor, MedicalConsultationStatus.fromString())) {
            System.out.println("Apenas o medico responsavel pode alterar a consulta");
        }

        System.out.println("Status atualizado com sucesso!");
    }

    public static void removeMedicalConsultation() {
        final Scanner scanner = new Scanner(System.in);
        final MedicalConsultationRepository repository = MedicalConsultationRepository.getInstance();

        System.out.println("ID: ");
        MedicalConsultation consultation = repository.getByID(scanner.nextInt());

        if(consultation == null) {
            System.out.println("Paciente nao encontrado!");
            return;
        }

        if(!repository.remove(consultation)) {
            System.out.println("Consulta nao encontrada!");
            return;
        }

        System.out.println("Consulta removida com sucesso!");
    }

    public static void listAll() {
        for(final MedicalConsultation consultation : MedicalConsultationRepository.getInstance().getAll())
            System.out.println(consultation + "\n\n");
    }

}
