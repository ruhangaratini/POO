package GestaoHospitalar.view;

import GestaoHospitalar.model.Doctor;
import GestaoHospitalar.repository.DoctorRepository;
import GestaoHospitalar.util.InterfaceUtil;

import java.util.Scanner;

public class DoctorView {

    public static void showMenu() {
        final Scanner scanner = new Scanner(System.in);
        final DoctorRepository repository = DoctorRepository.getInstance();
        String input = "";

        while(!input.equals("6")) {
            System.out.println("\n----- Medicos -----");
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
                    repository.add(registerDoctor());
                    break;
                case "2":
                    searchDoctor();
                    break;
                case "3":
                    updateDoctor();
                    break;
                case "4":
                    removeDoctor();
                    break;
                case "5":
                    listAll();
                    break;
            }

            if(!input.equals("6"))
                InterfaceUtil.pressEnterToContinue();
        }
    }

    public static Doctor registerDoctor() {
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

        System.out.print("CRM: ");
        final String crm = scanner.nextLine();

        System.out.print("Especialidade: ");
        final String speciality = scanner.nextLine();

        System.out.print("CTPS: ");
        final String ctps = scanner.nextLine();

        return new Doctor(name, identity, cpf, address, phone, crm, speciality, ctps);
    }

    public static void searchDoctor() {
        final Scanner scanner = new Scanner(System.in);
        final DoctorRepository repository = DoctorRepository.getInstance();

        System.out.print("ID: ");
        final int id = scanner.nextInt();

        final Doctor doctor = repository.getByID(id);

        if(doctor == null) {
            System.out.println("Medico nao encontrado");
            return;
        }

        System.out.println(doctor);
    }

    public static void updateDoctor() {
        final Scanner scanner = new Scanner(System.in);
        final DoctorRepository repository = DoctorRepository.getInstance();

        System.out.println("ID: ");
        Doctor doctor = repository.getByID(scanner.nextInt());

        if(doctor == null) {
            System.out.println("Medico nao encontrado!");
            return;
        }

        System.out.print("Nome: ");
        doctor.setName(scanner.nextLine());

        System.out.print("Identidade: ");
        doctor.setIdentity(scanner.nextLine());

        System.out.print("CPF: ");
        doctor.setCpf(scanner.nextLine());

        System.out.print("Endereco: ");
        doctor.setAddress(scanner.nextLine());

        System.out.print("Telefone: ");
        doctor.setPhone(scanner.nextLine());

        System.out.print("CRM: ");
        doctor.setCrm(scanner.nextLine());

        System.out.print("Especialidade: ");
        doctor.setSpeciality(scanner.nextLine());

        System.out.print("CTPS: ");
        doctor.setCtps(scanner.nextLine());
    }

    public static void removeDoctor() {
        final Scanner scanner = new Scanner(System.in);
        final DoctorRepository repository = DoctorRepository.getInstance();

        System.out.println("ID: ");
        Doctor doctor = repository.getByID(scanner.nextInt());

        if(doctor == null) {
            System.out.println("Medico nao encontrado!");
            return;
        }

        if(!repository.remove(doctor)) {
            System.out.println("Medico nao encontrado!");
            return;
        }

        System.out.println("Medico removido com sucesso!");
    }

    public static void listAll() {
        for(final Doctor doctor : DoctorRepository.getInstance().getAll())
            System.out.println(doctor + "\n\n");
    }

}
