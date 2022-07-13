package exercises;

import util.DataEmail;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    List<String> emails = DataEmail.getEmails();

    //Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
    public void distinct(){
        emails.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void filter(){
        emails.stream()
                .map(email -> email.toLowerCase())
                .filter(email -> email.contains("gmail") || email.contains("hotmail ") || email.contains("outlook"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
