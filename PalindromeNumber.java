package core1.basics;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n=434;
        int original=n;
        int sum=0,r=0;
        if(n>0){
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum*10+r;

        }}else{
            System.out.println("Please enter valid number");
        }
       // System.out.println(" "+n +" "+sum);
        System.out.println((original==sum)?"Palindrome":"Not a Palindrome");
    }
}
