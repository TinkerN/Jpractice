package core1.basics;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class ReflectionDemo2 {

    public static void main(String[] args) throws Exception {
        Class c=Class.forName("core1.basics.ReflectionDemo");
        System.out.println(c.getName());
        System.out.println(c.getSuperclass().getName());
        Class[] c1= c.getInterfaces();
      Stream<Class> s=Stream.of(c1);
       s.forEach((e)-> System.out.println(e.getName()));
//        for(Class e:c1){
//            System.out.println(e.getName());
//
//        }
        Field[] f=c.getFields();
        Stream<Field> s1=Stream.of(f);

        s1.forEach((var)-> System.out.println("Public variables: "+var.getName()));

        Field[] f1=c.getDeclaredFields();
        Stream<Field> s2=Stream.of(f1);

        s2.forEach((var)-> System.out.println("Variables with any modifier: "+var.getName()));
    }
}
