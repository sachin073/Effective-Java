package OverRidding;

/**
 * Created by sachin on 23/2/17.
 */
public class TestClass {

    public static void main(String[] args) {
        SupremeClass s =new ChildClass();
        ChildClass c =new ChildClass();

        c.makerSuper();

        try {
            s.makerSuper();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
