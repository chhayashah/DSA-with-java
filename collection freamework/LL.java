
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LL {
     public static void main(String[] args) {
        // List and collection -> interface

        // LinkedList -> concrete class
        LinkedList<Integer> list = new LinkedList<>();

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
        List<Integer> list2 = new LinkedList<>();
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
        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println("Element: " + iterator.next());
        // }

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
        list.add(66);
        list.add(67);
        list.add(68);
        System.out.println("Printing Entire List: " + list);
        System.out.println(list.lastIndexOf(68));

        // addFirst and addLast
        list.remove(3);
        list.remove(3);
        list.remove(3);
        System.out.println("Printing Entire List: " + list);
        list.addFirst(101);
        System.out.println("Printing Entire List: " + list);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(101);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

    }
}
