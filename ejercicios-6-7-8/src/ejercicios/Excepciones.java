package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        //invocar a la funcion dividePorCero().
        dividePorCero(num1,num2);


    }

    /*Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
     Finalmente, mostraremos en cualquier caso: "Demo de código".
    * */

   static void dividePorCero(int a, int b) throws ArithmeticException {
       try{

           int resultado = a / b ;

       }catch (ArithmeticException e){
           System.out.println("Esto no se puede hacer: " + e.getClass());

       } finally {
           System.out.println("demo codigo");
       }


    }









}



