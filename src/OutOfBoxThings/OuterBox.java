package OutOfBoxThings;

/**
 * Created by sachin on 8/3/17.
 */
public class OuterBox {

    void printer(Long l){
        System.out.println("long value"+l);
    }

    public static void main(String[] args) {

        //new OuterBox().printer(5); //wont compile as 5 is int cant call function with Long (object)but can call funtion long (primitive)
        new OuterBox().printer(5L);
    }
}
