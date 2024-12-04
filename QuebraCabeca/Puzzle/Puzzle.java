package Puzzle;

public class Puzzle {

    public static void main(String[] args) {
        Part[] parts = {
            new Part(
                new Border(true, true),
                new Border(false, true),
                new Border(false, true),
                new Border(true, true)
            ),
            new Part(
                new Border(true, true),
                new Border(false, true),
                new Border(false, true),
                new Border(false, true)
            ),
            new Part(
                new Border(true, true),
                new Border(true, true),
                new Border(true, false),
                new Border(false, true)
            ),
            new Part(
                new Border(false, true),
                new Border(false, true),
                new Border(false, true),
                new Border(true, true)
            ),
            new Part(
                new Border(false, true),
                new Border(false, true),
                new Border(true, false),
                new Border(false, true)
            ),
            new Part(
                new Border(true, false),
                new Border(true, true),
                new Border(true, false),
                new Border(false, true)
            ),
            new Part(
                new Border(false, true),
                new Border(false, true),
                new Border(true, true),
                new Border(true, true)
            ),
            new Part(
                new Border(true, false),
                new Border(true, false),
                new Border(true, true),
                new Border(false, true)
            ),
            new Part(
                new Border(true, false),
                new Border(true, true),
                new Border(true, true),
                new Border(true, false)
            )
        };

        boolean puzzleSolved = true;

        for(int i = 1; i < parts.length; i++) {
            boolean wasFitted = false;

            for(int j = 0; j < i; j++) {
                if(parts[j].fitting(parts[i])) {
                    wasFitted = true;
                    break;
                }
            }

            if(!wasFitted) {
                System.out.println("Não foi possível encaixar a peça " + i + 1);
                puzzleSolved = false;
                break;
            }
        }

        if(!puzzleSolved)
            return;

        System.out.println("Quebra-cabeça resolvido com sucesso");
    }

}
