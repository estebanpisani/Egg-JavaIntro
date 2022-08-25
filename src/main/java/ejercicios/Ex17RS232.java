package ejercicios;

import java.util.Scanner;

public class Ex17RS232 {
    public static void main(String[] args){
//        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
//        tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
//        con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
//        carácter tiene que ser X y el último tiene que ser un O.
//                Las secuencias leídas que respeten el formato se consideran correctas, la
//        secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
//        secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//                Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
//        correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
//        se utilizan las siguientes funciones de Java Substring(), Length(), equals().

        Scanner input = new Scanner(System.in);

        Integer correct = 0;
        Integer incorrect = 0;
        String userInput;
        do{
            System.out.println("Enter the character sequence:");
            userInput = input.nextLine();
            if(userInput.length()<=5 && userInput.substring(0,1).equals("X") && userInput.substring(userInput.length()-2, userInput.length()-1).equals("0")){
                correct +=1;
            } else{
                incorrect +=1;
            }
        }while(!userInput.equals("&&&&&"));
        System.out.println("Correct inputs: "+correct);
        System.out.println("Incorrect inputs: "+incorrect);


    }
}
