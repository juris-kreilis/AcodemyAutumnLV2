package lekcijaPieci;

import com.github.javafaker.Faker;
import lekcijaCetri.Dog;

public class RandomData {
    public static void main(String[] args) {
        Faker randomDatuGenerators = new Faker();
        System.out.println(randomDatuGenerators.address().fullAddress());

        Dog mansSuns = new Dog();
        mansSuns.setAge(randomDatuGenerators.number().numberBetween(1,20));
        mansSuns.setBreed(randomDatuGenerators.dog().breed());
        mansSuns.setName(randomDatuGenerators.lordOfTheRings().character());
        mansSuns.setWeight(randomDatuGenerators.number().randomDouble(2,5,10));

        mansSuns.printDog();

    }
}
