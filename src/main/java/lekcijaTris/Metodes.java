package lekcijaTris;

import java.util.Scanner;

public class Metodes {

    public static void main(String[] args) {
        printInfoAboutDog();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi malu a: ");
        int vienaMala = scanner.nextInt();
        System.out.println("Ievadi malu b: ");
        int otraMala = scanner.nextInt();

        int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(vienaMala, otraMala);
        System.out.println("laukumns ir: " + aprekinataisLaukums);
        printetTaisnsturaLaukumu(3, 6);

        int kvadrataLaukums = aprekinatKvadrataLaukumu(10);
        System.out.println(kvadrataLaukums);

        printInfoAboutDog2("Lesija", 5, 15.3);
        printInfoAboutDog2("Lesija2", 15, 20.3);

        String name1 = "Lesija3";
        int age1 = 12;
        double weigth1 = 10.3;

        printInfoAboutDog2(name1, age1, weigth1);

        System.out.println("Rinka laukums ir: " + aprekinatRinkaLaukumu(3));

        printInfoAboutDog();
    }

    static double aprekinatRinkaLaukumu(int radiuss) {
        double pi = 3.141592653589793238462643;
        return pi * (radiuss * radiuss);
    }

    static int aprekinatKvadrataLaukumu(int kvadrataMala) {
        return kvadrataMala * kvadrataMala;
    }

    static void printetTaisnsturaLaukumu(int a, int b) {
        System.out.println("laukumns ir: " + (a * b));
    }

    static int aprekinatTaisnsturaLaukumu(int a, int b) {
        int laukums = a * b;
        return laukums;
    }

    static void printInfoAboutDog() {
        String dogName = "Reksis";
        int dogAge = 8;
        double dogWeight = 10.3;
        printInfoAboutDog2(dogName,dogAge,dogWeight);
    }

    static void printInfoAboutDog2(String name, int age, double weight) {
        System.out.println("############################");
        System.out.println("Mans suna vards ir: " + name);
        System.out.println("Mans suna vecums ir: " + age);
        System.out.println("Mans suna svars ir: " + weight);
        System.out.println("############################");
        System.out.println("\n");
    }

}
