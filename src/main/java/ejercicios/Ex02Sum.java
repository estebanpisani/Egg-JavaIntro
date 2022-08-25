package ejercicios;

import java.util.Scanner;

public class Ex02Sum {
    public static void main(String[] args){
//        Escribir un programa que pida dos números enteros por teclado y calcule la suma
//        de los dos. El programa deberá después mostrar el resultado de la suma

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter an integer number to add");
        Integer num1 = input.nextInt();
        System.out.println("Please, enter a second integer number to add");
        Integer num2 = input.nextInt();
        System.out.println("The result of adding "+num1+" to "+num2+" is:");
        System.out.println(num1+num2);
    }

}
