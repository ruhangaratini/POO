package Exercise;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(2, "blue");
        Circle c2 = new Circle(2);
        Circle c3 = new Circle();

//      Não é possível alterar o valor de um atributo privado de fora da instância
        c2.color = "yellow";

//      É possível armazenar os círculos em vetores e matrizes pois se tratam de um endereço de memória (ponteiro)
        Circle[] circles = {c1, c2, c3};

        for(Circle c : circles) {
            c.print();
        }
    }
}
