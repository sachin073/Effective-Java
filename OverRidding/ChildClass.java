package OverRidding;

/**
 * Created by sachin on 23/2/17.
 */
public class ChildClass extends SupremeClass{


    public void makerSuper()  {
        new ArrayIndexOutOfBoundsException();
        System.out.println("from childer");
    }

    public static void print(){
        System.out.println("called from :::"+new ChildClass().getClass().getName());
    }
}
