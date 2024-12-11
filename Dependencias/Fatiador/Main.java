package Fatiador;

public class Main {

    public static void main(String[] args) {
        final Manga manga = new Manga();
        final Laranja laranja = new Laranja();

        final Fatiador fatiador = new Fatiador(manga);

        fatiador.cortar();
    }

}
