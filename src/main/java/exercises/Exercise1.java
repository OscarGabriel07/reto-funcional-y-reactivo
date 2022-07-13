package exercises;

import com.example.retofuncionalyreactiva.domain.Email;
import util.DataEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    List<Email> emails = DataEmail.getEmails();

    public void distinct(){
        System.out.println("Ejercicio 1: ");
        System.out.println("Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:");
        System.out.println("a.) Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos");

        emails.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void filter(){
        System.out.println("Ejercicio 1: ");
        System.out.println("Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:");
        System.out.println("b.) Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.");

        emails.stream()
                .map(email -> email.getEmailValue().toLowerCase())
                .filter(email -> email.contains("gmail") || email.contains("hotmail ") || email.contains("outlook"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void map(){
        System.out.println("Ejercicio 1: ");
        System.out.println("Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:");
        System.out.println("c.) Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)");

        emails.stream()
                .filter(email -> email.getEmailValue().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                .map(email -> email.getEmailValue().toLowerCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void cantidadCorreos(){
        System.out.println("Ejercicio 1: ");
        System.out.println("Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:");
        System.out.println("d.) Saber la cantidad de correos que hay, sin usar un ciclo");

        System.out.println("Cantidad Correos Válidos: " + emails.stream()
                .filter(email -> email.getEmailValue().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                .count());
    }

    public void cantidadCorreosGmailHotmailOutlook(){
        System.out.println("Ejercicio 1: ");
        System.out.println("Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:");
        System.out.println("e.) Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo");

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
        System.out.println("Ejercicio 1: ");
        System.out.println("Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:");
        System.out.println("En la misma lista determinar si se envió un correo o no a cada uno de los correos, si se le envió cambiar el estado en la lista, todo esto respetando la inmutabilidad.");

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
