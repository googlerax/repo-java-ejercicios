package ejercicios;

public class Reverse {

    public static void main(String[] args) {

        String cadena = "Botellita de jerez,todo lo que escribas sera al reves ";
        System.out.println(reverse(cadena));

    }


    /*
    * Escribe el código que devuelva una cadena al revés.
    * Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    * */



    // function con uso del metodo reverse() de la clase StringBuilder.
    public static String reverse(String texto) {
        StringBuilder str = new StringBuilder(texto);
        String reves = str.reverse().toString();


        return reves;
    }




}



