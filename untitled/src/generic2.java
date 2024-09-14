import java.lang.reflect.Array;
import java.util.ArrayList;

class student11
{
    private String name;
    private int id;
}
class employee11
{

}
public class generic2 {
    public static void main(String[] args) {
        student11 st11= new student11();
        student11 st22= new student11();

        employee11 emp1= new employee11();

//        ArrayList alr= new ArrayList();
//        alr.add(st11);
//        alr.add(st22);
//        alr.add(emp1);// this statement wll give exception because different classes cnt be stord in same arraylist

        ArrayList<student11> alr= new ArrayList<student11>(); //by addidng generics it will now give error if i try to add another cllass object into arraylist
        alr.add(st11);
        alr.add(st22);
        //alr.add(emp1);
    }
}
