package trabalhandoComDate.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo004 {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(agora);

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
