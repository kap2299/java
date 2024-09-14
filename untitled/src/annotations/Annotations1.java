package annotations;
@FunctionalInterface
interface sky
{
    void skyLimits();
}
class plane
{
public void planeflies()
   {
       System.out.println("plane flies in sky");
   }
}

class cargoPlane extends plane
{
    @Override
    public void planeflies()
    {
        System.out.println("Cargo Plane flies at low altitude");
    }
}

public class Annotations1 {
    public static void main(String[] args) {

        plane cp= new cargoPlane();
        cp.planeflies();
    }
}
