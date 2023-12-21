package core1.basics;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
       // HashSet hs =new HashSet();
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(null);
        h.add(10);

        Iterator itr= h.iterator();
        while(itr.hasNext()){
            System.out.println("  "+itr.next());
        }

        LinkedHashSet lh = new LinkedHashSet();
        lh.add("B");
        lh.add("C");
        lh.add("D");
        lh.add("Z");
        lh.add(null);
        lh.add(10);
        System.out.println(" \n");
        Iterator itr1= h.iterator();
        while(itr1.hasNext()){

            System.out.println("  "+itr1.next());
        }
    }
}
