package core1.basics;

public class Fibonacci {

    public static void main(String[] args) {
        int n1=0,n2=1,sum=0;
        int n=5;

        if(n==1){
            System.out.println(" "+0);
        }else if(n==2){
            System.out.println(" "+0+" "+1);
        }else{
            System.out.println(n1+","+n2);
            for (int i=3;i<=n;i++){
                sum=n1+n2;
                n1=n2;
                n2=sum;
                System.out.println(" "+sum);
            }
        }
    }
}
