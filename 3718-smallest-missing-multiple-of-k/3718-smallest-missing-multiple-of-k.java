class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i:nums){
            boolean isMul = false;
            if(i%k==0){
                isMul = true;
            }
            map.put(i,isMul);
        }int i=1;
        while(true){
            int x = k*i++;
            if(!map.containsKey(x)) return x;
        }
        
    }
}