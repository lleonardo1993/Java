package trabalhandoComDate.DateFormat;

import java.time.LocalDate;

public class Exemplo006 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);

        System.out.println(ontem);
    }
}
