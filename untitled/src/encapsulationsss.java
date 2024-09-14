class calculator
{
    //declare variable(instance) over here
  public int add(int n1, int n2)
  {
      int r= n1+n2;
      return r;
  }
}
public class encapsulationsss
{
    public static void main(String[] args)
    {
      calculator calc = new calculator();
      int result= calc.add(45 , 30);
        System.out.println(result);
    }
}
