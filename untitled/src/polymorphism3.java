class car1
{
    public void type()
    {
        System.out.println("car are driven on track");
    }
    public void fuel()
    {
        System.out.println("car consumes fuel");
    }
}

class verna extends car1
{
    public void type()
    {
        System.out.println("verna is driven on only plain tracks");
    }
    public void fuel()
    {
        System.out.println("verna consumes diesel");
    }
}
class ertiga extends car1
{
    public void type()
    {
        System.out.println("ertiga can be driven on offroads");
    }
    public void fuel()
    {
        System.out.println("ertiga consumes CNG");
    }
}
class road
{
    public void polymor(car1 ref)
    {
        ref.type();
        ref.fuel();
    }
}
public class polymorphism3 {
    public static void main(String[] args) {

        verna vn= new verna();
        ertiga eg= new ertiga();

//        eg.type();
//        eg.fuel(); //to use this we will use polymorphism by creating another class: road
//        eg.type();
//        eg.fuel();

        road rd= new road();
        rd.polymor(vn);
        rd.polymor(eg);
    }
}
