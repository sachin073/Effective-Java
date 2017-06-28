package Chapter2.Quiz;

/**
 * Created by sachin on 2/3/17.
 */
public class BaseClass {

    BaseClass(){

    }

    public final void printer(){
        System.out.println("me called from "+getClass().getName()+" saying hi");
    }

    BaseClass(String string){
        System.out.println("called from baseClass:  "+string);
    }


}
