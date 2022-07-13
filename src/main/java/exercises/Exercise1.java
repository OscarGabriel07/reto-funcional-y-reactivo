package exercises;

import util.DataEmail;

import java.util.List;
import java.util.regex.Pattern;
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

    public void map(){
        emails.stream()
                .filter(email -> email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                .map(email -> email.toLowerCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void cantidadCorreos(){
        System.out.println(emails.stream()
                .filter(email -> email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                .count());
    }

    public void catidadCorreosGmailHotmailOutlook(){
        System.out.println("Cantidad Correos Gmail: " + emails.stream()
                .map(email -> email.toLowerCase())
                .filter(email -> email.contains("gmail"))
                .count());

        System.out.println("Cantidad Correos Hotmail: " + emails.stream()
                .map(email -> email.toLowerCase())
                .filter(email -> email.contains("hotmail"))
                .count());

        System.out.println("Cantidad Correos Outlook: " + emails.stream()
                .map(email -> email.toLowerCase())
                .filter(email -> email.contains("outlook"))
                .count());
    }

}
