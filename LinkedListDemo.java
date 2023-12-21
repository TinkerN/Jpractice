package core1.basics;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("String");
        ll.add(3);
        ll.add('C');
        ll.add(null);

        ListIterator lItr= ll.listIterator();
        while(lItr.hasNext()){
            System.out.println(lItr.next());

        }


    }
}
