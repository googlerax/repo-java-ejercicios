package com.example;

public class EstructurasControl {

    public static void main(String[] args) {


        // array:
      String[] names = {"Griselda","Pia","Rufina","Beatriz","Daiana","Ana"};



      //bucle for:
        for (int i = 5; i < names.length; i++) {

            //uso del metodo String.join() para concatenar
            String concatenar = String.join(" ",names);
            System.out.println(concatenar);


        }






    }


}
