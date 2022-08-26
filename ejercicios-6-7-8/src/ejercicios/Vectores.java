package ejercicios;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        /*
        * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        * Elimina el 2o y 3er elemento y muestra el resultado final.
        * */


        Vector<String> cities = new Vector<>();

        //Agrego de valores:

        cities.add("Buenos Aires");
        cities.add("Madrid");
        cities.add("Londres");
        cities.add("Washington");
        cities.add("Ciudad de Mexico");
        System.out.println(cities);


        //Eliminar el 2do y 3er valor:

        cities.remove(1);
        cities.remove(2);

        //Resultado final:
        System.out.println(cities);

        //Conclusion: Al realizar el primer remove las posiciones o los índices de los elementos se desplaza.













    }


}
