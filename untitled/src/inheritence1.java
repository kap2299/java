class human1
{
    int age;
    void sleep()
    {
        age=18;
        System.out.println("human need good sleep");
        System.out.println(age);
    }
}

class student1 extends human1  // inheritance of class through extend keyword
                               //let classes use the properties and methods of superclasses
{

}

public class inheritence1
{
    public static void main(String[] args)
    {
      student1 st= new student1();
      st.sleep();
    }
}
