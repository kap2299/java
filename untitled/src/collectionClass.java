import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class collectionClass {
    public static void main(String[] args) {

        ArrayList ali= new ArrayList();

        ali.add(50);
        ali.add(64);
        ali.add(20);
        ali.add(10);
        ali.add(70);

        System.out.println(ali); //unsorted

        Collections.sort(ali);  //sorting arraylist
        System.out.println(ali);

        ArrayList<String> alr= new ArrayList<String>();

        alr.add("rohan");
        alr.add("alok");
        alr.add("bablu");
        alr.add("virat");

        System.out.println(alr);

        Collections.sort(alr);
        System.out.println(alr);

        ArrayList alri= new ArrayList();

        alri.add(20);
        alri.add(40);
        alri.add(50);
        alri.add(60);
        alri.add(70);

        int frq=Collections.frequency(alri,20);
        System.out.println(frq);

        int idx=Collections.binarySearch(alri,60);
        System.out.println(idx);
    }
}
