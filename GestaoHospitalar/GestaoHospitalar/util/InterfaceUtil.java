package GestaoHospitalar.util;

import java.util.Scanner;

public class InterfaceUtil {

    public static void clear() {
        for(int i = 0; i < 20; i++)
            System.out.println();
    }

    public static void pressEnterToContinue() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("\nPressione Enter para continuar....");
        scanner.nextLine();
        clear();
    }

}
