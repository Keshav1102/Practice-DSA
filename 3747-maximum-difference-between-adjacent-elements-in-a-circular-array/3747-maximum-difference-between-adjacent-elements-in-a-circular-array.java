class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len-1;i++){
            arr[i] = Math.abs(nums[i]-nums[i+1]);
            if(arr[i]>max){
                max = arr[i];
            }
        }
        arr[len-1] = Math.abs(nums[len-1]-nums[0]);
        if(arr[len-1]>max){
            max = arr[len-1];
        }
        return max;
    }
}