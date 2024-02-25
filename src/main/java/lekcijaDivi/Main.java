package lekcijaDivi;

public class Main {
    public static void main(String[] args) {
        //        System.out.println("Lekcija Nr.2");
        //        System.out.println("Ievadi savu vārdu...");
        //        //Lietotāja ievades apstrāde
        //        Scanner skeneris =  new Scanner(System.in);
        //        String name = skeneris.nextLine();
        //        System.out.println("Labdien, " + name + "! Esiet sveicināts mūsu programmā!");
        //        System.out.println("Ievadi skaitli x...");
        //        int x = skeneris.nextInt();
        //        System.out.println("Skaitlis x veiksmīgi saglabāts. Tas ir: " + x);
        //
        //        System.out.println("Ievadi skaitli y...");
        //        int y = skeneris.nextInt();
        //        System.out.println("Skaitlis y veiksmīgi saglabāts. Tas ir: " + y);
        //
        //        System.out.println("x+y summa ir: " + (x+y));
        //        System.out.println("x-y starpiba ir: " + (x-y));
        int x = 5;
        int y = 3;
        int z = 3;

        System.out.println("X ir lielāks par Y " + (x > y));
        System.out.println("X ir mazāks par Y " + (x < y));
        System.out.println("Y ir vienāds ar Z " + (y == z));
        System.out.println("X ir vienāds ar Z " + (x == z));
        System.out.println("Y nav vienāds ar Z " + (y != z));
        System.out.println("X nav vienāds ar Z " + (x != z));

        System.out.println("Y ir lielāks vienāds par Z: " + (y >= z));
        System.out.println("X ir lielāks vienāds par y: " + (x >= y));

        //        Scanner skeneris2 = new Scanner(System.in);
        //        int a = skeneris2.nextInt();
        //        int b= skeneris2.nextInt();
        //        System.out.println(a>b);
        //        System.out.println(a<b);
        //        System.out.println(a==b);
        //        System.out.println(a!=b);

//        String name = "Juris";
//        String name2 = "Pēteris";
//        System.out.println(name.equals("Juris"));//true
//
//        System.out.println(name.equals(name2));//false
//        System.out.println(!name.equals(name2));//true

        int x1 = 5;
        System.out.println((x1 >= 5) && (x1 > 7)); //false
        System.out.println((x1 >= 5) || (x1 > 7)); //true
                            //true       //false

        int x2 = 8;
        System.out.println((x2 >= 5) && (x2 > 7)); //true
        System.out.println((x2 >= 5) || (x2 > 7)); //true
                            //true       //true

        int x3 = 10;
        System.out.println(!((x3 >= 5) && (x3 > 7)));//true
                            //true        //true
    }
}
