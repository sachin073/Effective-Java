package Chapter2.Quiz;

/**
 * Created by sachin on 2/3/17.
 */
public class FirstChild extends BaseClass {


    FirstChild(){}

    FirstChild(String string){
        super("hey super here");
        System.out.println("called from first child:   "+string);
    }

    //private final void printer(){   }  //its error as private in base losen access from base has public

    //public final void printer(){   }    //final here or not its compile error. saying printer is final in base

    private final void printer(String str) {     //totally valid as its overloading not overriding

    System.out.println("\ncalled from  "+getClass().getName() +" overloaded via string " +str);
    }
    public static void main(String[] args) {
        new FirstChild("me calling");

        new FirstChild().printer("max calling");
    }
}
