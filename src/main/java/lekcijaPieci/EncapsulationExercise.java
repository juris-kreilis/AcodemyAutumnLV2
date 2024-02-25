package lekcijaPieci;

import java.util.Scanner;

public class EncapsulationExercise {
    public static void main(String[] args) throws Exception {
        Person cilveks = new Person(1);
//        cilveks.setAge(-1);
        cilveks.name = "asdas";
        cilveks.height = 180;
        System.out.println("Vecums: " + cilveks.getAge());

        Car mansAuto = new Car();
        mansAuto.move();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.move();

        Scanner scanner = new Scanner(System.in);


    }
}
