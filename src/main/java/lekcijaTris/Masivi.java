package lekcijaTris;

public class Masivi {
    public static void main(String[] args) {
        String pietura = "Centrala Stacija";
        String pietura1 = "Marijas iela";
        String pietura2 = "Lacplesa iela";
        //0                     //1             //2             //3
        String[] pieturas = {"Centrala Stacija", "Marijas iela", "Lacplesa iela", "Matisa iela","Jauna pietura","sestā pietura"};
        int garums = pieturas.length;

        pieturas[5] = "";



        for (String s : pieturas) {
            System.out.println("pietura " + s);
        }



        System.out.println("Masīva pieturas garums ir : " + garums);

        String[] pieturas2 = {"Centrala Stacija", "Marijas iela", "Lacplesa iela", "Matisa iela", "Matisa iela", "Matisa iela"};
        //        System.out.println(pieturas[0]);
        //        System.out.println(pieturas[1]);
        //        System.out.println(pieturas[2]);
        //        System.out.println(pieturas[3]);

        for (int i = 0; i < pieturas.length; i++) {
            System.out.println("Pieturas:" + pieturas[i]);
        }

        int[] majuNumuri = {1, 3, 5, 7, 9, 11};

        for (int juris : majuNumuri) {
            System.out.println("maju numuri " + juris);
        }

        System.out.println(majuNumuri[5]);

        String[] autoMarkas = new String[3];
        autoMarkas[0] = "BMW";
        autoMarkas[1] = "AUDI";
        autoMarkas[2] = "MERCEDES";

        System.out.println(autoMarkas[1]);

        int[] dienasJanvari = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    }
}
