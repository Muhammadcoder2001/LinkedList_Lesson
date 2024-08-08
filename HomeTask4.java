package LinkedListHomework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HomeTask4 {

    public void removeFirstElement(LinkedList list){
        list.removeFirst();
        System.out.println(list);
    }

    public List addTwoList(List list1, List list2){
        LinkedList <Object> result = new LinkedList<>();
        result.addAll(list1);
        result.addAll(list2);
        Collections.shuffle(result);
        return result;
    }

    public static void main(String[] args) {

        HomeTask4 home = new HomeTask4();
        LinkedList<Integer> nums = new LinkedList<>();
        LinkedList <String> colors = new LinkedList<>();

        nums.add(98);
        nums.add(19);
        nums.add(67);
        nums.add(58);
        nums.add(31);

        colors.add("White");
        colors.add("Brown");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");

        System.out.println(home.addTwoList(nums, colors));

        LinkedList <Integer> numbers = new LinkedList<>(nums);

        System.out.println(numbers);
        System.out.println(colors);
        System.out.println("Natija = ");
        home.removeFirstElement(colors);
        System.out.println(nums);
        System.out.println("Natija = ");
        home.removeFirstElement(nums);

    }
}
