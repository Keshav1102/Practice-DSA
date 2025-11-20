class Solution {
    public int[] shuffle(int[] nums, int n) {
        // if(n<4) return nums;
        int[] arr = new int[n*2];
        int x = n,a=0;
        for(int i=0;i<n*2;i+=2){
            arr[i] = nums[a++];
            arr[i+1] = nums[x++];
        }
        return arr;
    }
}