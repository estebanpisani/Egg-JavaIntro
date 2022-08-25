package ejercicios;

import java.util.Scanner;

public class Ej03Nombre {
    public static void main(String[] args){

//        Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//        por pantalla.
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String name = input.nextLine();
        System.out.println("Su nombre es "+name);
    }
}
