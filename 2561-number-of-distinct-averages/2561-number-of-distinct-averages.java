class Solution {
    public int distinctAverages(int[] nums) {
        int[] arr =  new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        Set<Double> set = new HashSet<>();
        int i=0, len= 100;
        while(i<=len){
            if(arr[i]!=0 && arr[len]!=0){
                double sum = (i+len);
                double avg = sum/2;
                set.add(avg);
                arr[i]-=1;
                arr[len]-=1;
            }
            else if(arr[i]==0) i++;
            else len--;

        }
        return set.size();
    }
}