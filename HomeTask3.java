package LinkedListHomework;

import java.util.LinkedList;
import java.util.List;

public class HomeTask3 {

    public  void removeElementByIndex(List list, int index){
            if (0 <= index && index < list.size()){
                list.remove(index);
                System.out.println(list);
            }else {
                System.out.println("Invalid index " + index);
            }

    }

    public void removeFirstLast(LinkedList list){
        String first =(String) list.removeFirst();
        String last = (String) list.removeLast();
        System.out.println("Deleted first element is " + first + "\n" +
        "Deleted last element is " + last);
    }

    public static void main(String[] args) {

        HomeTask3 home = new HomeTask3();
        LinkedList <String> colors = new LinkedList<>();

        colors.add("White");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Brown");
        colors.add("Green");
        home.removeElementByIndex(colors, 1);
        home.removeFirstLast(colors);

    }
}
