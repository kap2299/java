package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamImplemen {
    public static void main(String[] args) {
        List<Integer> alr= Arrays.asList(9, 8, 3, 6, 2, 5, 10);

        Stream<Integer> stm= alr.stream();
        Stream<Integer> evenStream= stm.filter(n->n%2==0).sorted().map(n->n*2);
//               evenStream.forEach(n-> System.out.println(n)); instead of using al these we will do this in one line
//        Stream<Integer> mappedStream= evenStream.map(n->n*2);
//               mappedStream.forEach(n->System.out.println(n));
        evenStream.forEach(n-> System.out.println(n));

    }
}
