import java.util.*;

public class ArrayLists {
    public static void main(String args[]) {
        // Syntax of Generics
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(6); // Change to specify the initial capacity
        l2.add(22);
        l2.add(45);
        l2.add(88);
        l2.add(34);
        l1.add(4);
        l1.add(2);
        l1.add(1);
        l1.add(7);
        // l1.clear(); clear of all Array
        l1.add(0, 9); // 0th element to add 9
        l1.addAll(l2); // --> l2 insert end the last in l1.
        l1.addAll(0, l2); // --> l2 insert start the l1 0th index.
        System.out.println(l1.contains(99)); // --> 99 in l1 of arraylist true otherwise false
        System.out.println(l1.indexOf(34)); // --> 3rd index on 34
        System.out.println(l1.lastIndexOf(1)); // -->Last index of element
        l1.set(1, 656); // --> first index will be on 656

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}