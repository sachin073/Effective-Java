package Overloading;

/**
 * Created by sachin on 24/2/17.
 */
public class Tester {


    public static void main(String[] args) {

        Animal universalAnimal = new Animal();
        universalAnimal.eats();             //eats from horse will be called

        universalAnimal =new Horse();       // there is two eats..1 from animal one what overridden
        universalAnimal.eats();             // as both overriding and overloading happends
                                            // then more specific/child version will be called

        Horse horse             = new Horse();
        horse.eats();

    }


}
