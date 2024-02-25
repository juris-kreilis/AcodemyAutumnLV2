package lekcijaDivi;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String istaParole = "password123";
        System.out.println("Ievadi savu paroli...");
        Scanner scanner = new Scanner(System.in);
        String ievaditaParole = scanner.nextLine();

        if (ievaditaParole.equals(istaParole)) {
            //te izpildas, ja if ir true
            System.out.println("Parole ir pareiza! Apsveicu, esam ielogojusies");
        } else {
            System.out.println("Parole nepareiza. Pieeja liegta!!!!");
        }

        System.out.println("Programmas beigas");


        int x = scanner.nextInt();

        if(x>0){
            System.out.println("x ir pozitivs skaitlis");
        } else{
            System.out.println("x ir negativs");
        }
        System.out.println("programmas turpinjums");

    }
}
