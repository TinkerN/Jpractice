package core1.basics;

import java.util.HashMap;

public class lc2 {

    public static void main(String args[]){

       System.out.println(twoSum("aab"));
    }

        public static int twoSum(String s) {
        int lengthOfLongestSubstring =0;
        int currentMaxLength =0;
        int startPosition = 0;
        HashMap substrMap = new HashMap() ;
        int i=0;
        while(i<s.length()){
            if(substrMap.containsKey(s.charAt(i)))
            {
                lengthOfLongestSubstring= (substrMap.size() > lengthOfLongestSubstring )? substrMap.size() : lengthOfLongestSubstring;
                i=startPosition++;
                substrMap.clear();
            //    currentMaxLength = 0 ;
                continue;
            }
          //  currentMaxLength++;

            substrMap.put(s.charAt(i),i);
            i++;
        }
            lengthOfLongestSubstring = (substrMap.size() > lengthOfLongestSubstring )? substrMap.size() : lengthOfLongestSubstring;
        return  lengthOfLongestSubstring;
    }
}
