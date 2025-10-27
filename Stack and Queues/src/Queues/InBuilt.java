package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuilt {
    public static void main(String[] args) {
//        //queue is an interface where stack is an class
//        //no class queue
//        //we have t implement from linkedlist
//        Queue<Integer> qu = new LinkedList<>();
//        qu.add(1);
//        qu.add(2);
//        qu.add(3);
//        qu.add(4);
//        qu.add(5);
//
//        System.out.println(qu);
//        System.out.println(qu.peek());
//        System.out.println(qu.remove());
//        System.out.println(qu);
//        qu.add(6);
//        System.out.println(qu);

        // deque

//        Deque<Integer> dq = new LinkedList<>();
        //arraydeques will have no capacity restrictions
        //faster than linkedlist and stack
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);



    }
}
