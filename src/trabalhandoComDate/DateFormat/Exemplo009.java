package trabalhandoComDate.DateFormat;

import java.time.LocalDateTime;

    public class Exemplo009 {

        public static void main(String[] args) {

            LocalDateTime agora = LocalDateTime.now();

            System.out.println(agora);


            LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusHours(12).plusMinutes(2);

            System.out.println(futuro);
           //2021-06-18T20:55:40.621558800
            //2021-06-21T09:55:40.621558800

        }
    }

