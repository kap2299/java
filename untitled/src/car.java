import java.util.Scanner;

public class car {
    String name;
    int engineNo;
    String avg;

    car(String name, int engineNo,String avg)
    {
        this.name= name;
        this.engineNo=engineNo;
        this.avg=avg;
    }
    public static void run()
    {
        System.out.println("car is running");
    }

    public static void main(String[] args) {
        car bmw= new car("sclass",2345,"23km/h");
        System.out.println("car name:"+bmw.name+" "+"car average: "+bmw.avg+" "+"engine number: "+bmw.engineNo);



        System.out.println("\uD83D\uDE2D\n");
    }
}
