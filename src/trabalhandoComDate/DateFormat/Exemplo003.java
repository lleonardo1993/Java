package trabalhandoComDate.DateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo003 {

    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getDateInstance().format(agora);

        System.out.println(dateToStr);
        //18 de jun de 2021

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);

        System.out.println(dateToStr);
        //18 de junho de 2021 19:17
    }
}
