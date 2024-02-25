package lekcijaCetri;

import java.util.ArrayList;

public class LekcijaCetri {

    public static void main(String[] args) {
        //masīvs ar 3 elementiem
        String[] cars = {"VW","AUDI","BMW"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        cars[0]="MAZDA";

        for (String car : cars) {
            System.out.println(car);
        }

        //arraylist ar 3 elementiem
        ArrayList<String> cars2 = new ArrayList<>();
        ArrayList<Integer> majuNumuri = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();

        cars2.add("MERCEDES");
        cars2.add("Bentley");
        cars2.add("HONDA");

        System.out.println("VAI SARAKSTS SATUR VARDU HONDA? " + cars2.contains("HONDA"));
        System.out.println("VAI SARAKSTS SATUR VARDU VOLVO? " + cars2.contains("VOLVO"));

        System.out.println(cars2.get(0));
        System.out.println(cars2.get(1));
        System.out.println(cars2.get(2));

        System.out.println("FOR CIKLS");
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }

        System.out.println("FOR EACH CIKLS");
        for (String s : cars2) {
            System.out.println(s);
        }

        cars2.remove(0);

        System.out.println("FOR EACH CIKLS ar REMOVE 0");
        for (String s : cars2) {
            System.out.println(s);
        }

        System.out.println(cars2.get(0));

        cars2.set(0,"VOLVO");

        System.out.println("FOR EACH CIKLS ar set 0");
        for (String s : cars2) {
            System.out.println(s);
        }

        cars2.remove("HONDA");


        System.out.println("FOR EACH CIKLS ar delete HONDA");
        for (String s : cars2) {
            System.out.println(s);
        }
//        cars2.add("test");
//        cars2.remove(0);
//        cars2.set(1,"12312312");
//        cars2.get(0);

    }
}
