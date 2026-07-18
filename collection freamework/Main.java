
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;

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

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println(list3.get(2));
        list3.set(0, 30);
        System.out.println("after set:" + list3);

        // toArray(): convert into array
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        // contains
        System.out.println(list3.contains(1009));

        list.add(12);
        list.add(6);
        System.out.println("Printing Entire List: " + list);

        // sort an arrayList
        Collections.sort(list);
        System.out.println("Printing Entire List: " + list);
    }
}