package ejercicios;


import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {

    public static void main(String[] args) {


        /*Crea un ArrayList de tipo String, con 4 elementos.
        *Cópialo en una LinkedList.
        * Recorre ambos mostrando únicamente el valor de cada elemento.
        * */

        //ArrayList
        ArrayList<String> list = new ArrayList<>();

        //4 elementos
        list.add("Valor 1");
        list.add("Valor 2");
        list.add("Valor 3");
        list.add("Valor 4");

        //ForEach
        for (String li:list) {
            System.out.println(li);
        }

        System.out.println();


        //LinkedList
        LinkedList<String> enlaList = new LinkedList<>(list);

        //ForEach
        for (String enla : enlaList) {
            System.out.println(enla);
        }







    }

}
