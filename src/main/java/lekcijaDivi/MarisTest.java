package lekcijaDivi;

import java.util.Scanner;

public class MarisTest {

    public static void main(String[] args) {
        System.out.println("Lekcija Nr.2");
        System.out.println("Ievadi savu vārdu...");
        //lietotāja ievades apstrāde
        Scanner skeneris = new Scanner(System.in);
        String name = skeneris.nextLine();
        System.out.println("Labdien," + name + "! Esiet sveicināts mūsu programmā!");
        System.out.println("Ievadi skaitli x...");
        int x = skeneris.nextInt();
        System.out.println("Skaitlis x veiksmīgi saglabāts. Tas ir: " + x);
        int y = skeneris.nextInt();
        System.out.println("Skaitlis y veiksmīgi saglabāts. Tas ir: " + y);
        System.out.println("x+y summa ir: " + (x + y));
        System.out.println("x-y starpība ir: " + (x - y));

    }
}

