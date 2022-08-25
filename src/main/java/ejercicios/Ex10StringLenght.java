package ejercicios;

import java.util.Scanner;

public class Ex10StringLenght {
    public static void main(String[] args){
//        Realizar un programa que solo permita introducir solo frases o palabras de 8 de
//        largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
//        un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//        imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a phrase.");
        String phrase = input.nextLine();

        if(phrase.length()==8){
            System.out.println("THAT'S CORRECT!");
        }
        else{
            System.out.println("That's incorrect.");
        }
    }
}
