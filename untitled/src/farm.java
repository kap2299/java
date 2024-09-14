import java.util.Scanner;
class farmer   //use of static only where any variable is calling again
{
    int prinAmt;
    float timeDur;
    static float rateOfInt;
    float SimInt;

    static
    {
        rateOfInt=4.5f;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter amount required");
        prinAmt=sc.nextInt();
        System.out.println("for what time duration");
        timeDur=sc.nextFloat();

    }

    void compute()
    {
        SimInt=(prinAmt*timeDur*rateOfInt)/100f;
    }

    void disp()
    {
        System.out.println("simple intrest is :"+SimInt);
    }
}
    public class farm {
        public static void main(String[] args)
        {
         farmer f1= new farmer();
         farmer f2= new farmer();

         f1.input();
         f1.compute();
         f1.disp();

         f2.input();
         f2.compute();
         f2.disp();
        }
    }

