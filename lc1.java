package core1.basics;

public class lc1 {

    public static void main(String args[]){
        int[] nums = { 2,0,11,7 };
        int target = 9;
        int[] results = twoSum(nums,target);
       System.out.println(results[0] +" "+results[1]);
    }

        public static int[] twoSum(int[] nums, int target) {

            int[] loc = new int[2];

            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j] == target-nums[i]){
                        loc[0] = i;
                        loc[1] = j;
                        return loc;
                    }

                }
            }
            return loc;


    }
}
