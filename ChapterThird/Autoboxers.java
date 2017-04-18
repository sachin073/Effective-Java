package ChapterThird;

/**
 * Created by sachin on 8/3/17.
 * Autoboxing note
 * Either boxed to corresponding Object class(integer) and then apply inheritance widerning
 * or only wederning to inheritance primitive i.e int to long is good but int to Long is not working
 */
public class Autoboxers {

    void printer(Long l){
        System.out.println("long value "+l);
    }
    void printer(Integer in){
        System.out.println("integer called "+in);
    }

    public static void main(String[] args) {



        //new OuterBox().printer(5); //if not int function then wont compile as 5 is int cant call function with Long (object)but can call funtion long (primitive)
        new Autoboxers().printer(5L);

        new Autoboxers().printer( 2); //caster to nearest class in inheritance long>int>byte>short.


    }

}
