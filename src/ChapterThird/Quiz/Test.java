package ChapterThird.Quiz;

import java.util.Objects;

/**
 * Created by sachin on 12/3/17.
 */
public class Test extends BaseTester {
    int x =8;

    static {
        System.out.println("tester class called");
    }
    Test goNullMe(Test me){ // me hold addres of c2
        me.x=9;
        me =null;               //here me lost address of c2 and freely living his short life
        return  me;
    }

    void passObjectTome(Object o) {
        if (o instanceof int[]) {
            System.out.println("called object "+((int[])o)[0]);
        }
    }

    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3= t1.goNullMe(t2);                  //t3 new created so not gc
        t1 =null;                               //till here 2 object created and 1 is available for gc i.e t1

        System.out.println(t1+"<>"+t2.x+"<>"+t3);     //till here c1 and int of c1 is collected by gc
        int[] x={2};
        t2.passObjectTome(x);

    }


}
