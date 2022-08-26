package ejercicios;

public class Ex22100NumsVector {

    public static void main(String[] args){
//        Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
//        los muestre por pantalla en orden descendente.

        int[] vector = new int[100];

        fillVector(vector);

        showVectorDesc(vector);

    }

    public static int[] fillVector(int[] vector){
        System.out.println("Filling vector...");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        return vector;
    }

    public static void showVectorDesc(int[] vector){
        System.out.println("Showing Vector...");
        for (int i = vector.length-1; i > -1 ; i--) {
            System.out.print(vector[i]+"-");
        }

    }

}
