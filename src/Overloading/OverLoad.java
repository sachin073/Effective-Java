package Overloading;

/**
 * Created by sachin on 19/2/17.
 */
public class OverLoad {
    public static void main(String[] args) {



        print(null);
    }


    public static void print(String o){
        System.out.print("Object called "+o);
    }


    public static void print(Object o){     //if Generic is used then cant use Object
        System.out.print("Object called "+o);
    }


/* will generate ambigous meathod compilation error
    public static void print(Integer o){
        System.out.print("Object called "+o);
    }
*/

}

