class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int i=0,j=0,len=nums.length;
        while(i<len){
            if(j==len){
                count = Math.max(count,j-i);break;
            }
            if(nums[j]==0){
                count = Math.max(count,j-i);
                i=j+1;
            }
            j++;
        }
        return count;
    }
}