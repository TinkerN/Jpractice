package core1.basics;

public class Mythread extends Thread{
    public void run(){
        //Implement thread functionality.
        for(int i=0;i<5;i++)
        {
           System.out.println("Customized thread");
        }
    }

}
