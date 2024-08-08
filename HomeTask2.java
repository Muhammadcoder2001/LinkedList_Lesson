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
//      Version 1
        numbers.add(0, 123);
        numbers.add(numbers.size(), 34256);
        System.out.println(numbers);
//        LinkedListni o'zini functionidan ham foydalansak bo'ladi
//        Version 2
        numbers.addFirst(12323);
        numbers.addLast(3567289);

        System.out.println(numbers);

        System.out.println("First element in LinkedList is equal to " + numbers.getFirst() + "\n" +
                "Last element in LinkedList is equal to " + numbers.getLast());




    }
}
