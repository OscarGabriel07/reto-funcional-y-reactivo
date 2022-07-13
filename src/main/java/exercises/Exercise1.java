package exercises;

import com.example.retofuncionalyreactiva.domain.Email;
import util.DataEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    List<Email> emails = DataEmail.getEmails();

    //Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
    public void distinct(){
        emails.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void filter(){
        emails.stream()
                .map(email -> email.getEmailValue().toLowerCase())
                .filter(email -> email.contains("gmail") || email.contains("hotmail ") || email.contains("outlook"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void map(){
        emails.stream()
                .filter(email -> email.getEmailValue().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                .map(email -> email.getEmailValue().toLowerCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void cantidadCorreos(){
        System.out.println("Cantidad Correos Válidos: " + emails.stream()
                .filter(email -> email.getEmailValue().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                .count());
    }

    public void cantidadCorreosGmailHotmailOutlook(){
        System.out.println("Cantidad Correos Válidos Gmail: " + emails.stream()
                .map(email -> email.getEmailValue().toLowerCase())
                .filter(email -> email.contains("gmail"))
                .count());

        System.out.println("Cantidad Correos Válidos Hotmail: " + emails.stream()
                .map(email -> email.getEmailValue().toLowerCase())
                .filter(email -> email.contains("hotmail"))
                .count());

        System.out.println("Cantidad Correos Válidos Outlook: " + emails.stream()
                .map(email -> email.getEmailValue().toLowerCase())
                .filter(email -> email.contains("outlook"))
                .count());
    }

    public void listChangeState(){
        List<Email> listEmailsSend = new ArrayList<>();
        emails.stream()
                .map(email -> {
                    if(email.getSend()){
                        email.setSend(false);
                    }
                    return email;
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
