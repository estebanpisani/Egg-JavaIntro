package ejercicios;

import java.util.Scanner;

public class Ex19AsteriskSquare {
    public static void main(String[] args){
        //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lenght of the sides");
        Integer n = input.nextInt();

        for (int i = 0; i < n ; i++) {
            if(i==0 || i==n-1){
                for (int k = 0; k < n; k++){
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }


}
