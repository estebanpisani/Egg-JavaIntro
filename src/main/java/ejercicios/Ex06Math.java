package ejercicios;

import java.util.Scanner;

public class Ex06Math {
    public static void main(String[] args){
//        Escribir un programa que lea un número entero por teclado y muestre por pantalla
//        el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//        Math.sqrt().

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter an integer number.");
        Integer num = input.nextInt();
        System.out.println("Double of "+num+": "+num*2);
        System.out.println("Triple of "+num+": "+num*3);
        System.out.println("Square of "+num+": "+Math.sqrt(num));
    }
}
