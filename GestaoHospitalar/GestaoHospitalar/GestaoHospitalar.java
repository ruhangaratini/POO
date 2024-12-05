package GestaoHospitalar;

import GestaoHospitalar.util.InterfaceUtil;
import GestaoHospitalar.view.DoctorView;
import GestaoHospitalar.view.PatientView;

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
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    DoctorView.showMenu();
                    break;
                case "2":
                    PatientView.showMenu();
                    break;
                case "3":
                    break;
            }

            if(!input.equals("4"))
                InterfaceUtil.pressEnterToContinue();
        }
    }
}
