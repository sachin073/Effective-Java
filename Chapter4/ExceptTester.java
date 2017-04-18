package Chapter4;

import java.io.IOException;

/**
 1. if unchecked is stated to throw a exception then no compile exception
 2. if checked is stated to throw a exception then compile exception
 */
public class ExceptTester {


    public static void main(String[] args) {
        System.out.println("lol comming");

        try {
            callNull();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void callNull() throws IOException{
        willThrowUnchecdException();
        checkedExTest();        //must handle by try catch or by throws
    }


    public static String willThrowUnchecdException() throws NullPointerException{ //Test 1.1

        if(true){
            throw new NullPointerException("lol");

        }

        return "";
    }

    public static String checkedExTest()throws IOException{

        return "";
    }
}
