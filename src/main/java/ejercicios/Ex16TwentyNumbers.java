package ejercicios;

import java.util.Scanner;

public class Ex16TwentyNumbers {
    public static void main(String[] args){
//        Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//        salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//        deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//        número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

        Scanner input = new Scanner(System.in);

        Integer sum = 0;
        Integer num;
        Integer count = 0;

        do {
            System.out.println("Enter a number:");
            num = input.nextInt();
            if(num==0){
                break;
            } else if (num>0) {
                sum += num;
                System.out.println("Number added");
            }
            count += 1;
        }while(count<20);
        System.out.println("The final value is: "+sum);
    }
}
