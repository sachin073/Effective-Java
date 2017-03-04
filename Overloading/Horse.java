package Overloading;

/**
 * Created by sachin on 24/2/17.
 */
public class Horse extends Animal {


    @Override
    public void eats() {
      System.out.println("horse eats grass");
    }

    public void eats(String food){
        System.out.println("horse also eats"+food);
    }
}
