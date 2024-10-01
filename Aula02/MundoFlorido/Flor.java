package MundoFlorido;

public class Flor {
    //    Petala p1;
//    Petala p2;
//    Petala p3;
    private Petala[] petalas = new Petala[3];
    private int index = 0;

    public Flor() {
    }

    public Flor(Petala p1, Petala p2, Petala p3) {
//        this.p1 = p1;
//        this.p2 = p2;
//        this.p3 = p3;
//        this.petalas[0] = p1;
//        this.petalas[1] = p2;
//        this.petalas[2] = p3;
//        this.index = 3;
        this.adicionarPetala(p1);
        this.adicionarPetala(p2);
        this.adicionarPetala(p3);
    }

    public void adicionarPetala(Petala p) {
        petalas[this.index] = p;
        this.index++;
    }

    //    public void setP1(Petala p) {
//        this.p1 = p;
//    }
//
//    public Petala getP1() {
//        return this.p1;
//    }
//
//    public void setP2(Petala p) {
//        this.p2 = p;
//    }
//
//    public Petala getP2() {
//        return this.p2;
//    }
//
//    public void setP3(Petala p) {
//        this.p3 = p;
//    }
//
//    public Petala getP3() {
//        return this.p3;
//    }
//
    public void mostrarPetala() {
//        System.out.println(this.p1.getCor());
//        System.out.println(this.p2.getCor());
//        System.out.println(this.p3.getCor());
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.petalas[i].getCor());
        }
    }

    ;
}
