package VisitaSala;

public class Sala {
    private String nome;
    protected Sala norte, leste, sul, oeste;

    public Sala(String nome) {
        this.nome = nome;
    }

    public void setSalaNorte(Sala sala) {
        this.norte = sala;
        sala.sul = this;
    }

    public void setSalaLeste(Sala sala) {
        this.leste = sala;
        sala.oeste = this;
    }

    public void setSalaSul(Sala sala) {
        this.sul = sala;
        sala.norte = this;
    }

    public void setSalaOeste(Sala sala) {
        this.oeste = sala;
        sala.leste = this;
    }

    public Sala getSala(String direcao){
        return switch (direcao) {
            case "Norte" -> this.norte;
            case "Leste" -> this.leste;
            case "Sul" -> this.sul;
            case "Oeste" -> this.oeste;
            default -> null;
        };
    }

    @Override
    public String toString() {
        return this.nome;
    }
}