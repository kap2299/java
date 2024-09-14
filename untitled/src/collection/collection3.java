package collection;

import java.util.TreeSet;

public class collection3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(135);
        ts.add(120);
        ts.add(45);
        ts.add(67);
        ts.add(24);
        ts.add(59);

        System.out.println(ts); // it will return value in sorted form,
                                // it follows tree traversal inorder
                                // it stores data in binary search tree in which left node is less
                                //than parent node and right node is greatwr than parent node
        ts.add(120); // it will not consider 120 because it will not store duplicate value
                     // duplicate values are stored only once in a treeSet

        System.out.println(ts);
        System.out.println(ts.higher(50)); //returns values which are higher than 50
        System.out.println(ts.lower(70)); // return values which are lower than 70
        System.out.println(ts.ceiling(66)); // return values that are just after 66
        System.out.println(ts.floor(55)); // retunr values which are just before 55

    }
}
