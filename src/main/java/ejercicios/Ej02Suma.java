package ejercicios;

import java.util.Scanner;

public class Ej02Suma {
    public static void main(String[] args){
//        Escribir un programa que pida dos números enteros por teclado y calcule la suma
//        de los dos. El programa deberá después mostrar el resultado de la suma

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero a sumar");
        Integer num1 = input.nextInt();
        System.out.println("Ingrese un segundo número entero a sumar");
        Integer num2 = input.nextInt();
        System.out.println("El resultado de la suma entre "+num1+" y "+num2+" es:");
        System.out.println(num1+num2);
    }

}
