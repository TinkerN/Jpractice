package core1.basics;

public class Countdigits {

    public static void main(String[] args) {
        int num=5479,sum=0,remainder;
        while (num > 0) {
            remainder = num % 10;

            num = num / 10;
            sum = (sum * 10) + remainder;

        }
        System.out.println(sum);
    }
}
