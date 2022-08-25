package ejercicios;

import java.util.Scanner;

public class Ex07GreaterNumber {
    public static void main(String[] args){
//        Implementar un programa que dado dos números enteros determine cuál es el
//        mayor y lo muestre por pantalla.

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter an integer number.");
        Integer num1 = input.nextInt();
        System.out.println("Please, enter a second integer number to compare with "+num1+".");
        Integer num2 = input.nextInt();

        if(num1>num2){
            System.out.println("The greater number is "+num1);
        }
        else if(num2>num1){
            System.out.println("The greater number is "+num2);
        }
        else{
            System.out.println("The numbers have the same value.");
        }
    }
}
