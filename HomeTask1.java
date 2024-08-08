package LinkedListHomework;

import java.util.Iterator;
import java.util.LinkedList;

public class HomeTask1 {

    public static void main(String[] args) {

        LinkedList<String> anilmals = new LinkedList<>();

        anilmals.add("Lion");
        anilmals.add("Giraffe");
        anilmals.add("Leopard");
        anilmals.add("Wolf");
        anilmals.add("Elephant");

        System.out.println(anilmals);

        Iterator anilmal_iterator = anilmals.iterator();

        while(anilmal_iterator.hasNext()){
            System.out.println(anilmal_iterator.next());

        }


    }
}
