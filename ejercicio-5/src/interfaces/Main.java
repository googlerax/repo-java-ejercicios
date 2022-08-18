package interfaces;

public class Main {


    public static void main(String[] args) {

        //Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.


        CocheCRUDImpl car = new CocheCRUDImpl();

        car.delete();
        car.save();
        car.findAll();


    }


}
