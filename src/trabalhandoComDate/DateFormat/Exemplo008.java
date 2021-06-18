package trabalhandoComDate.DateFormat;

import java.time.LocalTime;

public class Exemplo008 {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        //20:40:28.619395200
        //20:43:38.024228600

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        //21:43:38.024228600
    }
}