package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {

//        ArrayList<Integer> lst1= new ArrayList();
//        lst1.add(3);
//        lst1.add(4);
//        lst1.add(6);
//        lst1.add(7);
//        lst1.add(9);
//        System.out.println(lst1);
        // one more method of adding data to arraylist and less code

        List<Integer> lst2= Arrays.asList(3,4,1,7,5); //this will do the same(*use List keyword)
        System.out.println(lst2);

        Stream<Integer> streamData=lst2.stream();

        //long count= streamData.count();
        //System.out.println(count);

        //streamData.forEach(n-> System.out.println(n));
        Stream<Integer> sortedStream= streamData.sorted();
        //sortedStream.forEach(n-> System.out.println(n));

        Stream<Integer> mapStream=sortedStream.map(n->n*2);
        mapStream.forEach(n-> System.out.println(n));
    }
}
