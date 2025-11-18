class Solution {
    public int sumOfUnique(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int sum=0;
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue()==1){
        //         sum+=entry.getKey();
        //     }
        // }
        int[] arr = new int[101];
        for(int i :nums){
            arr[i]+=1;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(arr[i]==1) sum+=i;
        }
        return sum;
    }
}