/**
 * Created by sachin on 10/2/17.
 */
public class ColoredPoint extends Point{


    String color="Black";
    ColoredPoint(int x,int y,String color){
        super(x,y);
        this.color=color;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
            return super.equals(obj);
        }else if(obj instanceof ColoredPoint){
            return super.equals(obj) && ((ColoredPoint)obj).color==color;
        }

    return false;
    }
}
