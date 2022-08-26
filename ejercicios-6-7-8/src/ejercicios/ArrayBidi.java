package ejercicios;

public class ArrayBidi {

    public static void main(String[] args) {

        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        // Array bidimensional o matriz:
        int enteros [][] = {
                {36,54,12,40},
                {10,4,500,78},

                {74,12,7,96},
                {101,107,7,8}
        };

        // Número de filas:
        int numFilas = enteros.length;
        System.out.println(numFilas + " Filas.");

        //Numero de columnas:
        int numColumnas = enteros[0].length;
        System.out.println(numColumnas + " Columnas.");


        //Recorrer la matriz:

        //Primera dimension
        for (int i = 0; i < enteros.length; i++) {
            //Segunda dimension
            for (int j = 0; j <enteros[i].length ; j++) {

                System.out.println(i+"/"+ j + " Valor de " + enteros[i][j]);
            }
        }


    }

}
