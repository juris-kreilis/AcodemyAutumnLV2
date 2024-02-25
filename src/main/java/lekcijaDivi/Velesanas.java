package lekcijaDivi;

import java.util.Scanner;

public class Velesanas {
    public static void main(String[] args) {
        System.out.println("programmas sākums");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vecumu...");
        int vecums = scanner.nextInt();

        if (vecums >= 18) {
            System.out.println("Drīkst balsot!!!");
            System.out.println("Drīkst balsot!!!");
            if (vecums > 90) {
                System.out.println("Jāveic veselības pārbaude");
            }
            System.out.println("Drīkst balsot!!!");
            System.out.println("Drīkst balsot!!!");
            System.out.println("Drīkst balsot!!!");
        }

        if (vecums < 7) {
            System.out.println("Nav jāiet skolā");
        }

        System.out.println("programmas beigas");
    }
}
