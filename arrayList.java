package core1.basics;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

    public int solution(int A[]){
        int n=0;
        int len= A.length;
        List<Integer> selected=new ArrayList<>();

        for(int i=0;i<n; i++){
            int res = 0;
            for (int j=0; j<n; j++) {
                if (A[j] == A[i])
                    res++;
            }
            if(res==A[i]){
                selected.add(A[i]);
            }

        }







        return n;
    }

}
