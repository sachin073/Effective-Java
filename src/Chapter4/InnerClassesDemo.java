package Chapter4;

import java.lang.invoke.MethodHandles;

/**
 * Created by sachin on 29/3/17.
 */
public class InnerClassesDemo {

    static {
        System.out.println("outer static");
    }
    private int max =50;
    InnerClassesDemo(){
        System.out.println("Object has been made");
    }

    public InnerClass getMyInnerObect(){
        return new InnerClass();
    }

    public static void main(String[] args) {
        InnerClass ins= new InnerClassesDemo().new InnerClass();

        ins.maxFromInner();
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void meathodLocalInnerClass(int myVal){

        final  int myFinalVal =myVal;
        class MeathodInnerClass {
            int baker=5;
            {
                baker = myFinalVal;
            }
           public int getBaker(){
                return baker;
            }
            MeathodInnerClass() {
                // myVal=50; will genrate issue as local variable destroy after meathod scope
                int baker = myFinalVal; //valid final is constant and inner class make a copy of final variable
                // inside itself (heap) so that its not destroyed.

                //private int maker=99;    access modifier is not valid inside inner class
               /* public int getBaker(){
                    return baker;
                }*/
                System.out.println(myFinalVal);


            }
        }
        MeathodInnerClass meathodInnerClass= new MeathodInnerClass();        //valid only and can be intantiated from outside anywhere and also
                                        //after class declaration

    }


    void anonomysClass(){

        InnerClass cl=new InnerClass(){
          int x=55;
            public int getX(){
                return x;
            }
        };
    }


    class InnerClass{   //regular inner class

        {
            System.out.println("inner instance block");
        }

        InnerClass(){
            System.out.println("inner class object called");
            max =25;
        }

        public void maxFromInner() { //here is no void main as Regular inner class not support static meathods
            System.out.println("max>>"+max);
        }



    }
}
