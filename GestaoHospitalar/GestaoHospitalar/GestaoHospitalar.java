package GestaoHospitalar;

import java.util.Scanner;

public class GestaoHospitalar {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("4")) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Medicos");
            System.out.println("2. Pacientes");
            System.out.println("3. Atendimentos");
            System.out.println("4. Sair");
            System.out.println("----------------\n");

            System.out.print("Opcao: ");
            input = scanner.next();
        }
    }
}
