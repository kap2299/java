public class staticKeyword
{
    static int a;
    static int b;

    int m;
    int n;

    static
    {
        System.out.println("control block of static");
        a=10;
        b=20;
    }


    {
        System.out.println("block of non static");
        m=30;
        n=40;
    }

    static void disp1()
    {
        System.out.println("value of static var a: "+ a);
        System.out.println("value of static var b: "+ b);
    }
    void disp2()
    {
        System.out.println("value of static var m: "+ m);
        System.out.println("value of static var n: "+ n);
    }


    public static void main(String[] args)
    {
      staticKeyword.disp1();
      staticKeyword stk= new staticKeyword();
      stk.disp2();
    }
}
