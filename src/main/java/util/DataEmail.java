package util;

import com.example.retofuncionalyreactiva.domain.Email;

import java.util.Arrays;
import java.util.List;

public class DataEmail {

    public static List<Email> getEmails(){

        return Arrays.asList(new Email("n.beltran@outlook.com", true),
                new Email("claudia.garzon@gmail.com", false),
                new Email("hdrodriguez@gmail.com.co", true),
                new Email("dlopez@outlook.com",true),
                new Email("dlopez@movistar.com",true),
                new Email("yoordanel.salamanca@outlook.com",true),
                new Email("nicolas.malagon@gmail.com",false),
                new Email("luzdary.guevara@outlook.com",false),
                new Email("luzdary.perez@outlook.com",true),
                new Email("luzdary.com",true),
                new Email("ltocora@gmail.gov.co",false),
                new Email("gestionenergiacyb@outlook.com",true),
                new Email("Claudia.Garcia@outlook.com",true),
                new Email("nydia.guio@movistar.com",false),
                new Email("nscontreras@hotmail.com",true),
                new Email("dgonzalezb@outlook.com",true),
                new Email("Claudia.Garcia",true),
                new Email("notificacionespqr@gmail.com",false),
                new Email("gerencia@claro.com",false),
                new Email("yenny.montero@hotmail.com",true),
                new Email("lcorrea@outlook.com",false),
                new Email("luzdary.guevara@outlook.com",true),
                new Email("hdrodriguez",true),
                new Email("ricardo.aragon@outlook.com",false),
                new Email("francisco.rojas@outlook.com",false),
                new Email("luis.cortes@gmail.com",true),
                new Email("coordinadorhse@enel.com",true),
                new Email("luis.rios@gmail.com",true),
                new Email("nscontreras@sofka.com",true),
                new Email("serviciospublicos@gmail.com", true));
    }

}
