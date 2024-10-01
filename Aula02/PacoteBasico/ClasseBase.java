package PacoteBasico;

public class ClasseBase {

    public static void main(String[] args) {
        JavaoPrimeiro jp = new JavaoPrimeiro();

        jp.setNome("Joao");

        System.out.println(jp.getNome());

        // jp = null;

        // System.out.println(jp);

        JavaoPrimeiro jc = new JavaoPrimeiro("Maria");

        jp = jc;

        jp.setNome("Claudia");

        System.out.println(jc.getNome());
    }

}
