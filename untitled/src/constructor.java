class student
{
  private String name;
  private int age;

  student(String name, int age)
  {
      this.name=name;
      this.age=age;
  }
  public String getName()
  {
      return name;
  }
  public int getAge()
  {
      return age;
  }
}

public class constructor
{
    public static void main(String[] args)
    {
      student st= new student("shyam",20);

              String name= st.getName();
        System.out.println(name);
              int age= st.getAge();
        System.out.println(age);
    }
}
