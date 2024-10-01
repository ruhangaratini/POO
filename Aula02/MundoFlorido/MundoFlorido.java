package MundoFlorido;

public class MundoFlorido {

    public static void main(String[] args) {
        Petala p1 = new Petala();
        p1.setCor("Branco");

        Petala p2 = new Petala();
        p2.setCor("Amarelo");

        Petala p3 = new Petala();
        p3.setCor("Azul");

        Flor gerbera = new Flor();
//        gerbera.setP1(p1);
//        gerbera.setP2(p2);
//        gerbera.setP3(p3);

//        p1.setCor("Azul");

//        gerbera.mostrarPetala();



        Flor margarida = new Flor(
                new Petala("Branco"),
                new Petala("Roxo"),
                new Petala("Azul")
        );

        margarida.mostrarPetala();

        Flor f1 = new Flor();

        f1.adicionarPetala(new Petala("Preto"));
        f1.adicionarPetala(new Petala("Preto"));
        f1.adicionarPetala(new Petala("Preto"));

        f1.mostrarPetala();
    }

}
