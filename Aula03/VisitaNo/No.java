package VisitaNo;

public class No {
    String nome = "";
    No no;

    public void setNo(No no) {
        this.no = no;
    }

    public No getNo() {
        return this.no;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

