package exercises;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Exercise3 {

    Scanner read = new Scanner(System.in);

    public void calculateDerivate(){
        System.out.println("Programación Funcional");
        System.out.println("Crear dos funciones, una para resolver derivadas y otra integrales, pero " +
                "esta se deben usar si quiero hacer la contraria, es decir, si quiero hacer " +
                "una derivada inversa o una integral inversa.");
        System.out.println("Función Cálculo Derivada");

        System.out.println("Escriba un valor para a: ");
        Integer a = Integer.parseInt(read.nextLine());
        System.out.println("Escriba un valor para b: ");
        Integer b = Integer.parseInt(read.nextLine());
        System.out.println("Escriba un valor para c: ");
        Integer c = Integer.parseInt(read.nextLine());
        System.out.println("Escriba un valor para el exponente: ");
        Integer exponente = Integer.parseInt(read.nextLine());

        BiFunction<Integer, Integer, Integer> coeficienteXExponente = (x, y) -> x * y;

        System.out.println("---------------------------------------------");
        System.out.println("Función Ingresada: ");
        System.out.println(a + "X" + "^" + exponente + " + " + b + "X" + "^" + (exponente - 1) + " + " + c + "X");
        System.out.println("---------------------------------------------");
        System.out.println("Función de Salida: ");
        System.out.println(coeficienteXExponente.apply(a, exponente) + "X" + "^" + (exponente - 1) + " + " + coeficienteXExponente.apply(b, (exponente - 1)) + "X" + "^" + (exponente - 2) + " + " + c);
    }

    public void calculateIntegral(){
        System.out.println("Programación Funcional");
        System.out.println("Crear dos funciones, una para resolver derivadas y otra integrales, pero " +
                "esta se deben usar si quiero hacer la contraria, es decir, si quiero hacer " +
                "una derivada inversa o una integral inversa.");
        System.out.println("Función Cálculo Integral");

        System.out.println("Escriba un valor para a: ");
        Integer a = Integer.parseInt(read.nextLine());
        System.out.println("Escriba un valor para el exponente: ");
        Integer exponente = Integer.parseInt(read.nextLine());

        System.out.println("Función Ingresada: ");
        System.out.println("∫" + a + "X^" + exponente + " dx");

        BiFunction<Integer, Integer, Integer> coeficienteSobreExponente = (x, y) -> x / (y + 1);

        System.out.println("Resultado: ");
        System.out.println(coeficienteSobreExponente.apply(a, exponente) + "X^" + (exponente+1) + " + C");
    }


}
