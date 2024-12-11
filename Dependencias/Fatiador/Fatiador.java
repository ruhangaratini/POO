package Fatiador;

public class Fatiador {
    private final IFruta fruta;

    public Fatiador(IFruta fruta) {
        this.fruta = fruta;
    }

    public void cortar() {
        System.out.println("A fruta " + this.fruta.getNome() + " foi cortada");
    }

}
