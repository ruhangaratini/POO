package Aula1;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int[][] matriz = new int[0][0];
        int aux;
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            menu();
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    matriz = criarMatriz();
                    break;
                case 2:
                    matriz = preencheMatriz(matriz);
                    break;
                case 3:
                    mostrarMatriz(matriz);
                    break;
                case 4:
                    System.out.println("Valor: ");
                    aux = leitor.nextInt();
                    matriz = multiplicarMatrizPorEscalar(matriz, aux);
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("1. Criar Matriz");
        System.out.println("2. Preencher Matriz");
        System.out.println("3. Mostrar Matriz");
        System.out.println("4. Multiplicar por Escalar");
        System.out.println("5. Sair");
        System.out.println("\nOpcao: ");
    }

    public static int[][] criarMatriz() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantidade de linhas: ");
        int linhas = leitor.nextInt();

        System.out.println("Quantidade de colunas: ");
        int colunas = leitor.nextInt();

        int[][] matriz = new int[linhas][colunas];

        return matriz;
    }

    public static int[][] preencheMatriz(int[][] matriz) {
        Scanner leitor = new Scanner(System.in);
        int[][] matrizPreenchida = new int[matriz.length][matriz[0].length];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.println("Valor posicao " + i + " " + j + ": ");
                matrizPreenchida[i][j] = leitor.nextInt();
            }
        }

        return matrizPreenchida;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicarMatrizPorEscalar(int[][] matriz, int valor) {
        int[][] novaMatriz = new int[matriz.length][matriz[0].length];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                novaMatriz[i][j] = matriz[i][j] * valor;
            }
        }

        return novaMatriz;
    }

}