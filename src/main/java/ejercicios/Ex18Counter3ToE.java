package ejercicios;

public class Ex18Counter3ToE {
    public static void main(String[] args){
//        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
//        del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
//        por una E

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j< 10; j++){
                for (int k = 0; k<10; k++){
                    String i1="";
                    i1 = String.valueOf(i);
                    String j1 = "";
                    String k1 = "";

                    if(k==3){
                        k1 = "E";
                    }else {
                        k1 = String.valueOf(k);
                    }

                    if(j==3){
                        j1 = "E";
                    } else {
                        j1 = String.valueOf(j);
                    }

                    if(i==3){
                        i1="E";
                    } else {
                        i1 = String.valueOf(i);
                    }

                    System.out.println(i1+"-"+j1+"-"+k1);
                }
            }
        }
    }
}
