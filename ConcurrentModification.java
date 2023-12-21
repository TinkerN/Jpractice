package core1.basics;

import java.util.ArrayList;
import java.util.Iterator;

class ConcurrentModification {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(1);
        al.add("Hi");

        Iterator itr=al.iterator(); //Object
//      for(int i=0;i<al.size();i++){
//          System.out.println(" "+al.get(i));
//          al.add('K');
//      }
        while(itr.hasNext()){

            System.out.println(" "+itr.next());
            if(itr.next().equals("Hi"))
              al.add('L');

        }


    }
}
