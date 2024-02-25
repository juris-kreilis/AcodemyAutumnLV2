package lekcijaTris;

import lekcijaPieci.Person;

public class Cikli {
    public static void main(String[] args) throws Exception {

        Person persona = new Person(5);
        //persona.name

        int i = 0; //iterators

        while (i < 5) {
            System.out.println("Print i: " + i);
            printNameSurname();
            i = i + 1;
            //            i++;
        }

        int a = 0;
        while (a < 3) {
            System.out.println("A vertiba ir: " + a);
            a = a + 2;
        }

        for (int j = 0; j <= 10; j++) {
            System.out.println("Cikls izpildas " + j + " reizi");
        }

    }

    static void printNameSurname() {
        System.out.println("===========");
        System.out.println("Juris");
        System.out.println("Kreilis");
        System.out.println("===========");
    }
}
