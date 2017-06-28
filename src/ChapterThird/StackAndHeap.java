package ChapterThird;

/**
 *
 * @author sachin
 * @discription
 * java is pass by value . Its pass constant value in primitive and value in object location when used in object reference
 *
 */
public class StackAndHeap {

    String name="";
    String ID="#123";

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(StackAndHeap sh1,boolean any){  //sh1 is pass by value.
        sh1.setName("max");                 //sh1 point place where called sh object placed so can modify sh's object properties
        sh1 =new StackAndHeap();        //sh1 vaiable now point to new location rather than sh's object location so can't change location.
        System.out.println("sh1>>>>::"+sh1.getName());
    }
    public static void main(String[] args) {
        StackAndHeap sh=new StackAndHeap();

        sh.setName(sh,false);

        System.out.println("sh>>>>::"+sh.getName()); //changes are gone to bed
    }
}
