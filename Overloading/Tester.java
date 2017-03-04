package Overloading;

/**
 * @author sachin on 24/2/17.
 * @version 1.0.2
 * @discription Animal is Base class,Horse is firstParent,Tester is test class with main and may or may not be child of horse
 * @Topics 1. Overloading: with inheritance and simple
 * 2. Object Casting: Up/DownCasting
 * 3. Constructor overloading
 */
public class Tester extends Horse {

        // Constructor overloading  starts
    Tester() {

    }

    Tester(String string) {          // if above constructor is deleted and only this overloaded version is there
        System.out.println(string);     // then new Tester(); call will throw compile time exception that no meathod found
    }                                   // compiler provide default constructor only in absense of a constructor but remove it if overloaded constructor exists

    //Constructor overloading

    public static void main(String[] args) {
        // Block 1.
        Animal universalAnimal = new Animal();
        universalAnimal.eats();             //eats from horse will be called

        universalAnimal = new Horse();       // there is two eats..1 from animal one what overridden
        universalAnimal.eats();             // as both overriding and overloading happends
        // then more specific/child version will be called

        Horse horse = new Horse();
        horse.eats();

        //Block 2 Starts
        // Casting : Down-casting and up-casting.
        //Downcasting only applicatble iFF casting is done to specific same object , that is created by "new"
        //Animal>horse>Tester

        Animal um = new Tester();
        Tester t = (Tester) um;      //valid
        Horse h = (Tester) um;        //valid

        um = new Horse();
        h = (Horse) um;             //valid
        //t =(Tester) h;              //compile valid but give a class cast exception
        //Block 2 ends

    }


}
