package LinkedListHomework;

import java.util.*;

public class HomeTAsk5 {

    public  <T> void shuffleList(List<T> list){
        Random random = new Random();
        for (int i = list.size() - 1 ; i > 0; i--){
            int index = random.nextInt(i + 1);
            T element = list.get(index);
            list.set(index, list.get(i));
            list.set(i, element);
        }
        System.out.println(list);
    }


    public static void main(String[] args) {
        HomeTAsk5 home = new HomeTAsk5();
        LinkedList <String> colors = new LinkedList<>();

        colors.add("White");
        colors.add("Black");
        colors.add("Brown");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        home.shuffleList(colors);

        ArrayList <String> words= new ArrayList<>(colors);
//        words.removeFirst();  mana array listga o'tkazdik bu oddiy usuli
        System.out.println(words);
        System.out.println(new ArrayList<>(colors));

        LinkedList <Integer> nums = new LinkedList<>();
        nums.add(12);
        nums.add(1);
        nums.add(23);
        nums.add(122);
        nums.add(0);
        Collections.sort(nums);
        if (nums.contains(0)){
            System.out.println("Element is available");
        }else {
            System.out.println("Element is not available");
        }
        System.out.println(nums);
    }
}
