package lekcijaCetri;

import java.util.ArrayList;

public class DarbibaArKlasem {
    public static void main(String[] args) {
        Dog mansSuns = new Dog("Reksis", 5, 13.3, "VAS");
        mansSuns.kepuSkaits=4;
        System.out.println("Kepu skaits manam sunim "+mansSuns.kepuSkaits);

        mansSuns.makeSound();
        mansSuns.printDog();

        Dog kaiminaSuns = new Dog();
        kaiminaSuns.kepuSkaits = 3;
        kaiminaSuns.setName("Fido");
        kaiminaSuns.setAge(8);
        kaiminaSuns.setWeight(13.3);
        kaiminaSuns.setBreed("Dalmācietis");

        System.out.println(kaiminaSuns.getName());
        System.out.println("Kepu skaits kaimina sunim "+kaiminaSuns.kepuSkaits);
        System.out.println("Kepu skaits manam sunim "+mansSuns.kepuSkaits);
        kaiminaSuns.printDog();
        kaiminaSuns.makeSound();

        Home manaMaja = new Home();
        manaMaja.ielasNosaukums = "Brīvības iela";
        manaMaja.majasNumurs = 100;
        manaMaja.printAddress();

        ArrayList<String> materiali = new ArrayList<>();
        materiali.add("Parkets");
        materiali.add("Flīzes");

        manaMaja.apdaresMateriali = materiali;

        Velosipeds velosipeds = new Velosipeds();

        Circle rinkis1 = new Circle(25);
        System.out.println("Rinka laukums ir " + rinkis1.calculateArea());
        System.out.println("Rinka diametrs ir " + rinkis1.calculateDiameter());

        Circle rinkis2 = new Circle(32);
        System.out.println("Rinka laukums ir " + rinkis2.calculateArea());
        System.out.println("Rinka diametrs ir " + rinkis2.calculateDiameter());

    }
}
