package core1.basics;

public class StringReverse {
    public static void main(String[] args) {
        String originalString="Hello";
        char[] charArray=originalString.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=originalString.length()-1;i>=0;i--){
                  sb.append(charArray[i]);

        }
        System.out.println(sb);
    }
}
