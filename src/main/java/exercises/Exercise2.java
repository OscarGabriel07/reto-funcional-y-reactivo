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
