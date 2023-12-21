package core1.basics;

public class ReverseString {

    public static void  reverseMe(char[] s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            sb=sb.append(s[i]);
        }
        System.out.println("Reversed string is:"+sb);
    }

    public static void main(String[] args) {
        //reverseMe("Noilemo");
        char[] s=new char[]{'h','e','l'};
        reverseMe(s);
    }
}
