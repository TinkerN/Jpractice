package core1.basics;

import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String str){
        boolean flag=true;
        char charArray[]=str.toLowerCase().toCharArray();
        for (int i=0;i<(str.length())/2;i++){
            if(charArray[i]!=charArray[str.length()-i-1]){
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {

        String result=(isPalindrome("Madama"))?("Yay Palindrome"):("Nah, its not a palindrome");
        System.out.println(result);
    }
}
