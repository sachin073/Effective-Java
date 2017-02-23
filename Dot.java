/**
 * Created by sachin on 10/2/17.
 */
public class Dot extends ColoredPoint {

    final String name;

    Dot(int x,int y,String color,String name)
    {
        super(x,y,color);
        this.name =name;
    }

    public static void main(String[] args) {
        ColoredPoint obj =new Dot(5,5,"black","Sachin");

    }



}
