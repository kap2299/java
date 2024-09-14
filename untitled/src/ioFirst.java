class Students
{
    String name;
    String city;
    int age;

    public Students(String name, String city, int age)
    {
        this.name=name;
        this.city=city;
        this.age=age;
    }
    public String toString()
    {
        return "Name :"+ name + "| City :"+ city + " | age :" + age; //for printing the data
    }
}

public class ioFirst {
    public static void main(String[] args) {

        Students stt1= new Students("Arjun","Prayagraj",33);
        Students stt2= new Students("Ram","lucknow",32);
        Students stt3= new Students("himanshu", "Delhi", 25);

        System.out.println(stt2);
    }
}
