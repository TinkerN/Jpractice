package core1.basics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static  int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(hm.containsKey(target-nums[i])){
                int ans[]={i,hm.get(target-nums[i])};
                return ans;
            }
            hm.put(nums[i],i);
        }
        int []ans = {};
        return ans;

    }


}
