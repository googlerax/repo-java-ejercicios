import java.util.Scanner;

public class Iva {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el monto");

        Double precio = sc.nextDouble();

        System.out.println("El precio del producto + IVA incluido es de: "+ iva(precio) + " pesos");

    }




    // funcion que calcula IVA
    public static Double iva(Double number){
        return number * 1.18;
    }




}

