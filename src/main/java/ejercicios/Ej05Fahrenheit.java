package ejercicios;

import java.util.Scanner;

public class Ej05Fahrenheit {
    public static void main(String[] args){
//        Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//        grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a degrees Celsius amount to convert in Fahrenheit degrees");
        Double celsius = input.nextDouble();
        System.out.println(celsius+" degrees Celsius are equivalent to "+(32+(9*celsius/5))+" degrees Fahrenheit.");
    }
}
