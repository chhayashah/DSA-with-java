
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        // List and collection -> interface

        // ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(50);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        // add all
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("printing list2:" + list2);
        list2.clear();
        System.out.println(list2.size());

        // I want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}