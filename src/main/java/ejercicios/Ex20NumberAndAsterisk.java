package ejercicios;

import java.util.Scanner;

public class Ex20NumberAndAsterisk {
    public static void main(String[] args){
//        Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
//        número ingresado seguido de tantos asteriscos como indique su valor.

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            Integer num;
            do {
                System.out.println("Enter a number between 1 and 20.");
                num = input.nextInt();
                if(num<0 || num>20){
                    System.out.println("Wrong number");
                }
            }while(num < 0 || num > 20);
                System.out.print(num + " ");
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                System.out.println("");
        }
    }
}
