package core1.basics;

public class booleanBasic {


    public static void main(String args[]){
        int[] a = {3,8,4,3,4,2};
        int value = solution(a);
        System.out.println(value);
    }

    public static int solution(int[] A){
        int[] integers = new int[A.length];
        int conditionMatched=0;
        int conditionMatchedMax=0;
        for(int i=0;i<A.length;i++){
            int val = A[i];
            if(val<conditionMatched)
                continue;
            int count = 0;
            for(int j=0;j<A.length;j++){
                if(A[j]==A[i])
                    count++;
                if(count > val){
                    break;
                }
            }
            if(count == A[i]){
                conditionMatched = A[i];
                conditionMatchedMax = A[i];
            }
        }
        return conditionMatched;
    }
}

