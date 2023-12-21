package core1.basics;

import java.util.*;

public class genPalindrome {

    public static void Solution(String S)
    {
        int cIndex,nIndex=0;
        cIndex= S.indexOf('A');
        nIndex=S.indexOf('A',cIndex+1);
        int skip=cIndex;
        boolean flag=true;
      while(flag){
          if(nIndex==-1 )
          {
              flag=false;
          }
          else{
              skip=skip+((nIndex-cIndex)-1);
              cIndex=nIndex;
              nIndex=S.indexOf('A',cIndex+1);
          }


      }
        System.out.println(skip);
    }

    public static void main(String[] args) {
        Solution("BBBBBAAAAAAAABABAB");
    }

}
