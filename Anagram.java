package core1.basics;

import java.util.HashMap;

public class Anagram {



    public HashMap getCharCount(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        char[] characterArrayString=s.toCharArray();
        for(char c:characterArrayString) {
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else
            {
                hm.put(c,1);
            }

        }

        return hm;
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s1="hola",s2="alho";
        //String s3=s1;
        if(s1==s2){
            System.out.println("Anagram!!");
        }else if (s1.length()!=s2.length()){
            System.out.println("Not an anagram !!!");

        }else{
            HashMap<Character, Integer> hm1= anagram.getCharCount(s1);
            HashMap<Character, Integer> hm2= anagram.getCharCount(s2);
            String s= (hm1.equals(hm2))?("Anagram"):("Not an anagram");
            System.out.println(s);
        }

    }
}
