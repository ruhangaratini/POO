package VisitaNo;

public class VisitaNo {

    public static void main(String[] args) {
        No no1 = new No();
        no1.setNome("1");

        No no2 = new No();
        no2.setNome("2");

        No no3 = new No();
        no3.setNome("3");

        No no4 = new No();
        no4.setNome("4");

        no1.setNo(no2);
        no2.setNo(no3);
        no3.setNo(no4);
        no4.setNo(no1);

        Navegador nav = new Navegador();
        nav.setNo(no1);

        System.out.println(nav.proximo());
        System.out.println(nav.proximo());
        System.out.println(nav.proximo());
        System.out.println(nav.proximo());
    }

}
