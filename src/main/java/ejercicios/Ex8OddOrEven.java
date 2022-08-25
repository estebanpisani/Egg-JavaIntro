package ejercicios;

import java.util.Scanner;

public class Ex8OddOrEven {
    public static void main(String[] args){
        //Crear un programa que dado un numero determine si es par o impar.
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter an integer number.");
        Integer num1 = input.nextInt();

        if(num1%2==0){
            System.out.println(num1+" is an even number");
        }
        else{
            System.out.println(num1+" is an odd number");
        }
    }
}
