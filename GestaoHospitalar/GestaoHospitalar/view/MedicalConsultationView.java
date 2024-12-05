package GestaoHospitalar.view;

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
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
        }
    }

}
