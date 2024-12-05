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

            InterfaceUtil.pressEnterToContinue();
        }
    }

    public static Doctor registerDoctor() {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        final String name = scanner.next();

        System.out.print("Identidade: ");
        final String identity = scanner.next();

        System.out.print("CPF: ");
        final String cpf = scanner.next();

        System.out.print("Endereco: ");
        final String address = scanner.next();

        System.out.print("Telefone: ");
        final String phone = scanner.next();

        System.out.print("CRM: ");
        final String crm = scanner.next();

        System.out.print("Especialidade: ");
        final String speciality = scanner.next();

        System.out.print("CTPS: ");
        final String ctps = scanner.next();

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
    }

    public static void removeDoctor() {
        final Scanner scanner = new Scanner(System.in);
        final DoctorRepository repository = DoctorRepository.getInstance();
    }

    public static void listAll() {
        for(final Doctor doctor : DoctorRepository.getInstance().getAll())
            System.out.println(doctor);
    }

}
