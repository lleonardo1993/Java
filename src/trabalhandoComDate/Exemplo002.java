package trabalhandoComDate;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(1623979575025l);

        Date novaData = new Date(1623979575025l);

        System.out.println(novaData);

    }
}
