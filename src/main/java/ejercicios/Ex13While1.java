package ejercicios;

import java.util.Scanner;

public class Ex13While1 {
    public static void main(String[] args){

//        Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//        la nota se pedirá de nuevo hasta que la nota sea correcta.

        Scanner input = new Scanner(System.in);
        Integer option;
        do {
        System.out.println("Please, enter a correct note value.");
        option = input.nextInt();
            if(option<0 || option>10){
                System.out.println("Incorrect value. Try again");
            }
        }while (option<0 || option>10);

    }
}
