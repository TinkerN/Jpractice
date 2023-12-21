package core1.basics;

public class basic2 {


        public static void main(String[] args)
        {

            basic2 b=new basic2();
            
            b.doStuff();
        }
        public  void doStuff()
        {
            doMoreStuff();
        }
        public  void doMoreStuff()
        {
            System.out.println("Hello");
        }
    }


