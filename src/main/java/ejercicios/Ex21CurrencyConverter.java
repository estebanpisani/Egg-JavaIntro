package ejercicios;

import java.util.Scanner;

public class Ex21CurrencyConverter {

    public static void main(String[] args){
//        Crea una aplicación que a través de una función nos convierta una cantidad de
//        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
//        libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
//        converir que será una cadena, este no devolverá ningún valor y mostrará un
//        mensaje indicando el cambio (void).
        Scanner input = new Scanner(System.in);
        runConverter(input);

    }

    public static void runConverter(Scanner input){
        System.out.println("Running...");
        String currency;
        Integer opt;
        System.out.println("Enter the euro amount");
        Double euro = input.nextDouble();
        System.out.println("1 - Dollar");
        System.out.println("2 - Yen");
        System.out.println("3 - Pound");

        do {
            System.out.println("Select option:");
            opt = input.nextInt();
            if(opt<1 || opt>3){
                System.out.println("Wrong selection");
            }
        } while (opt<1 || opt>3);

        switch (opt){
            case 1:
                currency="Dollar";
                break;
            case 2:
                currency="Yen";
                break;
            case 3:
                currency="Pound";
                break;
            default:
                currency="";
                break;
        }

        Ex21CurrencyConverter.currencyConverter(euro, currency);
    }
    public static void currencyConverter(Double amount, String currency){
        Double product = 1.0;
        if(currency.equals("Dollar")){
            product = 1.28611;
        } else if (currency.equals("Yen")){
            product = 129.852;
        } else if (currency.equals("Pound")){
            product = 0.86;
        }
        System.out.print(amount+" EUR to "+currency+" = "+amount*product);
    }
}
