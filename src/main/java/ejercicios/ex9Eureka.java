package ejercicios;

import java.util.Scanner;

public class ex9Eureka {
    public static void main(String[] args){
//        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//        investigar la función equals() en Java.

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a phrase.");
        String phrase = input.nextLine();

        if(phrase.equalsIgnoreCase("eureka")){
            System.out.println("THAT'S CORRECT!");
        }
        else{
            System.out.println("That's incorrect.");
        }
    }
}
