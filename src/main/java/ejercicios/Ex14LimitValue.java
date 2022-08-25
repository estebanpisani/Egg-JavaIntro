package ejercicios;

import java.util.Scanner;

public class Ex14LimitValue {
    public static void main(String[] args){
//    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//    solicite números al usuario hasta que la suma de los números introducidos supere
//    el límite inicial

    Scanner input = new Scanner(System.in);
    System.out.println("Please, enter a limit  value.");
    Integer limit = input.nextInt();
    Integer sum = 0;

        do {
        System.out.println("Please, enter a value.");
        sum += input.nextInt();
        }while (sum<limit);

}


}
