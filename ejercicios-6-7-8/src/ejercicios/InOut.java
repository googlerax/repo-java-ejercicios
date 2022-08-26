package ejercicios;

import java.io.*;
import java.util.Scanner;


public class InOut {
    public static void main(String[] args) {

        /*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
         La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");

        //Nombre del archivo con su extension
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");

        //Nombre del archivo con su extension, si no existe se creara uno.
        String fileOut = scanner.nextLine();

        //Invocacion del metodo.
        copy(fileIn, fileOut);
    }


    private static void copy(String copia, String pega) {
        try {
            InputStream in = new FileInputStream(copia);
            byte[] b = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(pega);
            out.write(b);
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}


