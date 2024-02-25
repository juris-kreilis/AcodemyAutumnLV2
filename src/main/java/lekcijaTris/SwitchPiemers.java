package lekcijaTris;

public class SwitchPiemers {
    public static void main(String[] args) {

        String animal = "Seal";

        switch (animal) {
            case "Dog":
            case "Cat":
                System.out.println("Domestic Animal");
                break;
            case "Tiger":
            case "Lion":
                System.out.println("Wild Animal");
                break;
            default:
                System.out.println("There is no information about this animal");
        }
    }
}
