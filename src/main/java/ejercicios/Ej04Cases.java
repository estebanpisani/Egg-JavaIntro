package ejercicios;

import java.util.Scanner;

public class Ej04Cases {

    public static void main(String[] args){
//        Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//        después toda en minúsculas.

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a phrase");
        String phrase = input.nextLine();
        System.out.println("Uppercase: "+phrase.toUpperCase());
        System.out.println("Lowercase: "+phrase.toLowerCase());
    }
}
