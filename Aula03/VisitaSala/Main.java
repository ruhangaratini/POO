package VisitaSala;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action = 0;
        String[] direcoes = {"Norte", "Leste", "Sul", "Oeste"};
        Random r = new Random();

        Sala sala1 = new Sala("A");
        Sala sala2 = new Sala("B");
        Sala sala3 = new Sala("C");
        Sala sala4 = new Sala("D");
        Sala sala5 = new Sala("E");

        sala1.setSalaNorte(sala2);
        sala1.setSalaLeste(sala3);
        sala1.setSalaSul(sala4);
        sala1.setSalaOeste(sala5);

        Personagem pikachu = new Personagem("Pikachu", sala1);


        while(action != 5) {
            System.out.println("1 - Norte\n2 - Leste\n3 - Sul\n4 - Oeste\n5 - Sair\n");
            action = scanner.nextInt();

            if(action < 5)
                pikachu.mover(direcoes[action - 1]);
            else if(action > 6)
                pikachu.mover(direcoes[r.nextInt(4)]);
        }
    }

}

