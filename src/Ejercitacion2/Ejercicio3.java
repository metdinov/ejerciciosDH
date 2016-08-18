package Ejercitacion2;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio3 {

    public Double promedio(Integer[] unArrayDeEnteros){
        //Comenzar a escribir código acá
        Double suma = 0.0;
        Double promedio = 0.0;

        for (Integer i = 0 ; i < unArrayDeEnteros.length;i++){
            suma = suma  + unArrayDeEnteros[i];
        }

        promedio = suma / unArrayDeEnteros.length;
        return promedio;
    }






    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio3 ejercicio3 = new Ejercicio3();
        //Test 1
        System.out.println(ejercicio3.promedio(new Integer[]{1,3,5,4}));
        //Test 2
        System.out.println(ejercicio3.promedio(new Integer[]{2,4,3,7}));
        //Test 3
        System.out.println(ejercicio3.promedio(new Integer[]{4,7,5,6}));
    }
}

