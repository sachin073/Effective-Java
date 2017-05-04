package Threading;

import java.util.Timer;

/**
 * Created by sachin on 19/4/17.
 */
public class ThreadMaker implements Runnable{

    @Override
    public synchronized void run() {
        System.out.println("aa");
        try {
            //t2.wait(); not work as monitor is on this not on t2 or t3
            this.wait();
            //t3.wait(); will work if inside the block synchronized (t3){}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static Thread t1,t2,t3;

    public static void main(String[] args) {

        t1 = new Thread(){

            @Override
            public void run() {
                System.out.println("a");
                try {
                /*  Thread th= new Thread(new ThreadMaker());
                        th.start();
                    th.sleep(100);
                */
                    System.out.println(   System.currentTimeMillis());
                    t2.sleep(100);
                    System.out.println( t1.getState());
                    System.out.println( System.currentTimeMillis());
                    System.out.println( Thread.currentThread().getState());

                }catch (Exception E){
                    E.printStackTrace();
                }


            }
        };

        t2 = new Thread(){

            @Override
            public void run() {
                System.out.println("b");
                try{
                    if(t1.isAlive()) {
                        //t1.wait();  //illegal monitor state as other's object who
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();
        t3 = new Thread(new ThreadMaker());
        t3.start();

        while(t1.getState() != Thread.State.TERMINATED){
            //System.out.println( "still working");
        }
        System.out.println(Thread.currentThread().getState()+"<>>><<"+Thread.currentThread().getName());
    }
}
