package VisitaSala;

public class Personagem {
    private Sala sala;
    private String nome;

    public Personagem(String nome, Sala sala) {
        this.sala = sala;
        this.nome = nome;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return this.sala;
    }

    public Sala mover(String direcao) {
        if(this.sala.getSala(direcao) == null) {
            System.out.println("Colidiu!");
            return this.sala;
        }

        this.sala = this.sala.getSala(direcao);
        System.out.println(this.sala);
        return this.sala;
    }

    @Override
    public String toString() {
        return this.nome + ":" + sala;
    }

}
