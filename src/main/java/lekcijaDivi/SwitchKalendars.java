package lekcijaDivi;

public class SwitchKalendars {
    public static void main(String[] args) {
        int day = 11;

        switch (day){
            case 1: System.out.println("Pirmdiena");
                break;
            case 2: System.out.println("Otrdiena");
                break;
            case 3: System.out.println("Trešdiena");
                break;
            case 4: System.out.println("Ceturtdiena");
                break;
            case 5: System.out.println("Piektdiena");
                break;
            case 6:
            case 7: System.out.println("Brīvdiena");
                break;
            default:
                System.out.println("Tāda diena neekistē!!!");
        }
    }


}
