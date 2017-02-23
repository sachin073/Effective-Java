/**
 * Created by sachin on 10/2/17.
 */
public class Point {

    private final int x;
    private final int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Point)){
            return false;
        }else if( obj == null){
            throw new NullPointerException();
        }

        if(obj instanceof Point){
            return ((Point)obj).x==x && ((Point)obj).y==y;
        }
        System.out.println();

        return false;
    }
}
