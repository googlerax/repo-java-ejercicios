package ejercicios;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {


        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
         *recórrelo y elimina los numeros pares.
         * Por último, vuelve a recorrerlo y muestra el ArrayList final.
         * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
         */


        //ArrayList
        ArrayList<Integer> enteros = new ArrayList<>();


        //Relleno con bucle for:
        for (int i = 0; i < 11; i++) {
            enteros.add(i);
        }

        System.out.println();


        // for remove num pares:
        for (int i = 0; i < enteros.size(); i++) {
            if (enteros.get(i) % 2 == 0) {
                enteros.remove(i);
            }

        }


        //for definitivo:
        for (int defi:enteros) {
            System.out.println("Valor: " + defi);
        }


    }
}
