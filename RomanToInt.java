package core1.basics;

import java.util.HashMap;
import java.util.Set;

public class RomanToInt {

    public static void main(String[] args) {
        String s="IV";
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1); hm.put('V',5);
        hm.put('X',10); hm.put('L',50);
        hm.put('C',100); hm.put('D',500);
        hm.put('M',1000);
        //Set keyset=hm.keySet();
        int convertedNum;
        convertedNum=hm.get(s.charAt(s.length()-1));
        for(int i=s.length()-1; i>0;i--){

            if(hm.get(s.charAt(i-1))>hm.get(s.charAt(i))){
                convertedNum=convertedNum+hm.get(s.charAt(i-1));
            }else{
                convertedNum=convertedNum-hm.get(s.charAt(i-1));
            }
        }

        System.out.println(convertedNum);


    }
}
