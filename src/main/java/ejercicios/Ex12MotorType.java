package ejercicios;

import java.util.Scanner;

public class Ex12MotorType {
    public static void main(String[] args){

//        Considera que estás desarrollando una web para una empresa que fabrica motores
//        (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
//        Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
//        El programa debe mostrar lo siguiente:

//        - Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
//        bomba de agua”.
//        - Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
//        bomba de gasolina”.
//        - Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
//        bomba de hormigón”.
//        - Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
//        bomba de pasta alimenticia”.
//        - Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
//        existe un valor válido para tipo de bomba”

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter an option for motor types (1-4).");
        Integer option = input.nextInt();
        String motorType;

        switch (option){
            case 1:
                motorType = "water pump";
                break;
            case 2:
                motorType = "gasoline pump";
                break;
            case 3:
                motorType = "concrete pump";
                break;
            case 4:
                motorType = "food paste pump";
                break;
            default:
                motorType = "";
                break;
        }

        System.out.println("The pump type selected is: "+motorType);

    }
}
