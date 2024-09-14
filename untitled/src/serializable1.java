import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    cricketer(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
}

public class serializable1{
    public static void main(String[] args) throws IOException
    {

        cricketer crk= new cricketer("Sachin",44,100);

        FileOutputStream fos= new FileOutputStream("kap2.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);

        oos.writeObject(crk);
        oos.flush();
        oos.close();
    }
}