class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(i>max) max = i;
            if(i<min) min = i;
            set.add(i);
        }
        while(min<max){
            if(!set.contains(min)){
                list.add(min);
            }
            min+=1;
        }
        
        return list;


    }
}