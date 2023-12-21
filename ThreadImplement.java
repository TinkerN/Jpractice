package core1.basics;

public class ThreadImplement
{
    public static void main(String[] args) {

            Mythread t=new Mythread();//Instantiation of a Thread
            t.start();//starting of a Thread
            for(int i=0;i<5;i++)
            {
                System.out.println("main thread");
            }
    }
}
