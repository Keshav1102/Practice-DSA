class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                sum = nums[i];
            }else if(nums[i-1]==nums[i]){
                sum=nums[i];
                continue;
            }else{
                sum+=nums[i];
            }
            max = sum>max?sum:max;
        }
        return max;
    }
}