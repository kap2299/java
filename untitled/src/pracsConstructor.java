class employee
{
    final String name1;
    final int age1;
    employee(String name1, int age1)
    {this.name1=name1;
        this.age1=age1;}

    public String getName() {return name1;}
    public int getAge() {return age1;}

}

public class pracsConstructor
{
    public static void main(String[] args)
    {
        employee emp= new employee("Radhe",35);
        String name1= emp.getName();
        System.out.println(name1);
        int age1= emp.getAge();
        System.out.println(age1);
    }
}
