import java.util.ArrayList;

public class generic1 {
    public static void main(String[] args) {

//        ArrayList als= new ArrayList();
//
//        als.add("hello");
//        als.add("world");
//        als.add(20);
//
//        String name11= (String) als.get(0); //typecasting
//        String name22= (String) als.get(1);
//        String name33= (String) als.get(2); //it will give exception because of the type of data
//                                            //in arraylist there is int type of data in 2 index

        ArrayList<String> als= new ArrayList<String>();

        als.add("hello");
        als.add("world");
        //als.add(20); //now while writing program it will give error if i try to give non string dta

    }
}
