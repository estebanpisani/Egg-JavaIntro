package ejercicios;

import java.util.Scanner;

public class Ex15Calculator {
    public static void main(String[] args){
//        Realizar un programa que pida dos números enteros positivos por teclado y
//        muestre por pantalla el siguiente menú:
        // 1. Sumar
        //2. Restar
        //3. Multiplicar
        //4. Dividir
        //5. Salir
        //Elija opción:

//        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
//        del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
//        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
//        carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

        Scanner input = new Scanner(System.in);
        Integer num1;
        Integer num2;
        Integer opt;
        Boolean confirm = false;

        do{
            System.out.println("Enter a positive integer number");
            num1 = input.nextInt();
            System.out.println("Enter a new positive integer number");
            num2 = input.nextInt();
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiplicate");
            System.out.println("4 - Divide");
            System.out.println("5 - Quit");
            System.out.println("Choose an option:");
            opt = input.nextInt();
            switch (opt){
                case 1:
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println(num1*num2);
                    break;
                case 4:
                    System.out.println(num1/num2);
                    break;
                case 5:
                    System.out.println("Are you sure?");
                    String quit = input.nextLine();
                    if(quit.equalsIgnoreCase("s")){
                        confirm = true;
                    }
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }

        }while(confirm=false);

    }
}
