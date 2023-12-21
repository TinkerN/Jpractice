package core1.basics;

import java.util.*;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4,5};
        List<Integer> l1=new ArrayList<>();
      l1=Arrays.asList(intArray);

      Stream<Integer> s=l1.stream();



    }
}
