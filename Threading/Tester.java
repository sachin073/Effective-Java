package Threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sachin on 6/4/17.
 *1. when main end ? after or before main callstack
 *2. at default priority (5) thread get kicked back in between execution while 4 execute once as pc is quad-core
 * 3. after setting custom prioritys (via a simple loop) pre-emptive kind of scheduling found
 *
 */
public class Tester {

    public static void main(String[] args) {

        BaseThread bst=new BaseThread();
        Thread [] threads =new Thread[10];
        ArrayList<String> names=new ArrayList<>(        Arrays.asList("ram,lakhan,sonu,monu,ravi,sanjeev,gaurang,kumar".split(",")));
        for (int i=0;i<names.size();i++){
            threads[i]=new Thread(bst,names.get(i));
        }
        ArrayList es=new ArrayList();

        Thread th4= new Thread(new Thread(){
            @Override
            public void run() {
                System.out.println("called via inner class");
            }
        });
       /* th4.start();
        for (int i = 0; i < names.size(); i++) {
            threads[i].setPriority(i+1);
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        System.out.println(System.nanoTime());
//16189512079682
//16269642520948
//------------------------------------------------------------------------------------------------------
//case 1.2
        BaseThread bsthreads =new BaseThread(new StringBuffer("A"));


        Thread th1 =new Thread(bsthreads," 1st Thread");
        Thread th2 =new Thread(bsthreads," 2st Thread");
        Thread th3 =new Thread(bsthreads," 3st Thread");

        th1.start();
        th2.start();
        th3.start();





    }
}
