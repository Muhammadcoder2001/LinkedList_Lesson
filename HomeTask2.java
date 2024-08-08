package LinkedListHomework;

import java.util.Iterator;
import java.util.LinkedList;

public class HomeTask2 {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);

        System.out.println(numbers);
        Iterator iterator = numbers.descendingIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        numbers.add(0, 123);
        numbers.add(numbers.size(), 34256);
        System.out.println(numbers);



    }
}
