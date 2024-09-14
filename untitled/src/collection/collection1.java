package collection;

import java.util.ArrayList;

public class collection1 {
    public static void main(String[] args) {
        ArrayList AL = new ArrayList(); // IN THIS ARRAYLIST DATA IS HOMOGENOUS
        AL.add(100);
        AL.add(200);
        AL.add(300);
        AL.add(400);
        System.out.println(AL);

        System.out.println("**************************************");

        ArrayList AL2= new ArrayList(); //IN THIS aRRAYlIST DATA IS HETEROGENOUS
        AL2.add("kareem");
        AL2.add(1.5);
        AL2.add('G');
        AL2.add(10);
        System.out.println(AL2);
        AL2.add(120);  //THIS STATEMENT SHOWS THAT COLLECTION IS DYNAMIC IN NATURE

        System.out.println("**************************************");

        ArrayList AL3 = new ArrayList();
        AL3.add(1);
        AL3.add(2);
        AL3.add(3);
        System.out.println(AL3);

        System.out.println("*****************************************");
        AL3.addAll(AL2); // it is dynamic in nature and we can add a collection into a collection
        System.out.println(AL3);

    }
}
