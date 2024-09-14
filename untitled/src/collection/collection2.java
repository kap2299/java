package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class collection2
{
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque(); // array deque

        ad1.add(100);
        ad1.add(200);
        ad1.add(300);

        System.out.println(ad1);

        ad1.addFirst(1001);
        ad1.addLast(1006);

        System.out.println(ad1);

        PriorityQueue pq= new PriorityQueue();  // priority queue

        pq.add(45);
        pq.add(25);
        pq.add(69);
        pq.add(78);
        pq.add(99);
        pq.add(65);

        System.out.println(pq); // it follows min heap ds, data store in BT form
    }
}
