class Solution {
    public int smallestIndex(int[] nums) {
        int num =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                if(i==nums[i]){
                    return i;
                }
            }
            else{
                num = sumOf(nums[i]);
                if(i==num){
                    return i;
                }
            }
        }
        return -1;
    }
    public int sumOf(int num){
        int sum =0;
        while(num>0){
            int rem = num%10;
            sum += rem;
            num/=10;
        }
        return sum;
    }
}