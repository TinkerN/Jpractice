package core1.basics;

import java.util.*;
public class genPalindrome2 {

    public  String Solution(int size, int noOfLetters)
    {

        Random rand = new Random();
        int j=0;
        char ch=0;
        StringBuilder random = new StringBuilder(size);

        for(int i=0;i<noOfLetters;i++){
            random.append((char)('a' + i));
        }

        for (int i = 0; i < (int)Math.ceil((double)size/2)-noOfLetters; i++) {

            random.append(random.charAt(noOfLetters-1));

        }
        for(int i = size/2-1; i >= 0; i--)
            random.append(random.charAt(i));


        return random.toString();



    }

    public static void main(String[] args) {
        genPalindrome2 gp=new genPalindrome2();
        System.out.println(gp.Solution(9,4));
    }
}
