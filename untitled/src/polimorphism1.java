class aeroplane1
{
    public void takeoff()
    {
        System.out.println("plane takes off");
    }
    public void fly()
    {
        System.out.println("plane flies");
    }
}

class cargoPlane1 extends aeroplane

{
    public void fly()
    {
        System.out.println("cargo plane flies at lower height"); // overriding method
    }
    public void carryGoods()
    {
        System.out.println("cargo planes carry goods"); //specialized method
    }
}

class passengerPlane1 extends aeroplane
{
    public void fly()
    {
        System.out.println("passenger planes flies at medium height ");
    }
    public void carryPassengers()
    {
        System.out.println("passenger planes carries passengers");
    }
}


public class polimorphism1 {

    public static void main(String[] args)
    {
        cargoPlane cp = new cargoPlane();
//        cp.fly();
//        cp.takeoff();
//        cp.carryGoods();

        passengerPlane pp= new passengerPlane();
//        pp.fly();
//        pp.takeoff();
//        pp.carryPassengers();
        aeroplane ref;

        ref=cp;
        ref.fly();
        ref.takeoff();
        System.out.println("-------------------------------");

        ref=pp;
        ref.fly();
        ref.takeoff();
    }
}
