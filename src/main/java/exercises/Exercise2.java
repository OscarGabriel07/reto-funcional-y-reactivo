package exercises;

import reactor.core.publisher.Flux;
import util.DataVulgarWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    List<String> vulgarWords = DataVulgarWord.getDataVulgarsWords();

    public void showMessage(){

    }

    public void chat(){
        System.out.println("Programación Reactiva");
        System.out.println("Crear un chat, un input donde lo que se ingrese sea almacenado " +
                "en una lista, para posteriormente cambiar en la lista las malas palabras, " +
                "para sos y compararlas con la lista del chat y si se encuentra una reemplazarla " +
                "por: **** , todo esto respetando los principios de la programación reactiva.");

        Scanner read = new Scanner(System.in);
        System.out.println("Escribir el mensaje: ");
        String message = read.nextLine();
        List<String> wordsMessage = Arrays.stream(message.split(" ")).toList();
        Flux.fromIterable(wordsMessage)
                .map(wordMessage -> {
                    if(vulgarWords.contains(wordMessage)){
                        wordMessage = "****";
                    }
                    return wordMessage;
                }).reduce("", (x, y) -> x += " " + y)
                .subscribe(System.out::println);
    }

}
