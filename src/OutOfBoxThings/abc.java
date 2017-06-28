package OutOfBoxThings;

/**
 * Created by sachin on 30/3/17.
 */
public class abc {

    static int xxx=0;
    {
        int x=0;
        x+=3;
        xxx++;
        System.out.println(x+"<>><"+xxx);
    }

    public static void main(String[] args) {
        new abc();
        new abc();
    }
}
