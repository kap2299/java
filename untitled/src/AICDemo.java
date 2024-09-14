interface car11
{
    void drive();
}
//class wagonR implements car11
//{
//    public void drive()
//    {
//        System.out.println("vroom vroom");
//    }
//}
public class AICDemo
{
    public static void main(String[] args) {

       car11 c1 = () ->System.out.println("vroom vroom"); //lambda exprsssion


    }
}

