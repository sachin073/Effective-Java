package Threading;

/**
 * Created by sachin on 6/4/17.
 */
public class BaseThread implements Runnable{

    StringBuffer strBuffer =null;

    BaseThread(){

    }

    BaseThread(StringBuffer strb){
        strBuffer =strb;
    }

    @Override
    public void run() {

/* case 1.1
        for (int i = 0; i < 32; i++) {
            System.out.println("called from thread  "+ Thread.currentThread().getName()+" priority " +Thread.currentThread().getPriority() );
        }
*/

//for case 1.2

        for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"<><"+this.strBuffer +"<>><"+strBuffer.length());
        }
            //System.out.print("\n\n <><><>"+new StringBuffer((strBuffer.charAt(0))));
            char temp =strBuffer.charAt(0);
            temp++;
        char test=temp;
        synchronized (this){  //verify the diff this.strbuffer and making this.strbuffer with test inside block
            this.strBuffer=strBuffer.replace(0,1,Character.toString(test));
        }
    }


    public static void waitAfewSec(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
