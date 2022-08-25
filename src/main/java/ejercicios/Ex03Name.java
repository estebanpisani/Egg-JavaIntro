package ejercicios;

import java.util.Scanner;

public class Ex03Name {
    public static void main(String[] args){
//        Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//        por pantalla.
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your name");
        String name = input.nextLine();
        System.out.println("Your name is: "+name);
    }
}
