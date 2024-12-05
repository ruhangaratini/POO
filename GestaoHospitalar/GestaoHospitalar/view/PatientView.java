package GestaoHospitalar.view;

import GestaoHospitalar.model.Patient;
import GestaoHospitalar.repository.PatientRepository;
import GestaoHospitalar.util.InterfaceUtil;

import java.util.Scanner;

public class PatientView {

    public static void showMenu() {
        final Scanner scanner = new Scanner(System.in);
        final PatientRepository repository = PatientRepository.getInstance();
        String input = "";

        while(!input.equals("6")) {
            System.out.println("\n----- Paciente -----");
            System.out.println("1. Cadastrar");
            System.out.println("2. Buscar");
            System.out.println("3. Atualizar");
            System.out.println("4. Remover");
            System.out.println("5. Listar");
            System.out.println("6. Sair");
            System.out.println("----------------\n");

            System.out.print("Opcao: ");
            input = scanner.next();

            switch (input) {
                case "1":
                    repository.add(registerPatient());
                    break;
                case "2":
                    searchPatient();
                    break;
                case "3":
                    updatePatient();
                    break;
                case "4":
                    removePatient();
                    break;
                case "5":
                    listAll();
                    break;
            }

            if(!input.equals("6"))
                InterfaceUtil.pressEnterToContinue();
        }
    }

    public static Patient registerPatient() {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        final String name = scanner.nextLine();

        System.out.print("Identidade: ");
        final String identity = scanner.nextLine();

        System.out.print("CPF: ");
        final String cpf = scanner.nextLine();

        System.out.print("Endereco: ");
        final String address = scanner.nextLine();

        System.out.print("Telefone: ");
        final String phone = scanner.nextLine();

        System.out.print("Plano medico: ");
        final String healthPlan = scanner.nextLine();

        System.out.print("Numero do plano medico: ");
        final String healthPlanNumber = scanner.nextLine();

        return new Patient(name, identity, cpf, address, phone, healthPlan, healthPlanNumber);
    }

    public static void searchPatient() {
        final Scanner scanner = new Scanner(System.in);
        final PatientRepository repository = PatientRepository.getInstance();

        System.out.print("ID: ");
        final int id = scanner.nextInt();

        final Patient patient = repository.getByID(id);

        if(patient == null) {
            System.out.println("Paciente nao encontrado");
            return;
        }

        System.out.println(patient);
    }

    public static void updatePatient() {
        final Scanner scanner = new Scanner(System.in);
        final PatientRepository repository = PatientRepository.getInstance();

        System.out.println("ID: ");
        Patient patient = repository.getByID(scanner.nextInt());

        if(patient == null) {
            System.out.println("Paciente nao encontrado!");
            return;
        }

        System.out.print("Nome: ");
        patient.setName(scanner.nextLine());

        System.out.print("Identidade: ");
        patient.setIdentity(scanner.nextLine());

        System.out.print("CPF: ");
        patient.setCpf(scanner.nextLine());

        System.out.print("Endereco: ");
        patient.setAddress(scanner.nextLine());

        System.out.print("Telefone: ");
        patient.setPhone(scanner.nextLine());

        System.out.print("Plano medico: ");
        patient.setHealthPlan(scanner.nextLine());

        System.out.print("Numero plano medico: ");
        patient.setHealthPlanNumber(scanner.nextLine());
    }

    public static void removePatient() {
        final Scanner scanner = new Scanner(System.in);
        final PatientRepository repository = PatientRepository.getInstance();

        System.out.println("ID: ");
        Patient patient = repository.getByID(scanner.nextInt());

        if(patient == null) {
            System.out.println("Paciente nao encontrado!");
            return;
        }

        if(!repository.remove(patient)) {
            System.out.println("Paciente nao encontrado!");
            return;
        }

        System.out.println("Paciente removido com sucesso!");
    }

    public static void listAll() {
        for(final Patient patient : PatientRepository.getInstance().getAll())
            System.out.println(patient + "\n\n");
    }

}
