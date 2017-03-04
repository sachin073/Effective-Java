package OverRidding;

/**
 * Created by sachin on 23/2/17.
 */
public class SupremeClass{


    public void makerSuper() throws Exception {
        new ArrayIndexOutOfBoundsException();
        System.out.println("from high supreme");
    }


    //staic meathod and variable belongs to class so overidding is not supported
    // but overloading is as there is not internal logic between two methods .
    // static call to meathod is like ClassNmae.MethodName
    public static void print(){
        System.out.println("from :::::"+new SupremeClass().getClass().getName());
    }

    public static void print(String max){
        System.out.println("overRidden class:::: "+new SupremeClass().getClass().getName());
    }



}
