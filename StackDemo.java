package core1.basics;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();
        s.push(null);
        s.push(1);
        s.push(4);
        s.push(4);

        Iterator itr=s.listIterator();
        while(itr.hasNext()){
            System.out.println("  "+itr.next());

        }

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s1);


    }
}
