class Solution {
    public int triangularSum(int[] nums) {
        int len = nums.length;
        if(len==1){
            return nums[0];
        }
        int[] arr = new int[len-1];
        for(int i=0;i<len-1;i++){
            arr[i] = (nums[i]+nums[i+1])%10;
        }
        return triangularSum(arr);
    }
}