package core1.basics;

import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        int i=10;
        HashMap mymap=new HashMap<>();
        mymap.put("1","Ram");
        mymap.put("2","Sushma");

        System.out.println(mymap);
        map m=new map();
        m.method2(mymap,i);
        System.out.println(mymap);
        System.out.println(i);
    }
    void method2(HashMap mymap,int y){
        System.out.println(y);
        y=20;
       mymap.put("1","Anusha");
       mymap.put("2","Joshuva");
       System.out.println(mymap);
        System.out.println(y);
    }
}
