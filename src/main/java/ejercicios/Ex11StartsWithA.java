package ejercicios;

import java.util.Scanner;

public class Ex11StartsWithA {
    public static void main(String[] args){
//        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
//        frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
//        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//        “INCORRECTO”. Nota: investigar la función Substring y equals() de Java

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a phrase.");
        String phrase = input.nextLine();

        if(phrase.substring(0,1).equals("A")){
            System.out.println("THAT'S CORRECT!");
        }
        else{
            System.out.println("That's incorrect.");
        }
    }
}
