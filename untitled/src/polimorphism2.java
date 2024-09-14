class aeroplane2
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

class cargoPlane2 extends aeroplane2

{
    public void takeoff()
    {
        System.out.println("cargo planes can take off in long runways"); //specialized method
    }
    public void fly()
    {
        System.out.println("cargo plane flies at lower height"); // overriding method
    }

}

class passengerPlane2 extends aeroplane2
{
    public void takeoff()
    {
        System.out.println("passenger planes need wide runways to takeoff");
    }
    public void fly()
    {
        System.out.println("passenger planes flies at medium height ");
    }

}
class fighterPlane extends aeroplane2
{
    public void takeoff()
    {
        System.out.println("fighter jet can takeoff in small runway");
    }

    public void fly()
    {
        System.out.println("fighter jet flies at higher level");
    }
}
class airport
{
    public void poly(aeroplane2 ref2) //polymosphism
    {
        ref2.takeoff();
        ref2.fly();
    }
}
public class polimorphism2 {
    public static void main(String[] args) {
        cargoPlane2 cp2= new cargoPlane2();
        passengerPlane2 pp2= new passengerPlane2();
        fighterPlane fp2= new fighterPlane();
//        cp2.fly();
//        cp2.takeoff();
//        pp2.fly();
//        pp2.takeoff();
//        fp2.fly();
//        fp2.takeoff();

        //with the help of polymorphism
        airport ap= new airport();
        ap.poly(cp2);
        ap.poly(pp2);
        ap.poly(fp2);

    }
}
