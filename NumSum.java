package core1.basics;

import java.util.Arrays;
import java.util.HashMap;

public class NumSum {


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int j=0;j< nums.length;j++)
        {
            int num=nums[j];
            int complement=target-num;
            if(hm.containsKey(complement)){
                int index=hm.get(complement);
                if(index==j) continue;
                return new int[]{j,index};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4};
        System.out.println(Arrays.toString(twoSum(intArray,5)));
    }

}
